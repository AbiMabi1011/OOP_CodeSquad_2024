


package com.mycompany.team3;


import com.mycompany.team3.Adminview.Edit_Profile_Admin;
import com.mycompany.team3.Doctorview.Edit_Profiledoc;
import com.mycompany.team3.LoginSignup.Login1;
import com.mycompany.team3.Patientview.Edit_Profile;
import com.mycompany.team3.Pharmacist.Edit_ProfilePhar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;




/**
 *
 * @author hp
 */
public class Team3 {

    public static void main(String[] args) {
        
       java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                Login1 Login1Frame = new Login1();
                Login1Frame.setVisible(true);
                Login1Frame.pack();
                Login1Frame.setLocationRelativeTo(null); //center 
             
            /*    Edit_Profiledoc Edit_ProfiledocFrame = new    Edit_Profiledoc();
               Edit_ProfiledocFrame.setVisible(true);
                Edit_ProfiledocFrame.pack();
               Edit_ProfiledocFrame.setLocationRelativeTo(null); //center */
                
                
        // TODO code application logic here
    }
       });
    }
}
