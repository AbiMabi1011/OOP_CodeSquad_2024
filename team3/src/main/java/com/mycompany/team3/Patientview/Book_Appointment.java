/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.team3.Patientview;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keert
 */
public class Book_Appointment extends javax.swing.JFrame {

    /**
     * Creates new form Book_Appointment
     */
    public Book_Appointment() {
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
        jComboBox1 = new javax.swing.JComboBox<>();
        CompoTime = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorsTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        pemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        paname = new javax.swing.JTextField();
        jsearch = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "WedensDay", "Thurshday", "Friday", "Saturday" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(300, 180, 150, 30);

        CompoTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.00", "11.59" }));
        CompoTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompoTimeActionPerformed(evt);
            }
        });
        jPanel2.add(CompoTime);
        CompoTime.setBounds(300, 230, 72, 22);

        jButton1.setText("Delete Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(600, 340, 140, 40);

        jButton2.setText("Back");
        jButton2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jButton2ComponentHidden(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 400, 100, 40);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(210, 110, 80, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Day");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(220, 180, 80, 30);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Time");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 220, 80, 30);

        jButton3.setText("Confirm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(410, 400, 80, 40);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "General", "Neurosurgeon", "Orthopedic", "Cardiothoracic", "Plastic", "Ophthalmic", "Pediatric" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox4);
        jComboBox4.setBounds(300, 140, 150, 30);

        doctorsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Doctor_id", "Name"
            }
        ));
        jScrollPane1.setViewportView(doctorsTable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(470, 100, 290, 200);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Specilation");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(220, 140, 80, 30);

        pemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemailActionPerformed(evt);
            }
        });
        jPanel2.add(pemail);
        pemail.setBounds(300, 110, 150, 22);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Patient Name");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(210, 70, 80, 30);

        paname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panameActionPerformed(evt);
            }
        });
        jPanel2.add(paname);
        paname.setBounds(300, 80, 150, 22);

        jsearch.setText("Search");
        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });
        jPanel2.add(jsearch);
        jsearch.setBounds(300, 400, 80, 40);

        jLabel9.setText("am");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(380, 230, 37, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String selectedItem = jComboBox1.getSelectedItem().toString();
    System.out.println("User selected: " + selectedItem);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void CompoTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompoTimeActionPerformed
        
    }//GEN-LAST:event_CompoTimeActionPerformed

    private void jButton2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ComponentHidden

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Patient_Home  Patient_HomeFrame = new Patient_Home();
        Patient_HomeFrame.setVisible(true);
        Patient_HomeFrame.pack();
        Patient_HomeFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void pemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pemailActionPerformed

    private void panameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
        String P_Name, P_Email, P_Date, P_Time, Doc_email,Doc_ID = null, query;	 
        int notFound =0,  notemail = 1;
          String Specil = jComboBox4.getSelectedItem().toString();
                
                        String Time = CompoTime.getSelectedItem().toString();
                        String Day = jComboBox1.getSelectedItem().toString();
                        String Date;
                        switch (Day){  //Monday, Tuesday, WedensDay, Thurshday, Friday, Saturday
                            case "Monday": 
                                Date = "2025-02-10";
                                break;
                            case "Tuesday":
                                Date = "2025-02-11" ;
                                break;
                            case "WedensDay":
                                Date = "2025-02-12";
                                break;
                            case "Thurshday":
                                Date = "2025-02-06";
                                break;
                            case "Friday":
                                Date = "2025-02-07";
                                break;
                                case "Saturday":
                                Date = "2025-02-08";
                                break;
                                default :
                                    Date = "2025-00-00";
                                }
                        String Specia = jComboBox4.getSelectedItem().toString();
                        switch(Specia){
                         //Choose, General, Neurosurgeon, Orthopedic, Cardiothoracic, Plastic, Ophthalmic, Pediatric
                            case "General": 
                               Doc_email = "Doctor@gmail.com";
                               Doc_ID = "PAT_00096";
                                break;
                            case "Neurosurgeon":
                                 Doc_email = "Doctor1@gmail.com" ;
                                 Doc_ID = "PAT_00097";
                                break;
                            case "Orthopedic":
                                 Doc_email = "Doctor3@gmail.com";
                                 Doc_ID = "PAT_00098";
                                break;
                            case "Cardiothoracic":
                                Doc_email = "Doctor4@gmail.com";
                                Doc_ID = "PAT_00099";
                                break;
                            case "Plastic":
                                Doc_email = "Doctor5@gmail.com";
                                Doc_ID = "PAT_00100";
                                break;
                                case "Doctor6@gmail.com":
                                 Doc_email = "Ophthalmic";
                                 Doc_ID = "PAT_00101";
                                break;
                        case "Pediatric":
                                Doc_email = "Doctor7@gmail.com";
                                Doc_ID = "PAT_00102";
                                break;
                                default :
                                    Doc_email = "null";;
                                    Doc_ID = "null";
                                }
                        

               
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
                    
                     
                    if("".equals(paname.getText())){
                        
                       JOptionPane.showMessageDialog(new JFrame(), "Patient Name is required", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        }
                    else if("".equals(pemail.getText())){
                        
                       JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        }
                    else if (!pemail.getText().endsWith("@gmail.com")){                                                                         
                         JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid email is required", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        }
                    else if ((Specil == "Choose")) {
                        JOptionPane.showMessageDialog(new JFrame(), "Please choose any Specilation ", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        
                    }
                    else if ((Doc_email == "null")) {
                        JOptionPane.showMessageDialog(new JFrame(), "Can't Book You , No Doctor Available ", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        
                    }
                     else{
                         P_Name = paname.getText();
                         P_Email = pemail.getText();
                         P_Date = Date;
                         P_Time = Time;
                         
                         query = "INSERT INTO book_appoin (Doc_ID, P_Name,  P_Email,  P_Date, P_Time, Doc_email)" +
                                 "VALUES('"+Doc_ID+"', '"+P_Name+"', '"+P_Email+"', '"+P_Date+"', '"+P_Time+"', '"+Doc_email+"')"; 
                         
                        String Searchemail = "SELECT * FROM book_appoin WHERE P_Email = '"+P_Email+"'";

                    ResultSet rs = st.executeQuery(Searchemail);
                    if(rs.next()){
                        showMessageDialog(null, "Already Booked");

                        }
                        else {
                    st.execute(query);
                    showMessageDialog(null, "Appointment Booked!");
                }
                    
                                 } 
                }
                catch(HeadlessException | SQLException e){
                    System.out.println("Error! " +e.getMessage());
                }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed
         // SQL Select Query
         
            // Define table model
            DefaultTableModel model = (DefaultTableModel) doctorsTable.getModel(); 
            model.setRowCount(0); // Clear existing data

                String SUrl, SUser, SPass;
              
                SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
                SUser = "root";
                SPass = "";
                
                try{
                  //  Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                    Statement st = con.createStatement();
                  // SQL Select Query
                  
                   String Specil = jComboBox4.getSelectedItem().toString();
                   String checkEmailQuery = "SELECT * FROM doctor_details WHERE Specilation = '"+ Specil+"'"; 
                      ResultSet rs = st.executeQuery(checkEmailQuery);
                   
                    // Loop through result set and add rows to table
                    while (rs.next()) {
                    String Doctor_id = rs.getString("Doctor_ID");
                    String Name = rs.getString("Name");
                    
                        
                model.addRow(new Object[]{Doctor_id, Name});
                }
                   
                }
   
                
                catch(HeadlessException | SQLException e){
                    System.out.println("Error! " +e.getMessage());
                }
       

    }//GEN-LAST:event_jsearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String P_Name , P_Email ;
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
                    
                     
                    
                     if("".equals(pemail.getText())){
                        
                       JOptionPane.showMessageDialog(new JFrame(), "Email is required to delete", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        }
                    else if (!pemail.getText().endsWith("@gmail.com")){                                                                         
                         JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid email is required", "Error", 
                               JOptionPane.ERROR_MESSAGE );
                        }
                   
                     else{
                         P_Name = paname.getText();
                         P_Email = pemail.getText();
                         
                         
                         
                    String Searchemail = "SELECT * FROM book_appoin WHERE P_Email = '"+ P_Email+"'";

                String DeleterowQuery = "DELETE FROM book_appoin WHERE P_Email = '"+ P_Email+"'"; 

                ResultSet rs = st.executeQuery(Searchemail);

                if(rs.next()){
                    st.execute(DeleterowQuery);

                    JOptionPane.showMessageDialog(new JFrame(), "Your Appointment Deleted!", "Error",
                        JOptionPane.ERROR_MESSAGE );

                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(), "No Appointment Found ", "Error",
                        JOptionPane.ERROR_MESSAGE );
                }
                    
                                 } 
                }
                catch(HeadlessException | SQLException e){
                    System.out.println("Error! " +e.getMessage());
                }
    }
                                           

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         // SQL Select Query
         
            // Define table model
            DefaultTableModel model = (DefaultTableModel) doctorsTable.getModel(); 
            model.setRowCount(0); // Clear existing data

                String SUrl, SUser, SPass;
              
                SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
                SUser = "root";
                SPass = "";
                
                try{
                  //  Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                    Statement st = con.createStatement();
                  // SQL Select Query
                  
                   String Specil = jComboBox4.getSelectedItem().toString();
                   String checkEmailQuery = "SELECT * FROM doctor_details WHERE Specilation = '"+ Specil+"'"; 
                      ResultSet rs = st.executeQuery(checkEmailQuery);
                   
                    // Loop through result set and add rows to table
                    while (rs.next()) {
                    String Doctor_id = rs.getString("Doctor_ID");
                    String Name = rs.getString("Name");
                    
                        
                model.addRow(new Object[]{Doctor_id, Name});
                }
                   
                }
   
                
                catch(HeadlessException | SQLException e){
                    System.out.println("Error! " +e.getMessage());
                }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Book_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CompoTime;
    private javax.swing.JTable doctorsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jsearch;
    private javax.swing.JTextField paname;
    private javax.swing.JTextField pemail;
    // End of variables declaration//GEN-END:variables
}
