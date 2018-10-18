<%-- 
    Document   : resultado
    Created on : 11-oct-2018, 20:00:11
    Author     : Iván
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <%@include file="/INC/cabecera.inc"%>
            <h1>
                <%
                    String clave = "KEY";

                %>
                <%=request.getSession().getAttribute(clave)%>
            </h1>

            <div align="center" style="border-bottom:  5px black double;margin: 100px;margin-top: 10px">
                <a href="<%= request.getContextPath() %>">Volver</a>
            </div>


    </body>
</html>
