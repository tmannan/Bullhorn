<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
 <form class="form-adduser" method="post" action="AddUserServlet">
 <h2 class="form-adduser-heading">${message}Add User</h2>
 <label for="inputEmail" class="sr-only">Email address</label>
 <input name="email" type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
 <label for="inputPassword" class="sr-only">Password</label>
 <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required>
 <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
 </form>
 </div> <!-- /container -->

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>