/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author abhishek tiwari
 */
public class connectionprovider {
    public static Connection conget(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
            return conn;
            
        } catch(Exception e){
         return null;   
        }
        
    }
    
}
