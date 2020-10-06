<%-- 
    Document   : newjspindex
    Created on : 29-09-2020, 07:30:23 PM
    Author     : Ivan Nina
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
    </head>
    <body>
        <h1>  Registrar datos de una persona</h1>
        <p>por favor escriba su nombre,sexo,telefo y correo</p>
    <fom action ="ServletControlador" method="POST">
        <table>
            <tr>
                <td>Nombre</td><td><input type="text" name="nombre"value=""/></td>
            </tr>
            <tr>
                <td>sexo</td><td><input type="texto" name="sexo"value=""/></td>
            </tr>
            <tr>
                <td>telefono</td><td><input type="texto" name="telefono"value=""/></td>
            </tr>
            <tr>
                <td>correo</td><td><input type="texto" name="correo"value=""/></td>
            </tr>
            </tr>
            <tr><td></td><td><input type="submit" value="Enviar"/></td></tr>
        </table>
    </fom>
    </body>
</html>
