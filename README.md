# springboot gmail

### gmail test

`spring.mail.username=전송자이메일`

`spring.mail.password=전송자이메일비번`

gmail 보안수준 낮추기
https://myaccount.google.com/lesssecureapps

`POST 요청 
http://localhost:8080/mail`


```JSON
{
    "sendTo": "받는자",
    "title": "제목",
    "content": "내용"
}
```