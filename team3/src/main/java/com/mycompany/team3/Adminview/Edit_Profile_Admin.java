/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.team3.Adminview;

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
public class Edit_Profile_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Edit_Profile_Admin
     */
    public Edit_Profile_Admin() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PInsurID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Name4 = new javax.swing.JTextField();
        Name5 = new javax.swing.JTextField();
        Name6 = new javax.swing.JTextField();
        Name7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Name8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Age");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Address ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Email  ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Tel");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel1.setText("Could you please provide your ");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 0, 240, 30);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel5.setText("SLIIT ID ");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 20, 70, 30);

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel8.setText("number ?");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(80, 20, 70, 30);

        jPanel5.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel10.setText("Could you please provide your ");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(10, 0, 240, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("insurance ID ");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(10, 20, 72, 30);

        jLabel12.setText("number");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(90, 20, 42, 30);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(520, 250, 260, 140);

        PInsurID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PInsurIDActionPerformed(evt);
            }
        });
        jPanel4.add(PInsurID);
        PInsurID.setBounds(10, 52, 230, 40);

        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel13.setText("Not mandatory");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(70, 110, 120, 19);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Line 2");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Line 1");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Line 2");

        jButton1.setText("Back");
        jButton1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jButton1ComponentHidden(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
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

        jButton3.setText("Delete Your Acoount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14))))))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Name6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Name5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Name7, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Name8, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Name7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(Name8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(40, 40, 740, 420);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PInsurIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PInsurIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PInsurIDActionPerformed

    private void jButton1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ComponentHidden

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Admin_Home   Admin_HomeFrame = new  Admin_Home();
         Admin_HomeFrame.setVisible(true);
         Admin_HomeFrame.pack();
         Admin_HomeFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ComponentHidden

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // save button
        String Pname, Gencompo,Page, Pemail,  Pphone, Paddress, PinsurID, query;

        String SUrl, SUser, SPass;
        /*  private static final String URL = "jdbc:mysql://localhost:3306/mydatabase"; // Change DB name
        private static final String USER = "root";  // Default XAMPP MySQL user
        private static final String PASSWORD = "";  // Default password is empty
        */
        SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        SUser = "root";
        SPass = "";
        //PName, GenCompo, PEmail,PAge, PPhone, Paddr1, Paddr2, PinsurID
        try{
            //  Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(Name.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Full Name is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Name5.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Email Name is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if (!Name5.getText().endsWith("@gmail.com")){
                JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid email is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Name4.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Age is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Name6.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Phone Number is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if(Name6.getText().length() != 10) {
                JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid Phone Number is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Name7.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Address Line 1 is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Name8.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Address Line 2 is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }

            else{
                String selectedValue = jComboBox1.getSelectedItem().toString();
                System.out.println("Selected: " + selectedValue);

                String Address12 = Name7.getText() +"," + Name8.getText();

                Pname =  Name.getText();
                Gencompo =  selectedValue;
                Page = Name4.getText();
                Pemail = Name5.getText();
                Pphone = Name6.getText();
                Paddress = Address12;
                PinsurID = PInsurID.getText();

                System.out.println("Data Entered");

                query = "INSERT INTO Admin_Details(Name, Gender, Age, Email, Phone_Number , Address, SLIIT_ID)" +
                "VALUES('"+Pname+"', '"+Gencompo+"', '"+Page+"', '"+Pemail+"', '"+Pphone+"', '"+Paddress+"', '"+PinsurID+"')";

                String query1 ;
                query1 = "UPDATE Admin_Details SET Name = '"+Pname+"', Gender = '"+Gencompo+"',  Age = '"+Page+"', Phone_Number = '"+Pphone+"',  Address = '"+Paddress+"',  SLIIT_ID = '"+PinsurID+"' WHERE Email = '"+Pemail+"'";

                String Searchemail = "SELECT * FROM Admin_Details WHERE Email = '"+Pemail+"'";

                ResultSet rs = st.executeQuery(Searchemail);
                if(rs.next()){
                    showMessageDialog(null, "Already Have an Account");

                }
                else {
                    st.execute(query);
                    showMessageDialog(null, "New Account has been created successfully!");
                }

                st.execute(query1);

            }
        }
        catch(HeadlessException | SQLException e){
            System.out.println("Error! " +e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Delete Your Account

        String Pemail;

        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        SUser = "root";
        SPass = "";

        try{
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();

            if("".equals(Name5.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Please Enter Your Email to delete your Account", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if (!Name5.getText().endsWith("@gmail.com")){
                JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid email is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }

            else{

                Pemail = Name5.getText();

                String Searchemail = "SELECT * FROM Admin_Details WHERE Email = '"+Pemail+"'";

                String DeleterowQuery = "DELETE FROM Admin_Details WHERE Email = '"+Pemail+"'";

                ResultSet rs = st.executeQuery(Searchemail);

                if(rs.next()){
                    st.execute(DeleterowQuery);

                    JOptionPane.showMessageDialog(new JFrame(), "Your Account Deleted!", "Error",
                        JOptionPane.ERROR_MESSAGE );

                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(), "No Account Found ", "Error",
                        JOptionPane.ERROR_MESSAGE );
                }

            }

        }

        catch(HeadlessException | SQLException e){
            System.out.println("Error! " +e.getMessage());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //update
        String Pname, Gencompo,Page, Pemail,  Pphone, Paddress, PinsurID, query;

        String SUrl, SUser, SPass;
        /*  private static final String URL = "jdbc:mysql://localhost:3306/mydatabase"; // Change DB name
        private static final String USER = "root";  // Default XAMPP MySQL user
        private static final String PASSWORD = "";  // Default password is empty
        */
        SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        SUser = "root";
        SPass = "";
        //PName, GenCompo, PEmail,PAge, PPhone, Paddr1, Paddr2, PinsurID
        try{
            //  Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(Name.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Full Name is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Name5.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Email Name is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if (!Name5.getText().endsWith("@gmail.com")){
                JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid email is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Name4.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Age is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Name6.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Phone Number is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if(Name6.getText().length() != 10) {
                JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid Phone Number is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Name7.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Address Line 1 is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Name8.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Address Line 2 is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }

            else{
                String selectedValue = jComboBox1.getSelectedItem().toString();
                System.out.println("Selected: " + selectedValue);

                String Address12 = Name7.getText() +"," + Name8.getText();

                Pname =  Name.getText();
                Gencompo =  selectedValue;
                Page = Name4.getText();
                Pemail = Name5.getText();
                Pphone = Name6.getText();
                Paddress = Address12;
                PinsurID = PInsurID.getText();

                System.out.println("Data Entered");

                query = "UPDATE Admin_Details SET Name = '"+Pname+"', Gender = '"+Gencompo+"',  Age = '"+Page+"', Phone_Number = '"+Pphone+"',  Address = '"+Paddress+"',  SLIIT_ID = '"+PinsurID+"' WHERE Email = '"+Pemail+"'";

                //update
                st.execute(query);

                showMessageDialog(null, "Account successfully Updated!");

            }
        }
        catch(HeadlessException | SQLException e){
            System.out.println("Error! " +e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_Profile_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Profile_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Profile_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Profile_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Profile_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Name4;
    private javax.swing.JTextField Name5;
    private javax.swing.JTextField Name6;
    private javax.swing.JTextField Name7;
    private javax.swing.JTextField Name8;
    private javax.swing.JTextField PInsurID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
