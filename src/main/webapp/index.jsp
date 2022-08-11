<%--
  Created by IntelliJ IDEA.
  User: Luis Nuñez
  Date: 10/08/2022
  Time: 1:36 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>ejercicio formulario</title>
    <link type="text/css"  rel="stylesheet" href="Css/styles.css">
    <script type="text/javascript" src="Script/funciones.js"></script>
</head>
  <body>
      <%-- onsubmit mandara a llamar una funcion de javaScript la cual estara definida dentor del archivo
      de funciones --%>
     <form name="form1" action="ServletFormulario" method="post" onsubmit="return validarForma(this)">
         <input type="hidden" name="oculto" value="valorOculto">
         <table width="200" id="enfacis-columna">
             <caption>
                 Formulario registro de datos
             </caption>
             <tr>
                 <td class="columna">
                     Usuario: (*)
                 </td>
                 <td >
                     <input type="text" class="default" name="usuario"value="escribir usuario" onfocus="this.select()"/>
                 </td>
             </tr>
             <tr>
                 <td class="columna">
                    Password: (*)
                 </td>
                 <td>
                     <input type="password" class="default" name="password" onfocus="this.select()"/>
                 </td>

             </tr>
             <tr>
                 <td class="columna">
                    Tecnologias: (*)
                 </td>
                 <td>
                     Java <input type="checkbox"name="lenguaje" value="java">
                     &nbsp; &nbsp; &nbsp;
                     .Net <input type="checkbox"name="lenguaje" value="net">
                     &nbsp; &nbsp; &nbsp;
                     PHP <input type="checkbox"name="lenguaje" value="php">
                 </td>
             </tr>
             <tr>
                 <td class="columna">
                     Genero: (*)
                 </td>
                 <td>
                     Hombre<input type="radio"name="genero" value="H"/>
                     &nbsp; &nbsp; &nbsp;
                     Mujer<input type="radio"name="genero" value="M"/>
                 </td>
             </tr>

             <tr>
                 <td class="columna">
                     Ocupacion: (*)
                 </td>
                 <td>
                     <select name="ocupacion" class="default">
                         <option value="">Selecionar</option>
                         <option value="1">Profesor</option>
                         <option value="2">Bombero</option>
                         <option value="3">Policia</option>
                     </select>
                 </td>

             </tr>

             <tr>
                 <td class="columna">
                     Musica favorita:
                 </td>
                 <td>
                     <select name="musica" multiple class="default">
                         <option name="opc" value="rock">Rock</option>
                         <option name="opc" value="coutry">Coutry</option>
                         <option name="opc" value="gospel">Gospel</option>
                     </select>
                 </td>
             </tr>

             <tr>
                 <td class="columna">
                     Comentarios:
                 </td>
                 <td>
                    <textarea name="comentarios" cols="30" rows="2" class="default" onfocus="this.select()">
                        Escribir comentario
                    </textarea>
                 </td>

             </tr>
             <tr style="text-align: center">
                 <td>
                     <input type="reset" value="Limpiar" class="default"/>
                 </td>
                 <td>
                     <input type="submit" value="Enviar" class="default"/>
                 </td>

             </tr>


         </table>
     </form>
   </body>
</html>
