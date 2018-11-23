# VSCode 指南

## 安裝

支援 macOS、Linux、Windows，版控預設支援 Git

- 下載處 [Download Visual Studio Code - Mac, Linux, Windows](https://code.visualstudio.com/Download)
- 詳細安裝指南 [Setting up Visual Studio Code](https://code.visualstudio.com/docs/setup/setup-overview)
- 每周嘗鮮版 [Download Visual Studio Code Insiders](https://code.visualstudio.com/insiders/)

## UI

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
- 要多少有多少 `Ctrl+Click`

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
1. 雙擊
1. 開啟外部檔案

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

Windows: `File > Preferences > Settings`
Mac: `Code > Preferences > Settings`

#### Zen Mode

專心 coding 的好幫手

### Grid editor layout

自由搭配 `View > Editor Layout`