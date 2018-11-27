<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [Interactive Playground](#interactive-playground)
  - [多游標編輯](#%E5%A4%9A%E6%B8%B8%E6%A8%99%E7%B7%A8%E8%BC%AF)
  - [IntelliSense](#intellisense)
  - [Line Actions](#line-actions)
  - [Rename Refactoring](#rename-refactoring)
  - [Refactoring via Extraction](#refactoring-via-extraction)
  - [格式化(Formatting)](#%E6%A0%BC%E5%BC%8F%E5%8C%96formatting)
  - [程式碼摺疊(Code Folding)](#%E7%A8%8B%E5%BC%8F%E7%A2%BC%E6%91%BA%E7%96%8Acode-folding)
  - [Errors and Warnings](#errors-and-warnings)
  - [Snippets](#snippets)
  - [Emmet](#emmet)
  - [JavaScript Type Checking](#javascript-type-checking)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

# Interactive Playground

Command: `Help:Welcome` or `Help:Interactive Playground`

## 多游標編輯

- 區塊選取(Box Selection) `Ctrl+Shift+Alt+DownArrow, Ctrl+Shift+Alt+RightArrow, Ctrl+Shift+Alt+UpArrow, Ctrl+Shift+Alt+LeftArrow`
- 游標選取 `Ctrl+Alt+UpArrow, Ctrl+Alt+DownArrow` 或 `Alt+Click`
- 選取全部 `Ctrl+Shift+L`

## IntelliSense

## Line Actions

- 複製 `Shift+Alt+DownArrow` or `Shift+Alt+UpArrow`
- 移動 `Alt+UpArrow` or `Alt+DownArrow`
- 刪除 `Ctrl+Shift+K`

## Rename Refactoring

選取變數名稱 `F2`

## Refactoring via Extraction

## 格式化(Formatting)

- 全部: `Shift+Alt+F`
- 選取: `Ctrl+K Ctrl+F`

## 程式碼摺疊(Code Folding)

- 摺疊: `Ctrl+Shift+[`
- 展開: `Ctrl+Shift+]`
- 摺疊全部: `Ctrl+K Ctrl+0`
- 展開全部: `Ctrl+K Ctrl+J`

## Errors and Warnings

`F8`

## Snippets

內建 or 自訂

## Emmet

- 設定 `emmet.triggerExpansionOnTab`
- 輸入類 CSS 語法，快速產生 HTML，[Cheat Sheet](https://docs.emmet.io/cheat-sheet/)

## JavaScript Type Checking

- 設定 `"javascript.implicitProjectConfig.checkJs": true`
- JS程式碼開頭加 `// @ts-check`