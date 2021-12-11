/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;


import java.sql.*;
import javax.swing.JOptionPane;



/**
 *
 * @author abhishek tiwari
 */
public class tables {
    public static void main(String [] args){
        Connection conn=null;
        Statement st=null;
        try{
            conn=connectionprovider.conget();
            st=conn.createStatement();
            st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(500),answer varchar(200),address varchar(200),status varchar(20))");
         st.executeUpdate("create table room(roomno varchar(10),roomtype varchar(200),bed varchar(200),price int,status varchar(20))");
           st.executeUpdate("create table customer(id int,name varchar(200),mobileno varchar(10),nationality varchar(200),gender varchar(50),email varchar(200),idproof varchar(200),addressed varchar(500),checkin varchar(50),roomno varchar(10),bed varchar(200),roomtype varchar(200),priceperday int(10),nodaystay int(10),totalamount varchar(200),checkout varchar(200))");
            JOptionPane.showMessageDialog(null, "tables Created successfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
             try{
                 conn.close();
                 st.close();
                 
            
        }catch(Exception e){
            
        }
            
        }
    }
}
