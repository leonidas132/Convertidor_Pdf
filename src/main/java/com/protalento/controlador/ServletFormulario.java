package com.protalento.controlador;

import com.protalento.entidad.Usuario;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletFormulario", value = "/ServletFormulario")
public class ServletFormulario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario =request.getParameter("usuario");
       // System.out.println(usuario);
        String password=request.getParameter("password");
    //    System.out.println(password);
        String tecnologias [] = request.getParameterValues("lenguaje") ;  //getParameterValues() permite obtener varios valores
   //     System.out.println(tecnologias);
        String genero   = request.getParameter("genero");
       // System.out.println(genero);
        String ocupacion  = request.getParameter("ocupacion");
      //  System.out.println(ocupacion);
        String musica[] = request.getParameterValues("musica");
       // System.out.println(musica);
        String comentario = request.getParameter("comentarios");
     //   System.out.println(comentario);

        request.setAttribute("nombre",request.getParameter("usuario"));
        request.setAttribute("clave",request.getParameter("password"));



        String tec = "";
        for ( String resultado: tecnologias) {
            System.out.println(resultado);
            tec += resultado +",";
        }
        System.out.println(tec);


        // cambiando el valor del numero a la profecion
        if(ocupacion.equals("1")){
            ocupacion="profesor";

        } else if (ocupacion.equals("2")) {
            ocupacion="Bombero";
        } else if (ocupacion.equals("3")) {
            ocupacion="Policia";
        }
        request.setAttribute("profecion",ocupacion);


        String resul="" ;
        if(musica != null){
            for (String resultadoMusica:musica) {
                System.out.println(resultadoMusica);
                resul=resultadoMusica;
            }
        }else{
            System.out.println("No proporciono un genero de musica favorito");
        }

        Usuario usuario1 = new Usuario(usuario,password,tec,genero,ocupacion,resul,comentario);
        System.out.println(usuario1);
        if (usuario1 != null){
            request.getRequestDispatcher("menu.jsp").forward(request,response);
        }

    }
}
