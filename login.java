/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

//import java.util.Arrays;
import sun.security.jgss.GSSUtil;
import javax.swing.*;
import MAIN.*;
import com.sun.glass.events.KeyEvent;
//import static MAIN.MAIN.jDesktopPane2;
//import java.awt.event.KeyEvent;
//import java.io.*;
import java.sql.*;
import java.util.Arrays;
//import javax.swing.InputMap;
/**
 *
 * @author Nren
 */
public class login extends javax.swing.JInternalFrame 
{
Connection con;
Statement stmt;
ResultSet rs;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        connect();
        
        //JRootPane rootPane = this.getRootPane();
        rootPane.setDefaultButton(submit_Button);
        InputMap im = submit_Button.getInputMap();
        im.put(KeyStroke.getKeyStroke("ENTER"), "none");
        im.put(KeyStroke.getKeyStroke("released ENTER"), "released");
        //InputMap im = jButton1.getInputMap();
        //im.put(KeyStroke.getKeyStroke("ENTER"), "none");
        //im.put(KeyStroke.getKeyStroke("released ENTER"), "released");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        u_name = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        submit_Button = new javax.swing.JButton();
        reset_Button = new javax.swing.JButton();

        setBorder(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        u_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        u_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save(evt);
            }
        });
        u_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                e_pass(evt);
            }
        });

        Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        submit_Button.setText("Submit");
        submit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit(evt);
            }
        });

        reset_Button.setText("Reset");
        reset_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(submit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(submit_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(reset_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password)
                    .addComponent(u_name)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(u_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save
      
     
       //jTextField1.setText(ans.toString());
    }//GEN-LAST:event_save

    private void submit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit
         Boolean ans=validatelogin();
        if(ans==true){
            Views.loginview(true,u_name.getText());
            this.setVisible(false);
           }
        else{
            Password.setText(null);
            JOptionPane.showMessageDialog(this,"User Name or Password are not correct");
        }
    }//GEN-LAST:event_submit

    private void reset_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_ButtonActionPerformed
        JOptionPane.showMessageDialog(this,"Please contact your Administrator");
    }//GEN-LAST:event_reset_ButtonActionPerformed

    private void e_pass(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_e_pass
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
            Password.grabFocus();
    }//GEN-LAST:event_e_pass

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPasswordField Password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reset_Button;
    private javax.swing.JButton submit_Button;
    public static javax.swing.JTextField u_name;
    // End of variables declaration//GEN-END:variables

    private Boolean validatelogin() {
        Boolean ans=false;
           
                String uname=u_name.getText();
                String pwd=Password.getText();
                
        String sqlcmd="select * from usertable where username = '"+uname+"' AND password = '"+pwd+"'";
        //sqlcmd="select * from usertable where password = '"+pwd+"'";
        try
        {
            rs = stmt.executeQuery(sqlcmd);
            if(rs.next()==true){
                //this.setTitle(rs.getString("password"));
                String pwdd=rs.getString("password");
                if (Arrays.equals(pwd.toCharArray(), pwdd.toCharArray())==true){
                ans=true;
                }
                else
                    ans=false;
                }
            else
              ans=false;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
          return ans;
        }
    private void connect() {
        try
    {
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bsdatabase","root","");
    stmt=con.createStatement();
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(this,ex.getMessage());
    }
    }
    
}

