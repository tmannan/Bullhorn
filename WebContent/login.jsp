<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>

<form action="LoginServlet" method="post">
  Enter Your Email<br>
  <input type="text" name="email" id="email" value = ""></input>
  <br>
  Enter Your Password<br>
  <input type="text" name="password" id="password" value = ""></input>
  <input type="hidden" name="action" id="action" value = "login"></input>
  <br><br>
  <input type="submit" value="Submit" ></input>
</form> 

</body>
</html>