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
public class select {
    public static ResultSet getData(String query){
        Connection conn=null;
        Statement st=null;
        ResultSet  rs=null;
        try{
            conn=connectionprovider.conget();
            st=conn.createStatement();
            rs=st.executeQuery(query);
            return rs;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
