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
public class Insertupdatedelete {
    public static void setData(String Query,String msg){
        Connection conn=null;
        Statement st=null;
        try{
            conn=connectionprovider.conget();
            st=conn.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            
             try{
             }catch(Exception e){
        }
        }
        
    }
    
}
