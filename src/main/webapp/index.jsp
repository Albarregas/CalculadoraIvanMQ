<%-- 
    Document   : index
    Created on : 10-oct-2018, 20:01:21
    Author     : Iván
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@include file="/INC/cabecera.inc"%>
        <form method="POST" action="/controlador">
            <div align="center" style="margin-top:10px ">
                <label for="Valor1">Valor1: </label>
                <input id="Valor1" type="number" name="Valor1" value="" placeholder="Valor 1"/>
            </div>
            <div align="center" style="margin-top:10px ">
                <label for="Valor2">Valor2: </label>
                <input id="Valor2" type="number" name="Valor2" value="" placeholder="Valor 2"/> 
            </div>
            <div align="center" style="margin-top:10px ">
                <input type="radio" name="Enviar" value="Sumar">Sumar</input>
                <input type="radio" name="Enviar" value="Restar">Restar</input>
                <input type="radio" name="Enviar" value="Multiplicar">Multiplicar</input>
                <input type="radio" name="Enviar" value="Dividir">Dividir</input>
            </div>
            <div align="center" style="margin: 10px">
                <input type="submit" name="Operar" value="Enviar">
                
            </div>
            <%@include file="/INC/pie.inc" %>
        </form>
        
    </body>
</html>
