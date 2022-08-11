package com.protalento.entidad;

public class Usuario {
    private String user;
    private String password;
    private String tecnologias;
    private String genero;

    private String ocupacion;
    private String musica;
    private String comentarios;

   // public Usuario() {
    // }


    public Usuario(String user, String password, String tecnologias, String genero, String ocupacion, String musica, String comentarios) {
        this.user = user;
        this.password = password;
        this.tecnologias = tecnologias;
        this.genero = genero;
        this.ocupacion = ocupacion;
        this.musica = musica;
        this.comentarios = comentarios;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String usuario) {
        this.user = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "usuario: " + user +
                " password: " + password +
                " tecnologias: " + tecnologias+
                " genero: " + genero +
                " ocupacion: " + ocupacion +
                " musica: " + musica +
                " comentarios: " + comentarios;
    }

}
