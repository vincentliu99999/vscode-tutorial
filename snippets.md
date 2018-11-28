# Snippet

產生器: [snippet generator](https://snippet-generator.app/)

- 名稱
- prefix
- body
  - Tabstops: 游標停留位置 `$1, $2...`, `$0` 為最後停留位置
  - Placeholders: 取名
- description

## sample

假設這是很常用的一段程式碼

```javascript
const two = ['two', '2', '二', '🐰'];
for (const element of two) {
    console.log(element);
}
```