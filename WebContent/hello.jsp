<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>页面</title>
</head>
<body>
	
	SP表达式：<%="hello world" %>
<br>
<%
String str="hello world";
out.println(str);

%>
<br>
<br>
<a href="<%= request.getContextPath() %>/index.jsp">index.jsp</a>
</body>
</html>