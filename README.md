<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [VSCode 指南](#vscode-%E6%8C%87%E5%8D%97)
    - [安裝](#%E5%AE%89%E8%A3%9D)
    - [UI](#ui)
        - [編輯器](#%E7%B7%A8%E8%BC%AF%E5%99%A8)
            - [並排編輯(Side by side editing)](#%E4%B8%A6%E6%8E%92%E7%B7%A8%E8%BC%AFside-by-side-editing)
            - [Minimap - 程式碼大綱](#minimap---%E7%A8%8B%E5%BC%8F%E7%A2%BC%E5%A4%A7%E7%B6%B1)
            - [縮排指南](#%E7%B8%AE%E6%8E%92%E6%8C%87%E5%8D%97)
        - [瀏覽器](#%E7%80%8F%E8%A6%BD%E5%99%A8)
            - [目錄](#%E7%9B%AE%E9%8C%84)
        - [大綱](#%E5%A4%A7%E7%B6%B1)
        - [開啟中的編輯器](#%E9%96%8B%E5%95%9F%E4%B8%AD%E7%9A%84%E7%B7%A8%E8%BC%AF%E5%99%A8)
        - [Views](#views)
            - [Activity Bar](#activity-bar)
        - [指令選擇器(Command Palette)](#%E6%8C%87%E4%BB%A4%E9%81%B8%E6%93%87%E5%99%A8command-palette)
        - [設定](#%E8%A8%AD%E5%AE%9A)
            - [Zen Mode](#zen-mode)
        - [Grid editor layout](#grid-editor-layout)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

# VSCode 指南

## 安裝

支援 macOS、Linux、Windows，版控預設支援 Git

- 下載處 [Download Visual Studio Code - Mac, Linux, Windows](https://code.visualstudio.com/Download)
- 詳細安裝指南 [Setting up Visual Studio Code](https://code.visualstudio.com/docs/setup/setup-overview)
  - 推薦選擇 `Open with Code`
  - 使用 Mac 的朋友可以在 Finder 加上 [sozercan/OpenInCode](https://github.com/sozercan/OpenInCode)
- 每周嘗鮮版 [Download Visual Studio Code Insiders](https://code.visualstudio.com/insiders/)

<details>
  <summary>UI</summary>
    
## UI

![Interview Overview](/images/interface-overview.png)

- 編輯器
- 側邊攔
- 狀態列
- 活動列
- 面板

### 編輯器

#### 並排編輯(Side by side editing)

- 開啟檔案 `Ctrl+P` + (`Ctrl+Click` or `Ctrl+Enter`)
- 分割視窗 `Ctrl+\` 或檔案拉至上、下、左、右方
- 切換視窗 `Ctrl+1, 2, 3, 4`

![Side by side editing](/images/side-bys-ide-editing.gif)

#### Minimap - 程式碼大綱

讓你俯瞰程式碼，如果覺得礙眼可以去調整 `editor.minimap.side` 或 `editor.minimap.enabled`

#### 縮排指南

如果覺得礙眼可以去調整 `editor.renderIndentGuides`

### 瀏覽器

#### 目錄

- 新增檔案
- 新增資料夾
- 重新整理
- 摺疊資料夾
- terminal 開啟目錄
- 比對檔案
- 複製路徑

### 大綱

可調整排序

### 開啟中的編輯器

編輯器行為，有活動才會保留

1. 變更檔案
2. 雙擊
3. 開啟外部檔案

如果覺得不喜歡可以去調整 `workbench.editor.enablePreview`

### Views

- 搜尋
- 版控
- Debug
- 套件
- 自訂 View

快速開啟: `Ctrl+Q`(View: Open View)

#### Activity Bar

- 可以拖曳排序 View
- 右鍵點擊，可以選擇、顯示或隱藏 View

### 指令選擇器(Command Palette)

你想的到、想不到的指令，他都有 `Ctrl+Shift+P`

- 開啟檔案 `Ctrl+P`
- 開啟中的檔案 `Ctrl+Shift+Tab`
- 至特定符號 `Ctrl+Shift+O`
- 至某一行 `Ctrl+G`
- 輸入 `?` 會告知你所有可以執行的指令

### 設定

1. 全域
1. 工作區

- Windows: `File > Preferences > Settings`
- Mac: `Code > Preferences > Settings`

#### Zen Mode

專心 coding 的好幫手

### Grid editor layout

自由搭配 `View > Editor Layout`

</details>
