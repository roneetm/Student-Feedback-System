/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentfeedbacksystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author roneetmichael
 */
public class TeacherWelcomeScreen extends javax.swing.JDialog {

    /**
     * Creates new form TeacherWelcomeScreen
     */
    public TeacherWelcomeScreen() {
        //super(parent, modal);
        initComponents();
        try{    
            Connection con = DBConnection.getConnection();
            Statement stm = con.createStatement();
                        
            String ai = "SELECT AVG(question_1), AVG(question_2), AVG(question_3), AVG(question_4), AVG(question_5) from feedback_info where course_name ='Advanced Programming'";
            
            ResultSet rs = stm.executeQuery(ai);
            
            while(rs.next())
            {
            float q1 = rs.getFloat("AVG(question_1)");
            float q2 = rs.getFloat("AVG(question_2)");
            float q3 = rs.getFloat("AVG(question_3)");
            float q4 = rs.getFloat("AVG(question_4)");
            float q5 = rs.getFloat("AVG(question_5)");
            
            ans1.setText(String.valueOf(q1));
            ans2.setText(String.valueOf(q2));
            ans3.setText(String.valueOf(q3));
            ans4.setText(String.valueOf(q4));
            ans5.setText(String.valueOf(q5));
            }
            
            // DATA FOR ARTIFICIAL INTELLIGENCE
            
            String ap = "SELECT AVG(question_1), AVG(question_2), AVG(question_3), AVG(question_4), AVG(question_5) from feedback_info where course_name ='Artificial Intelligence'";
            
            ResultSet rsai = stm.executeQuery(ap);
            
            while(rsai.next())
            {
            float aiq1 = rsai.getFloat("AVG(question_1)");
            float aiq2 = rsai.getFloat("AVG(question_2)");
            float aiq3 = rsai.getFloat("AVG(question_3)");
            float aiq4 = rsai.getFloat("AVG(question_4)");
            float aiq5 = rsai.getFloat("AVG(question_5)");
            
            ans6.setText(String.valueOf(aiq1));
            ans7.setText(String.valueOf(aiq2));
            ans8.setText(String.valueOf(aiq3));
            ans9.setText(String.valueOf(aiq4));
            ans10.setText(String.valueOf(aiq5));                     
            }
                       
            // DATA FOR MOBILE COMMUNICATION
            
            String mc = "SELECT AVG(question_1), AVG(question_2), AVG(question_3), AVG(question_4), AVG(question_5) from feedback_info where course_name ='Mobile Communication'";
            
            ResultSet rsmc = stm.executeQuery(mc);
            
            while(rsmc.next())
            {
            float mcq1 = rsmc.getFloat("AVG(question_1)");
            float mcq2 = rsmc.getFloat("AVG(question_2)");
            float mcq3 = rsmc.getFloat("AVG(question_3)");
            float mcq4 = rsmc.getFloat("AVG(question_4)");
            float mcq5 = rsmc.getFloat("AVG(question_5)");
            
            ans11.setText(String.valueOf(mcq1));
            ans12.setText(String.valueOf(mcq2));
            ans13.setText(String.valueOf(mcq3));
            ans14.setText(String.valueOf(mcq4));
            ans15.setText(String.valueOf(mcq5));                     
            }
            
            // DATA FOR Design and Analysis of Algorithms
            
            String daa = "SELECT AVG(question_1), AVG(question_2), AVG(question_3), AVG(question_4), AVG(question_5) from feedback_info where course_name ='Design and Analysis of Algorithms'";
            
            ResultSet rsdaa = stm.executeQuery(daa);
            
            while(rsdaa.next())
            {
            float daaq1 = rsdaa.getFloat("AVG(question_1)");
            float daaq2 = rsdaa.getFloat("AVG(question_2)");
            float daaq3 = rsdaa.getFloat("AVG(question_3)");
            float daaq4 = rsdaa.getFloat("AVG(question_4)");
            float daaq5 = rsdaa.getFloat("AVG(question_5)");
            
            ans16.setText(String.valueOf(daaq1));
            ans17.setText(String.valueOf(daaq2));
            ans18.setText(String.valueOf(daaq3));
            ans19.setText(String.valueOf(daaq4));
            ans20.setText(String.valueOf(daaq5));                     
            }
            
            // DATA FOR Software Testing
            
            String st = "SELECT AVG(question_1), AVG(question_2), AVG(question_3), AVG(question_4), AVG(question_5) from feedback_info where course_name ='Software Testing'";
            
            ResultSet rsst = stm.executeQuery(st);
            
            while(rsst.next())
            {
            float stq1 = rsst.getFloat("AVG(question_1)");
            float stq2 = rsst.getFloat("AVG(question_2)");
            float stq3 = rsst.getFloat("AVG(question_3)");
            float stq4 = rsst.getFloat("AVG(question_4)");
            float stq5 = rsst.getFloat("AVG(question_5)");
            
            ans21.setText(String.valueOf(stq1));
            ans22.setText(String.valueOf(stq2));
            ans23.setText(String.valueOf(stq3));
            ans24.setText(String.valueOf(stq4));
            ans25.setText(String.valueOf(stq5));                     
            }
            
            }   catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ans1 = new javax.swing.JLabel();
        ans3 = new javax.swing.JLabel();
        ans2 = new javax.swing.JLabel();
        ans4 = new javax.swing.JLabel();
        ans5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ans6 = new javax.swing.JLabel();
        ans7 = new javax.swing.JLabel();
        ans8 = new javax.swing.JLabel();
        ans9 = new javax.swing.JLabel();
        ans10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ans11 = new javax.swing.JLabel();
        ans12 = new javax.swing.JLabel();
        ans13 = new javax.swing.JLabel();
        ans14 = new javax.swing.JLabel();
        ans15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ans16 = new javax.swing.JLabel();
        ans17 = new javax.swing.JLabel();
        ans18 = new javax.swing.JLabel();
        ans19 = new javax.swing.JLabel();
        ans20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ans21 = new javax.swing.JLabel();
        ans22 = new javax.swing.JLabel();
        ans23 = new javax.swing.JLabel();
        ans24 = new javax.swing.JLabel();
        ans25 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        readcomments = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 232, 240));

        label1.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(61, 90, 254));
        label1.setText("Welcome Admin");

        jLabel1.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Here's the update about MCA class. ");

        jLabel3.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Advanced Programming");

        ans1.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans1.setForeground(new java.awt.Color(255, 51, 51));
        ans1.setText("CA5CO18");

        ans3.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans3.setForeground(new java.awt.Color(255, 51, 51));
        ans3.setText("CA5CO18");

        ans2.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans2.setForeground(new java.awt.Color(255, 51, 51));
        ans2.setText("CA5CO18");

        ans4.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans4.setForeground(new java.awt.Color(255, 51, 51));
        ans4.setText("CA5CO18");

        ans5.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans5.setForeground(new java.awt.Color(255, 51, 51));
        ans5.setText("CA5CO18");

        jLabel5.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Easy of understand");

        jLabel6.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Learning Process");

        jLabel7.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Lecture's Content");

        jLabel8.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Time Managemenent");

        jLabel9.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Total Satisfaction");

        jLabel4.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Artificial Intelligence");

        ans6.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans6.setForeground(new java.awt.Color(255, 51, 51));
        ans6.setText("CA5CO18");

        ans7.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans7.setForeground(new java.awt.Color(255, 51, 51));
        ans7.setText("CA5CO18");

        ans8.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans8.setForeground(new java.awt.Color(255, 51, 51));
        ans8.setText("CA5CO18");

        ans9.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans9.setForeground(new java.awt.Color(255, 51, 51));
        ans9.setText("CA5CO18");

        ans10.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans10.setForeground(new java.awt.Color(255, 51, 51));
        ans10.setText("CA5CO18");

        jLabel15.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Mobile Communication");

        ans11.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans11.setForeground(new java.awt.Color(255, 51, 51));
        ans11.setText("CA5CO18");

        ans12.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans12.setForeground(new java.awt.Color(255, 51, 51));
        ans12.setText("CA5CO18");

        ans13.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans13.setForeground(new java.awt.Color(255, 51, 51));
        ans13.setText("CA5CO18");

        ans14.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans14.setForeground(new java.awt.Color(255, 51, 51));
        ans14.setText("CA5CO18");

        ans15.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans15.setForeground(new java.awt.Color(255, 51, 51));
        ans15.setText("CA5CO18");

        jLabel21.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Design and Analysis of Algorithms");

        ans16.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans16.setForeground(new java.awt.Color(255, 51, 51));
        ans16.setText("CA5CO18");

        ans17.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans17.setForeground(new java.awt.Color(255, 51, 51));
        ans17.setText("CA5CO18");

        ans18.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans18.setForeground(new java.awt.Color(255, 51, 51));
        ans18.setText("CA5CO18");

        ans19.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans19.setForeground(new java.awt.Color(255, 51, 51));
        ans19.setText("CA5CO18");

        ans20.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans20.setForeground(new java.awt.Color(255, 51, 51));
        ans20.setText("CA5CO18");

        jLabel27.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Software Testing");

        ans21.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans21.setForeground(new java.awt.Color(255, 51, 51));
        ans21.setText("CA5CO18");

        ans22.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans22.setForeground(new java.awt.Color(255, 51, 51));
        ans22.setText("CA5CO18");

        ans23.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans23.setForeground(new java.awt.Color(255, 51, 51));
        ans23.setText("CA5CO18");

        ans24.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans24.setForeground(new java.awt.Color(255, 51, 51));
        ans24.setText("CA5CO18");

        ans25.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        ans25.setForeground(new java.awt.Color(255, 51, 51));
        ans25.setText("CA5CO18");

        jLabel33.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Total Satisfaction");

        jLabel34.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Time Managemenent");

        jLabel35.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("Lecture's Content");

        jLabel36.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("Learning Process");

        jLabel37.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Easy of understand");

        jLabel38.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("Total Satisfaction");

        jLabel39.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("Time Managemenent");

        jLabel40.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("Lecture's Content");

        jLabel41.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("Learning Process");

        jLabel42.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("Easy of understand");

        jLabel48.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("Total Satisfaction");

        jLabel49.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("Time Managemenent");

        jLabel50.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setText("Lecture's Content");

        jLabel51.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("Learning Process");

        jLabel52.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("Easy of understand");

        jLabel53.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("Total Satisfaction");

        jLabel54.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setText("Time Managemenent");

        jLabel55.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("Lecture's Content");

        jLabel56.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setText("Learning Process");

        jLabel57.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 102, 102));
        jLabel57.setText("Easy of understand");

        readcomments.setText("Read Comments");
        readcomments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readcommentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ans1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ans4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ans17, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ans18, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ans19, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ans20, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ans16, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(ans5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ans2)
                                    .addComponent(ans3, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(259, 259, 259))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(28, 28, 28))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ans6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ans7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ans8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ans9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ans10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ans21)
                                            .addComponent(ans22)
                                            .addComponent(ans23)
                                            .addComponent(ans24)
                                            .addComponent(ans25, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 2, Short.MAX_VALUE)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ans11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ans12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ans13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ans14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ans15, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(376, 376, 376))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(readcomments, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ans1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6))
                            .addComponent(ans2))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7))
                            .addComponent(ans3))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8))
                            .addComponent(ans4))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel9)
                            .addComponent(ans5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ans6)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ans7)
                                    .addComponent(jLabel36))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ans8)
                                    .addComponent(jLabel35))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ans9)
                                    .addComponent(jLabel34))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ans10)
                                    .addComponent(jLabel33)))
                            .addComponent(jLabel37)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ans11)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ans12)
                                    .addComponent(jLabel41))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ans13)
                                    .addComponent(jLabel40))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ans14)
                                    .addComponent(jLabel39))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ans15)
                                    .addComponent(jLabel38)))
                            .addComponent(jLabel42))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel51)
                                    .addComponent(ans22))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel50)
                                    .addComponent(ans23))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel49)
                                    .addComponent(ans24))
                                .addGap(17, 17, 17)
                                .addComponent(jLabel48))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel52)
                                .addComponent(ans21))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ans25)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ans16)
                                    .addGap(18, 18, 18)
                                    .addComponent(ans17)
                                    .addGap(16, 16, 16)
                                    .addComponent(ans18)
                                    .addGap(16, 16, 16)
                                    .addComponent(ans19)
                                    .addGap(17, 17, 17)
                                    .addComponent(ans20))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel56)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel55)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel54)
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel53))
                                    .addComponent(jLabel57))))))
                .addGap(67, 67, 67)
                .addComponent(readcomments, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        label1.getAccessibleContext().setAccessibleName("Welcome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readcommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readcommentsActionPerformed
        // TODO add your handling code here:
        ReadReviews rrws = new ReadReviews();
        rrws.show();
        dispose();
    }//GEN-LAST:event_readcommentsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherWelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherWelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherWelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherWelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TeacherWelcomeScreen dialog = new TeacherWelcomeScreen();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans1;
    private javax.swing.JLabel ans10;
    private javax.swing.JLabel ans11;
    private javax.swing.JLabel ans12;
    private javax.swing.JLabel ans13;
    private javax.swing.JLabel ans14;
    private javax.swing.JLabel ans15;
    private javax.swing.JLabel ans16;
    private javax.swing.JLabel ans17;
    private javax.swing.JLabel ans18;
    private javax.swing.JLabel ans19;
    private javax.swing.JLabel ans2;
    private javax.swing.JLabel ans20;
    private javax.swing.JLabel ans21;
    private javax.swing.JLabel ans22;
    private javax.swing.JLabel ans23;
    private javax.swing.JLabel ans24;
    private javax.swing.JLabel ans25;
    private javax.swing.JLabel ans3;
    private javax.swing.JLabel ans4;
    private javax.swing.JLabel ans5;
    private javax.swing.JLabel ans6;
    private javax.swing.JLabel ans7;
    private javax.swing.JLabel ans8;
    private javax.swing.JLabel ans9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JButton readcomments;
    // End of variables declaration//GEN-END:variables

}
