/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentfeedbacksystem;

import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author roneetmichael
 */
public class Welcome extends javax.swing.JFrame {
    
    /** Creates new form Welcome */
    public Welcome(){} //
    public Welcome(String enrollment_number) {
        initComponents();
        //showTableData();
        try{
            
            Connection con = DBConnection.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT student_name FROM student_info WHERE enroll_number= '"+enrollment_number+"'");
            while(rs.next()){
            String stud_name = rs.getString("student_name");
            name_label.setText("Welcome " + stud_name);
            }
            
            ResultSet rs2 = stm.executeQuery("SELECT question_1, question_2, question_3, question_4, question_5 FROM feedback_info WHERE enrollment= '"+enrollment_number+"'");
            while(rs2.next())
            {
                int q1 = rs2.getInt("question_1");
                ques_1.setValue(q1);
                int q2 = rs2.getInt("question_2");
                ques_2.setValue(q2);
                int q3 = rs2.getInt("question_3");
                ques_3.setValue(q3);
                int q4 = rs2.getInt("question_4");
                ques_4.setValue(q4);
                int q5 = rs2.getInt("question_5");
                ques_5.setValue(q5);
            }
            String sql = "SELECT feedback_comment FROM feedback_info where enrollment ='"+enrollment_number+"' ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs3 = pst.executeQuery();
             jTable1.setModel(DbUtils.resultSetToTableModel(rs3));
            
            }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
   
    
 
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ques_1 = new javax.swing.JProgressBar();
        sendfeedbackbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ques_2 = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ques_3 = new javax.swing.JProgressBar();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ques_4 = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ques_5 = new javax.swing.JProgressBar();
        name_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Advanced Programming");

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("CA5CO18");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 232, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ques_1.setBackground(new java.awt.Color(61, 90, 254));
        ques_1.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        ques_1.setForeground(new java.awt.Color(61, 90, 254));
        ques_1.setMaximum(10);
        ques_1.setMinimum(1);
        ques_1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ques_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ques_1.setString("10%");
        jPanel1.add(ques_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 199, 490, -1));

        sendfeedbackbutton.setBackground(new java.awt.Color(255, 255, 255));
        sendfeedbackbutton.setForeground(new java.awt.Color(61, 90, 254));
        sendfeedbackbutton.setText("Send Feedback");
        sendfeedbackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendfeedbackbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(sendfeedbackbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 109, -1, 40));

        jLabel2.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Share your feedback or see your previous feedbacks.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(59, 58, 54));
        jLabel5.setText("Advanced Programming");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 177, 166, -1));

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("CA5CO18");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 177, -1, -1));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("CA5CO19");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 239, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(59, 58, 54));
        jLabel8.setText("Project Lab");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 239, -1, -1));

        ques_2.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        ques_2.setMaximum(10);
        ques_2.setMinimum(1);
        ques_2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ques_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(ques_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 261, 490, -1));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("CA5EL05");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 301, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(59, 58, 54));
        jLabel10.setText("Design and Analysis of Algorithms");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 301, 258, -1));

        ques_3.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        ques_3.setMaximum(10);
        ques_3.setMinimum(1);
        ques_3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ques_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(ques_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 323, 490, -1));

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("CA5EL06");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 363, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(59, 58, 54));
        jLabel12.setText("Mobile Communication");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 363, -1, -1));

        ques_4.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        ques_4.setMaximum(10);
        ques_4.setMinimum(1);
        ques_4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ques_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(ques_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 385, 490, -1));

        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("CA5EL07");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 425, -1, -1));

        jLabel14.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(59, 58, 54));
        jLabel14.setText("Artificial Intelligence");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 425, -1, -1));

        ques_5.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        ques_5.setMaximum(10);
        ques_5.setMinimum(1);
        ques_5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ques_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(ques_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 447, 490, -1));

        name_label.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        name_label.setForeground(new java.awt.Color(61, 90, 254));
        name_label.setText("Welcome");
        jPanel1.add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 39, 490, -1));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        jTable1.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Comments"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 411, 291));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1383, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendfeedbackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendfeedbackbuttonActionPerformed
        // TODO add your handling code here:
        
        
        String username = jLabel1.getText();
        
        RatingScreen rscen = new RatingScreen(username);
        rscen.jLabel_rs.setText(username);
        rscen.show();
        dispose();
    }//GEN-LAST:event_sendfeedbackbuttonActionPerformed

    public void showTableData(){
try {
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("loaded");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","studentfeedback");
    String sql = "SELECT feedback_comment FROM feedback_info";
    PreparedStatement pst = con.prepareStatement(sql);
    ResultSet rs = pst.executeQuery();
    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
}
    catch(Exception ex){
        System.out.println(ex.getMessage());
}
 
}
    
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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel name_label;
    private javax.swing.JProgressBar ques_1;
    private javax.swing.JProgressBar ques_2;
    private javax.swing.JProgressBar ques_3;
    private javax.swing.JProgressBar ques_4;
    private javax.swing.JProgressBar ques_5;
    private javax.swing.JButton sendfeedbackbutton;
    // End of variables declaration//GEN-END:variables

}
