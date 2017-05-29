package com.stephanieconnor.passwordvalidator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class testPassword {

    @Test
    public void tpassword() throws Exception {

        Password p = new Password();
        p.setPassword("thisisatest");

        boolean expected = true;
        boolean actual = p.notPassword();

        assertEquals(expected, actual);
    }

    public void tLength(){

        Password p = new Password();
        p.setPassword("thisisatest");

        boolean expected = true;
        boolean actual = p.length();

        assertEquals(expected, actual);
    }

    public void tUpper(){

        Password p = new Password();
        p.setPassword("thisisaTest");

        boolean expected = true;
        boolean actual = p.uppercase();

        assertEquals(expected, actual);
    }

    public void tDigit(){

        Password p = new Password();
        p.setPassword("thisisaTest1");

        boolean expected = true;
        boolean actual = p.digit();

        assertEquals(expected, actual);
    }

    public void tSpecial(){

        Password p = new Password();
        p.setPassword("thisi[saTest");

        boolean expected = true;
        boolean actual = p.special();

        assertEquals(expected, actual);
    }
}