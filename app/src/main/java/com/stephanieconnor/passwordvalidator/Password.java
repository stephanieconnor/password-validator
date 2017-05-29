package com.stephanieconnor.passwordvalidator;

/**
 * Created by stephanieconnor on 2017-05-28.
 */

public class Password {

    private String password;

    //constructor
    public Password(String p){
        password = p;
    }

    //set method
    public void setPassword(String p){
        password = p;
    }

    public String getPassword() {
        return password;
    }

    //method that checks that the password != "password"
    public boolean notPassword(){
        return !password.equals("password");
    }

    //method that ensures that the length is greater than 8 char
    public boolean length(){
        return password.length() > 8;
    }

    //method that ensures that there is at least one Uppercase letter
    public boolean uppercase(){

        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }

        return false;

    }

    //method that ensures that there is at least one digit
    public boolean digit(){

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                return true;

        }

        return false;
    }

    public boolean special() {

        //created a char array with all the special chars
        char[] special;
        special = new char[] { '"', ' ', '!', '#', '$', '%', '&', '(', ')',
                '*', '+' , ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', ']',
                '^', '_' , '`', '{', '|', '}', '~'};
        char[] charArray = password.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < special.length; j++ )
                if (charArray[i] == special[j]) {
                    return true;
                }
        }

        return false;

    }
}
