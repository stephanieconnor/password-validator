package com.stephanieconnor.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PasswordValidation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_validation);
    }

    //goes through the methods to determine the number of tests passed
    public int isValid(String p){

        int test = 0;

        if (notPassword(p))
            test++;
        if(length(p))
            test++;
        if(uppercase(p))
            test++;
        if(digit(p))
            test++;
        if(special(p))
            test++;

        return test;
    }



    //method that checks that the password != "password"
    public boolean notPassword(String p){
        return !p.equals("password");
    }

    //method that ensures that the length is greater than 8 char
    public boolean length(String p){
        return p.length() > 8;
    }

    //method that ensures that there is at least one Uppercase letter
    public boolean uppercase(String p){

        for (int i = 0; i < p.length(); i++){
            if (Character.isUpperCase(p.charAt(i))) {
                return true;
            }
        }

        return false;

    }

    //method that ensures that there is at least one digit
    public boolean digit(String p){

        for (int i = 0; i < p.length(); i++) {
            if (Character.isDigit(p.charAt(i)))
                return true;

        }

        return false;
    }

    public boolean special(String p) {

        //created a char array with all the special chars
        char[] special;
        special = new char[] { '"', ' ', '!', '#', '$', '%', '&', '(', ')',
                '*', '+' , ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', ']',
                '^', '_' , '`', '{', '|', '}', '~'};
        char[] charArray = p.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < special.length; j++ )
                if (charArray[i] == special[j]) {
                    return true;
                }
        }

        return false;

    }
}