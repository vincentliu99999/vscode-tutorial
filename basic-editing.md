# 基礎編輯

善用快捷鍵

## 游標選擇

- 下一個 `Ctrl+D`
- 全部 `Ctrl+Shift+L`
- 擴展選取 `Shift+Alt+Right`

## Column (box) selection

`Shift+Alt+滑鼠`

## Hot Exit

VS Code 會自動記住未儲存的檔案

## Save / Auto Save

預設不自動儲存

省下 `Ctrl+S` 的時間

```json
"files.autoSave": "onFocusChange"
```

## 搜尋及取代

搜尋 `Ctrl+Shift+F`

支援 regular expression、排除清單

取代 `Ctrl+Shift+F`

## IntelliSense

自動補完，預設支援 JavaScript, JSON, HTML, CSS, SCSS, Less, C# and TypeScript

## Formatting

預設支援 JavaScript, TypeScript, JSON, and HTML

- 全部 `Shift+Alt+F`
- 選取範圍 `Ctrl+K Ctrl+F`

## Folding

全部範圍摺疊或展開 `Shift + Click`

## Indentation

預設使用 4 個空白，並會自動偵測

```json
  "editor.detectIndentation": false,
  "editor.insertSpaces": true,
  "editor.tabSize": 4,
```

## File encoding support

預設 `utf8`