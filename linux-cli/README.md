# Linux Command Line

- Linux terminal(blackbox)
- file system 99%
- automate task with schedule bash script
- install third-party software
- quiz, cheatsheet, 免 take notes

## Linux terminal

<<<<<<< HEAD
### Terminal
=======
### First Command
>>>>>>> e597cad (add First Command, Terminals, Commands and Shells (Oh My!))

next: 結構化

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

### Understanding Command Structure

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
