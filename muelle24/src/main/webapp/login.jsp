<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page import='java.sql.*' %>
<%@ page import='javax.sql.*' %>
<%@ page import='javax.naming.*' %>
<%@ page import='muelle24.connection.*'%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Tomcat Server Datasource Example</title>
</head>
<body>
<%
Connection conn = ConnectionFactory.getConnection();
Statement stmt = conn.createStatement() ;
String query = "select * from user;" ;
ResultSet rs = stmt.executeQuery(query) ;
while (rs.next()) {
    %>
    	<span><%= rs.getInt(1) + " " + rs.getString(2) + " " + "<br />" %></span>
    
    <%
}


%> 
</body>
</html>