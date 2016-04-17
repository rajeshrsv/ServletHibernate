<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Servlet Example</title>
</head>
<body>
	<form action="MyServlet">

		<table>
			<tr>
				<td><label>User name</label></td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="Send"></td>
			</tr>
		</table>
	</form>
</body>
</html>