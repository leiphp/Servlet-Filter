<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userName=request.getParameter("userName");
	String password =request.getParameter("password");
	if(userName!=null&&password!=null){
		session.setAttribute("userName",userName);
		response.setHeader("refresh","2;URL=welcome.jsp");
	}
%>