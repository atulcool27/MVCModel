<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blinddate Login</title>
</head>
<body>

<form action="Blindloginserv" method="post" >
username<br>
<input type="text" name="username">
<br>password<br>
<input type="password" name="password">
<br> <br>
<input type="submit" value="login">

</form>
${msg} 
</body>
</html>