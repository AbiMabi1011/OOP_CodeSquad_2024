/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.team3.Adminview;

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel3.setLayout(null);

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
        jButton1.setBounds(290, 380, 90, 30);

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
        jButton2.setBounds(390, 380, 90, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(120, 70, 50, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Telephone");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(110, 260, 90, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Email  ");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(120, 230, 56, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Age");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(130, 160, 34, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Address");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(130, 200, 68, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Gender");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(120, 110, 62, 25);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel1.setText("Could you please provide your ");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 0, 240, 30);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel5.setText("insurance ID ");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 20, 105, 30);

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel8.setText("number ?");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(120, 20, 70, 30);

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

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1);
        jTextField1.setBounds(10, 52, 230, 40);

        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel13.setText("Not mandatory");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(70, 110, 120, 19);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(510, 190, 260, 140);

        jButton3.setText("Delete Your Acoount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(300, 420, 170, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(210, 110, 72, 22);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 800, 500);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ComponentHidden

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Admin_Home  Admin_HomeFrame = new Admin_Home();
        Admin_HomeFrame.setVisible(true);
        Admin_HomeFrame.pack();
        Admin_HomeFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ComponentHidden

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
