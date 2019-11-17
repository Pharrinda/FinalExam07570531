package com.example.finalexam07570531;

public class Auth {
    private  static final String Username = "dear";
    private  static final String PASSWORD = "123456";

    private String my_Username ;
    private String my_Password ;

    public Auth(String email, String password) {
        this.my_Username = email;
        this.my_Password = password;
    }

    public boolean check()
    {
        if(my_Username.equals(Username)&& my_Password.equals(PASSWORD)){
            return true ;
        } else {
            return false ;
        }
    }
}
