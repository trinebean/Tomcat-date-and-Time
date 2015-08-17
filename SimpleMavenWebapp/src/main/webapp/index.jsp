<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.celestial.simplemavenwebapp.TimeAndDateHandler"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <jsp:useBean id="tadBean" class="com.celestial.simplemavenwebapp.TimeAndDateHandler" scope="session"></jsp:useBean>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1><%=tadBean.getDate()%> - <%=tadBean.getTime()%></h1>
    </body>
</html>
