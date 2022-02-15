<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculation Total</title>

<style>
	
	body {
		
		background-color: skyblue;
	
	}

</style>
</head>
<body>

	<p>
	Total is: ${userTotal.getTotal()}
	</p>
	
	<a href="index.jsp">Add more numbers!</a>

</body>
</html>