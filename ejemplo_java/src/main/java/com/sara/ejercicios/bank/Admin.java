package com.sara.ejercicios.bank;

public class Admin extends User{
    //private string username, password;
    private String[] permissions;

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    public String showPermissions() {
        var concat = "";
        for (String item : permissions) {
            concat += item + ","
        }
        return concat;
    }


    @Override
    public String showInfo() {
        return showInfo() + "\nPermisos: " +showPermissions();
    }
}
