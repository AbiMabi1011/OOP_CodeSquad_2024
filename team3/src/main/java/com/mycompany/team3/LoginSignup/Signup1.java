/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.team3.LoginSignup;

import com.mysql.cj.protocol.Resultset;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Keert
 */
public class Signup1 extends javax.swing.JFrame {

    /**
     * Creates new form Signup1
     */
    public Signup1() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phoneno = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        SignupBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel2.setLayout(null);

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 60, 210, 190);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MediCare Plus ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 290, 291, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Copyright © 2025 Medicare Plus. All rights reserved");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 430, 280, 16);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        left.setBackground(new java.awt.Color(255, 255, 255));
        left.setPreferredSize(new java.awt.Dimension(400, 500));
        left.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel3.setLayout(null);

        jLabel4.setText("jLabel1");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(90, 60, 210, 190);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MediCare Plus ");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(50, 290, 291, 50);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Copyright © 2025 Medicare Plus. All rights reserved");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(50, 430, 280, 16);

        left.add(jPanel3);
        jPanel3.setBounds(0, 0, 400, 500);

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("SIGN UP");
        left.add(jLabel7);
        jLabel7.setBounds(520, 40, 150, 60);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Password");
        left.add(jLabel8);
        jLabel8.setBounds(420, 220, 120, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("Email");
        left.add(jLabel9);
        jLabel9.setBounds(420, 160, 120, 30);

        phoneno.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        left.add(phoneno);
        phoneno.setBounds(470, 330, 130, 30);
        left.add(password);
        password.setBounds(420, 250, 330, 30);

        SignupBtn.setBackground(new java.awt.Color(0, 102, 102));
        SignupBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SignupBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignupBtn.setText("Signup");
        SignupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupBtnActionPerformed(evt);
            }
        });
        left.add(SignupBtn);
        SignupBtn.setBounds(420, 370, 80, 30);

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        left.add(jButton3);
        jButton3.setBounds(520, 420, 90, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setText("I've an account ");
        left.add(jLabel10);
        jLabel10.setBounds(420, 420, 110, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Phone Number");
        left.add(jLabel11);
        jLabel11.setBounds(420, 290, 120, 30);

        fname.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        left.add(fname);
        fname.setBounds(420, 130, 330, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("Full Name");
        left.add(jLabel12);
        jLabel12.setBounds(420, 100, 120, 30);

        emailAddress.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        left.add(emailAddress);
        emailAddress.setBounds(420, 190, 330, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel13.setText("Lk+94");
        left.add(jLabel13);
        jLabel13.setBounds(420, 330, 50, 20);

        jPanel1.add(left);
        left.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupBtnActionPerformed
        String fullName, email, Password, query, PhoneNo;
        int notFound =0;
                
               
                String SUrl, SUser, SPass;
              /*  private static final String URL = "jdbc:mysql://localhost:3306/mydatabase"; // Change DB name
                private static final String USER = "root";  // Default XAMPP MySQL user
                private static final String PASSWORD = "";  // Default password is empty
              */  
                SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
                SUser = "root";
                SPass = "";
                
                try{
                  //  Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                    Statement st = con.createStatement();
                    
                    
                    //check email already signed
                    String ChkEmail = emailAddress.getText();
                    String checkEmailQuery = "SELECT * FROM user WHERE email = '"+ChkEmail+"'";
                           
                    ResultSet rs = st.executeQuery(checkEmailQuery);
                    if(rs.next()){
                                    notFound = 1;
                            } else {System.out.println("Not Found");}
         
                    
                    
                    if("".equals(fname.getText())){
                        
                       JOptionPane.showMessageDialog(new JFrame(), "Full Name is required", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        }
                    else if("".equals(emailAddress.getText())){
                        
                       JOptionPane.showMessageDialog(new JFrame(), "Email Name is required", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        }
                    else if (!emailAddress.getText().endsWith("@gmail.com")){                                                                         
                         JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid email is required", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        }
                    else if ( notFound == 1){                                                                         
                         JOptionPane.showMessageDialog(new JFrame(), "Your Email Address already in our System", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        }
                    else if("".equals(password.getText())){
                        
                       JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        }
                     else if("".equals(phoneno.getText())){
                        
                       JOptionPane.showMessageDialog(new JFrame(), "Phone Number is required", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        }
                     else if(phoneno.getText().length() != 9) {
                         JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid Phone Number is required", "Error", 
                               JOptionPane.ERROR_MESSAGE );
      
                        }
                     else{
                         fullName = fname.getText();
                         email = emailAddress.getText();
                         Password = password.getText();
                         PhoneNo = "0" + phoneno.getText();
                         
                         
                         System.out.println(Password);
                         
                         query = "INSERT INTO user(full_name, email, password, Phone_number)" +
                                 "VALUES('"+fullName+"', '"+email+"', '"+Password+"', '"+PhoneNo+"')";
                         
                         st.execute(query);
                         fname.setText("");
                         emailAddress.setText("");
                         password.setText("");
                         phoneno.setText("");
                         
                         showMessageDialog(null, "New Account has been created successfully!");
                         
                                 } 
                }
                catch(HeadlessException | SQLException e){
                    System.out.println("Error! " +e.getMessage());
                }
    }//GEN-LAST:event_SignupBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login1  Login1Frame = new Login1();
        Login1Frame.setVisible(true);
        Login1Frame.pack();
        Login1Frame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

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
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignupBtn;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel left;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneno;
    // End of variables declaration//GEN-END:variables
}
