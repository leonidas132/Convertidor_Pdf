// validacion de los campos
function validarForma(forma) {

    // se valida si el campo esta  con la info correcta
    var usuario = forma.usuario;
    if (usuario.values == "" || usuario.value == "escribir usuario") {
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;

    }

    var password = forma.password;
    if(password.value =="" || password.value.length <3){
        alert("El password debe ser mayor de tres caracteres")
        password.focus();
        password.select();
        return false;
    }

    var tecnologias = forma.lenguaje;
    var checkSelec = false;

    for (var  i = 0; i < tecnologias.length; i++) {
        if(tecnologias[i].checked){
            checkSelec = true;
        }
    }
    if(!checkSelec){
        alert("Debe selecionar una tecnologia");
        return false;
    }

    var genero = forma.genero;
    var radioSelec = false;

    for (let i = 0; i <genero.length ; i++) {
        if(genero[i].checked){
            radioSelec =true;
        }
    }
    if(!radioSelec){
        alert("Debe selecionar un genero");
        return false;
    }

    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe selecionar una ocupacion");
        return false;
    }
    // hasta este punto el formulario es validado y si cumple  entoces retornaremos true
    alert("formulario validado")
    return true;


}