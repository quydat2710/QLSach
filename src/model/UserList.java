/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class UserList {
    List<user> ls = new ArrayList<>();

    public UserList() {
        ls.add(new user("admin","cntt@123"));
        ls.add(new user("quydat","cntt@123"));
        ls.add(new user("duchoang","cntt@123"));
        ls.add(new user("diemquynh","cntt@123"));
        ls.add(new user("tuananh","cntt@123"));
        ls.add(new user("vanmanh","cntt@123"));
    }
    
    public boolean checkLogin(String username, String password){
        for(user u : ls){
            if(u.getUserName().equals(username) 
                    && u.getPassword().equals(password))
            {
                return true;
            }   
        }
        return false;
    }
    
}
