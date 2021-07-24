# Linux Command Line

- Linux terminal(blackbox)
- file system 99%
- automate task with schedule bash script
- install third-party software
- quiz, cheatsheet, 免 take notes

## Linux terminal

### Terminal 簡介

```shell
echo

cal
cal 2021 # input
cal -y # option

date

clear # ctrl + l

# arrow up
history
# !<1...N>
!1
!! # 最新跑的 command
history -c;history -w # 清空 history

# exit terminal
exit # ctrl + d
```

### Terminals, Commands and Shells (Oh My!)

- Command = 文字, case-sensitive
- Command + Enter = Shell 解譯
  - gift -> English -> 禮物
  - gift - German -> poison
  - smoking - English -> 抽菸
  - smoking - French -> 西裝
- shell type
  - bash 最常見, Linux, Ubuntu
- terminal: shell 之窗

### Command 結構

- `commandName –options arguments(input)`
- commandName 必須存在於 search path
- input(operand) 非必要, case-sensitive
- option 通常會有長格式 `--option value`, case-sensitive
- option input 部分支援 `-option=value`

```shell
which <commandName>

# commandName 會從 $PATH 找
echo $PATH
# /usr/local/bin:/usr/bin:/bin:/usr/sbin
which cal
which echo
which which

# input
cal 2021
cal 12 2021

echo "hello"

# options
cal -y
date
date -u
# ex: date -a -b -c = date -abc

# long format
# date --a --b --c

# option input
cal -A 1 12 2021
cal -B 1 12 2021
cal -A 1 -B 1 12 2021
# cal -A=1 -B=1 12 2021
```

### Linux Manual

免記憶 1, 5, 8 最常用

1. User Commands 免 root 權限, 日常使用
2. System Calls application 呼叫 kernel, 很少使用
3. C Library Functions 很少使用
4. Devices and Special Files 裝置, 如: USB
5. File Formats and Conventions 檔案格式, 設定, 客製化
6. Games
7. Miscellaneous
8. System administration tools and Daemons 可能需要 root 權限

### 閱讀 Manual

- 搜尋新指令
  - name
  - synopsis 如何使用 ex: `which [-as] program ...`
  - description
  - `[something]`, `a | b` 選則性
  - `<something>` 必要性
  - `...` 無限個
- 學習如何使用
- [Useful Documentation](https://support.ca.com/cadocs/0/CA%20ARCserve%20%20Backup%2015-ENU/Bookshelf_Files/HTML/CMD_Ref/index.htm?toc.htm?command_line_syntax_characters.htm)

```shell
man -k which # search which
man 1 which

man which
which date cal
which -a date cal
```

### 練習 Manual

長格式 option: `--word1-word2`

```shell
man -k "list directory contents"
man ls

ls
ls -l
ls -lh

cd
help cd
```

### Command Input + Output

1. input - `standard` input(0)
    - 並非所有的 command 都有, ex: echo
2. input - command argument
    - 不可利用 pipeline 串連 command
3. output - `standard` output(1)
    - 預設輸出至 terminal
    - ex: `cat`
4. output - `standard` error(2)

- redirection: data stream 可輸出至不同 location
- piping: `standard` output redirect 至 `standard` input

```shell
# standard output stream
data

# standard error stream
date dsdjbdsjfbn

# input
cat
cal 7 2021

# command line argument
# A: 1, B: 1
# cal: 7, 2021
cal -A 1 -B 1 7 2021
```

### Redirection: standard output

ex cat

- `>` 會清空(truncate)後才放入
- `>>` 不清空，append 放入

```shell
# standard output 放到 output.txt
cat 1> output.txt
# Linux is amazing

cat > output.txt
# wow!

cat >> output.txt
# Linux is amazing
```

### Redirection: standard input + standard error

- standard error 通常會使用 append 方式(`>>`)
  - `cat 2> error.txt`
  - `cat 2>> error.txt`
- standard input from file
  - `cat 0< input.txt`
  - `cat < input.txt`
- redirect to other terminal
  - `tty` 取得 terminal 檔案位置, ex: `/dev/ttys019`
- 參考資料
  - [BashGuide/InputAndOutput - Greg's Wiki](http://mywiki.wooledge.org/BashGuide/InputAndOutput?#Redirection)
  - [Redirections (Bash Reference Manual)](https://www.gnu.org/software/bash/manual/html_node/Redirections.html)

```shell
# standard error
cat -k bla 2> error.txt
cat -k bla 2>> error.txt

cat 1>> output.txt 2>> error.txt
cat >> output.txt 2>> error.txt
# Linux is Awesome!

# standard input
cat > input.txt
# Hello World!
cat < input.txt

cat < input.txt > hello.txt

# redirect to terminal
tty
cat < input.txt > /dev/ttys019
```
