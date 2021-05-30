/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentfeedbacksystem;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author roneetmichael
 */
public class DBConnection {
    
    public DBConnection()
    {
        
    }
    public static Connection getConnection() 
    {  
         Connection con=null;
         try {
             Class.forName("com.mysql.jdbc.Driver");
               System.out.println("loaded");
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","studentfeedback");
              System.out.println("connected");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
         }
     
      return con; 
    }
    public static void main(String[] args) {
        
        Connection con = DBConnection.getConnection();
        System.out.println("DB Connected successfully !!");
        
         Statement st;
      try {
            con=DBConnection.getConnection();
            st=con.createStatement();
            
            ResultSet rst =st.executeQuery("SELECT * FROM login ");
            while(rst.next()){
                String id = rst.getString("id");
                String pwd =rst.getString("password");
                System.out.println("DB info:  id:" + id + ",password:" + pwd);
                
            }
            
            }
      catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        
        } 
    }
}