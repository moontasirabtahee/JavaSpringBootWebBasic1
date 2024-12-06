<%@page language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Spring Boot First Web App</title>

</head>

<body>
<h1>Hello World!</h1>
<h2>My Name is M A Moontasir Abtahee</h2>

<h1>Basic Calculator</h1>
<form action="/add" method="get"><label for="num1">Number 1:</label><br> <input type="text" id="num1" name="num1"><br><br>
    <label for="num2">Number 2:</label><br> <input type="text" id="num2" name="num2"><br><br> <input type="submit" value="Add Number">
</form>

<h2>Hello Alien Insert Your Information</h2>
<form action = "/addAlien" method="get">
    <label for = "aid" >ID: </label><input type = "text" id = "aid" name = "aid"><br>
    <label for="aname" >Name: </label><input type = "text" id = "aname" name = "aname"><br>
    <input type="submit">
</form>

</body>

</html>