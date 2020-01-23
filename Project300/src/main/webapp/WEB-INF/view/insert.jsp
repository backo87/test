<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head></head>
<body>
<form method="post" action="/insert.do">
<table width="400" border="1">
<tr>
	<td>번 호</td><td><input type="text" name="sno"></td>
</tr>
<tr>

	<td>이 름</td><td><input type="text" name="sname"></td>
</tr>
<tr>
	<td>이메일</td><td><input type="text" name="email"></td>
</tr>
<tr>
	<td colspan=2><input type="submit" value="ok"></td>
</tr>
</table>
</form>
</body>
</html>