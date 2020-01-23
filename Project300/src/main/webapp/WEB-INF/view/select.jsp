<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<br>
<table  border=1  width=800  align="center">
 <tr><th>번호 </th><th>이름 </th> <th>이메일</th>
<c:forEach  items="${list}"  var="sch">
<tr><td><a href="delete.do?sno=${sch.sno}">${sch.sno}</a> </td>
<td> ${sch.sname} </td>
<td> ${sch.email} </td>
</tr> 
</c:forEach>
</table>
<br><br>
<form method="post" action="/search.do">
	<table width="800" border="1" align="center">
		<tr>
		<td align="right">
			<select name="sel">
				<option value="sno"> 번호</option>
				<option value="sname">이름</option>
			</select>
			<input type="text" name="value">
			<input type="submit" value="search">
		</td>
		</tr>
	</table>
</form>
</body>
</html>
