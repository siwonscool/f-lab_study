<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>로그인 페이지 입니다</h1>

<form action="/member/login" method="post">

    <label for="id">ID : </label>
    <input type="text" name="id" id="id">
    <label for="pw">pw : </label>
    <input type="password" name="pw" id="pw">

    <input type="submit" value="로그인">
</form>

</body>
</html>