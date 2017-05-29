package com.stephanieconnor.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PasswordValidation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_validation);
    }

    //method that checks that the password != "password"
    public int notPassword(String p){
        if (!p.equals("password"))
            return 1;
        else
            return 0;
    }

    //method that ensures that the length is greater than 8 char
    public int length(String p){
        if (p.length() > 8)
            return 1;
        else
            return 0;
    }

}
