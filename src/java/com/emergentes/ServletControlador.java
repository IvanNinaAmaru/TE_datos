package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan Nina
 */
@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //se reciben los parametros enviados desde formulario
        String nombre =request.getParameter("nombre");
        String[] sexo=request.getParameterValues("sexo");
        String telefono=request.getParameter("telefono");
        String correo=request.getParameter("correo");
        //crear el objeto 1
        datos obj1=new datos();
        //se coloca datos en las propiedades de obje1
        obj1.setNombre(nombre);
        obj1.setSexo(sexo);
        obj1.setTelefono(telefono);
        obj1.setCorreo(correo);
        //se adiciona el objeto 1 como atributo llamando mi encuesta
        request.setAttribute("m", obj1);
        //redirrecciona al recurso salida.jsp
        request.getRequestDispatcher("salida jsp").forward(request,response);
    }
        
    }
