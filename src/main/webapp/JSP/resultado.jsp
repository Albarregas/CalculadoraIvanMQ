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
        <form method="POST" action="/controlador.java">
            <h1>
                <%
                    String clave="KEY";
                    request.getSession().getAttribute(clave);
                    %>
            </h1>


            <%@include file="/INC/pie.inc" %>
        </form>
    </body>
</html>
