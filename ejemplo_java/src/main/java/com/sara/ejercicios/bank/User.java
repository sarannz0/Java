package com.sara.ejercicios.bank;


// Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

public class User {

    private String username;
    private int password;


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void checkPassword(String inputPassword) {
        return password.equals(password);
    }

    public void showInfo( ) {
        return "Nombre de usuario: " + username;
    }

     0.0
}

