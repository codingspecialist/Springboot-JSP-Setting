<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입페이지</h1>
<form action="/member/join" method="post">
	유저네임 : <input type="text" name="username" /> <br/>
	패스워드 : <input type="password" name="password" /> <br/>
	이메일 : <input type="email" name="email" /> <br/>
	<button type="submit">회원가입완료</button>
</form>

</body>
</html>