/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.team3.Doctorview;

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
public class Edit_Profiledoc extends javax.swing.JFrame {

    /**
     * Creates new form Edit_Profiledoc
     */
    public Edit_Profiledoc() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        genders = new javax.swing.JComboBox<>();
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
        AGE = new javax.swing.JTextField();
        EMAIL = new javax.swing.JTextField();
        Telephone = new javax.swing.JTextField();
        Address2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Address1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        SpecialComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(8, 12, 60, 33);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Gender");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(6, 53, 70, 28);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Age");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(6, 93, 62, 30);

        genders.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel3.add(genders);
        genders.setBounds(100, 60, 235, 28);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Address ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(6, 223, 92, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Email  ");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(6, 145, 56, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Tel");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(6, 182, 26, 30);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel1.setText("Could you please provide your ");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 0, 240, 30);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel5.setText("SLMC ID ");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 20, 76, 30);

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel8.setText("number ?");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(90, 20, 70, 30);

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

        jPanel3.add(jPanel4);
        jPanel4.setBounds(489, 238, 260, 140);
        jPanel3.add(Name);
        Name.setBounds(99, 15, 235, 33);
        jPanel3.add(AGE);
        AGE.setBounds(100, 100, 126, 30);
        jPanel3.add(EMAIL);
        EMAIL.setBounds(100, 150, 235, 33);
        jPanel3.add(Telephone);
        Telephone.setBounds(100, 190, 235, 33);

        Address2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Address2ActionPerformed(evt);
            }
        });
        jPanel3.add(Address2);
        Address2.setBounds(90, 310, 235, 33);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Line 1");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(12, 254, 50, 25);
        jPanel3.add(Address1);
        Address1.setBounds(90, 260, 235, 33);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Line 2");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(12, 298, 50, 25);

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
        jPanel3.add(jButton1);
        jButton1.setBounds(23, 468, 90, 30);

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
        jPanel3.add(jButton2);
        jButton2.setBounds(292, 468, 90, 30);

        jButton3.setText("Delete Your Acoount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(579, 471, 170, 23);

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(439, 468, 81, 30);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Specilation");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(489, 81, 94, 25);

        SpecialComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Neurosurgeon", "Orthopedic", "Cardiothoracic", "Plastic", "Ophthalmic", "Pediatric" }));
        jPanel3.add(SpecialComboBox);
        SpecialComboBox.setBounds(489, 112, 235, 28);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 780, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PInsurIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PInsurIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PInsurIDActionPerformed

    private void jButton1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ComponentHidden

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Doctor_Home  Doctor_HomeFrame = new Doctor_Home();
        Doctor_HomeFrame.setVisible(true);
        Doctor_HomeFrame.pack();
        Doctor_HomeFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ComponentHidden

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // save button
        String Pname, Gencompo,Page, Pemail,  Pphone, Paddress, PinsurID, query, Specials;

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
            else if("".equals(EMAIL.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Email Name is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if (!EMAIL.getText().endsWith("@gmail.com")){
                JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid email is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(AGE.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Age is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Telephone.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Phone Number is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if(Telephone.getText().length() != 10) {
                JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid Phone Number is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Address1.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Address Line 1 is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Address2.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Address Line 2 is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }

            else{
                String selectedValue = genders.getSelectedItem().toString();
                System.out.println("Selected: " + selectedValue);
                
                String Special = SpecialComboBox.getSelectedItem().toString();
                System.out.println("Selected: " + selectedValue);
                
                

                String Address12 = Address2.getText() +"," + Address1.getText();

                Pname =  Name.getText();
                Gencompo =  selectedValue;
                Page = AGE.getText();
                Pemail = EMAIL.getText();
                Pphone = Telephone.getText();
                Paddress = Address12;
                PinsurID = PInsurID.getText();
                Specials = Special;

                System.out.println("Data Entered");

                query = "INSERT INTO Doctor_details(Name, Gender, Age, Email, Phone_Number , Address, Specilation,  SLMC_ID)" +
                "VALUES('"+Pname+"', '"+Gencompo+"', '"+Page+"', '"+Pemail+"', '"+Pphone+"', '"+Paddress+"', '"+Specials+"', '"+PinsurID+"')";
                
                String Searchemail = "SELECT * FROM Doctor_details WHERE Email = '"+Pemail+"'";

                ResultSet rs = st.executeQuery(Searchemail);
                if(rs.next()){
                     showMessageDialog(null, "Already Have an Account"); 
                }
                else {
                    st.execute(query);
                    showMessageDialog(null, "New Account has been created successfully!");
                }

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

            if("".equals(EMAIL.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Please Enter Your Email to delete your Account", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if (!EMAIL.getText().endsWith("@gmail.com")){
                JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid email is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }

            else{

                Pemail = EMAIL.getText();

                String Searchemail = "SELECT * FROM Doctor_details WHERE Email = '"+Pemail+"'";

                String DeleterowQuery = "DELETE FROM Doctor_details WHERE Email = '"+Pemail+"'";

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
        String Pname, Gencompo,Page, Pemail,  Pphone, Paddress, PinsurID, query, Specials;

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
            else if("".equals(EMAIL.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Email Name is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if (!EMAIL.getText().endsWith("@gmail.com")){
                JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid email is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(AGE.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Age is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Telephone.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Phone Number is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if(Telephone.getText().length() != 10) {
                JOptionPane.showMessageDialog(new JFrame(), "Enter the Valid Phone Number is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Address2.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Address Line 1 is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }
            else if("".equals(Address1.getText())){

                JOptionPane.showMessageDialog(new JFrame(), "Address Line 2 is required", "Error",
                    JOptionPane.ERROR_MESSAGE );
            }

            else{
                String selectedValue = genders.getSelectedItem().toString();
                System.out.println("Selected: " + selectedValue);
                
                String Special = SpecialComboBox.getSelectedItem().toString();
                System.out.println("Selected: " + selectedValue);

                String Address12 = Address2.getText() +"," + Address1.getText();

                Pname =  Name.getText();
                Gencompo =  selectedValue;
                Page = AGE.getText();
                Pemail = EMAIL.getText();
                Pphone = Telephone.getText();
                Paddress = Address12;
                PinsurID = PInsurID.getText();
                Specials = Special;

                System.out.println("Data Entered");

                query = "UPDATE Doctor_details SET Name = '"+Pname+"', Gender = '"+Gencompo+"',  Age = '"+Page+"', Phone_Number = '"+Pphone+"',  Address = '"+Paddress+"',Specilation = '"+Specials+"',  SLMC_ID = '"+PinsurID+"' WHERE Email = '"+Pemail+"'";

                //update
                st.execute(query);

                showMessageDialog(null, "Account successfully Updated!");

            }
        }
        catch(HeadlessException | SQLException e){
            System.out.println("Error! " +e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Address2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Address2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Address2ActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_Profiledoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Profiledoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Profiledoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Profiledoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Profiledoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGE;
    private javax.swing.JTextField Address1;
    private javax.swing.JTextField Address2;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PInsurID;
    private javax.swing.JComboBox<String> SpecialComboBox;
    private javax.swing.JTextField Telephone;
    private javax.swing.JComboBox<String> genders;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
