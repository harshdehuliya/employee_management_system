<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addEmp">
		<input type="text" placeholder="Enter username" name ="uname">
		<input type="number" placeholder="Enter userID" name ="uid">
		<input type="submit">
	</form>
	<br>
	<form action="getByID">
		<input type="number" placeholder="Enter userID" name ="uid">
		<input type="submit">
	</form>
	<br>
	<form action="getByUname">
		<input type="text" placeholder="Enter username" name ="uname">
		<input type="submit">
	</form>
	<br>
	<form action="getAllEmps">
		<input type="submit">
	</form>
	<h4>Update name BY uid</h4>
	<form action="updateByuid">
		<input type="number" placeholder="Enter userID" name ="uid">
		<input type="text" placeholder="Enter new username" name ="newuname">
		<input type="submit" value="update">
	</form>
</body>
</html>