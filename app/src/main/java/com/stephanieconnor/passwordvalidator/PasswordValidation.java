package com.stephanieconnor.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PasswordValidation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_validation);
    }

    //main method that determines if the password is valid
//    public int isValid(){
//
//        Password p = new Password();
//
//        int test = 0;
//
//        if (p.notPassword())
//            test++;
//        if(p.length())
//            test++;
//        if(p.uppercase())
//            test++;
//        if(p.digit())
//            test++;
//        if(p.special())
//            test++;
//
//        return test;
//    }




}