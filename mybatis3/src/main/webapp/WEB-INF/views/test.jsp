<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Book</h1>
	
	<ul>
		<c:forEach items="${list }" var="dto">
			<li>${dto.title } - ${dto.discount } - ${dto.author } - ${dto.publisher }</li>
		</c:forEach>
	</ul>
	
</body>
</html>