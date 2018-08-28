<%@ page language="java" contentType="text/html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginController" method="post">
<table cellspacing="4" align="center">
<tr>
<td colspan="2">LOGIN DIALOG
<font color="red" size="2">${requestScope.errorInfo}</font>
</td>
</tr>
<tr>
<td>USER NAME</td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>PASSWORD</td>
<td><input type="text" name="password"></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="SUBMIT"/>
<input type="reset" value="RESET"/>
</td>
</form>
</body>
</html>