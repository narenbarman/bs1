/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

import java.util.Arrays;

/**
 *
 * @author Nren
 */
public class authentication {
    public static Boolean usernameverify() {
        char[] lname=login.u_name.getText().toLowerCase().toCharArray();
        return Arrays.equals(lname, "demo".toCharArray());
        }
    public static Boolean passwordverify() {
        char[] password=login.Password.getPassword();   
        return Arrays.equals(password, "demo".toCharArray());
        }   

}
