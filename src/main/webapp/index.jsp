<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addition Calculator</title>
</head>
<body>

	<h1>Addition Calculator</h1>
	
	<form action="getAdditionServlet" method="post">
	First Number: 
	<input type="text" name="userNumber1" size="10">
	<br/>
	Second Number: 
	<input type="text" name="userNumber2" size="10">
	<br/>
	Third Number: 
	<input type="text" name="userNumber3" size="10">
	<br/>
	<input type="submit" value="Add!">
	</form>

</body>
</html>