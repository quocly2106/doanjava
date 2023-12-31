/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cfe;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.AdminDao;

/**
 *
 * @author Admin
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginJFrame
     */
    AdminDao dao = new AdminDao();
    int xx, xy;

    public LoginJFrame() {
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

        pnLogin = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();
        lbHide = new javax.swing.JLabel();
        lbShow = new javax.swing.JLabel();
        lbForgotPassword = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbSignUp = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnLogin.setBackground(new java.awt.Color(158, 111, 78));
        pnLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnLoginMouseDragged(evt);
            }
        });
        pnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnLoginMousePressed(evt);
            }
        });
        pnLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbExit.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        lbExit.setForeground(new java.awt.Color(255, 255, 255));
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setText("X");
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });
        pnLogin.add(lbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 24, 27));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hut Coffee");
        pnLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 371, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username :");
        pnLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 333, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password :");
        pnLogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 333, 20));

        btnLogin.setBackground(new java.awt.Color(237, 226, 219));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, 36));

        btnCancel.setBackground(new java.awt.Color(237, 226, 219));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancel.setText("Cancel");
        pnLogin.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 130, 36));

        tfPassword.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnLogin.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 310, 40));

        lbHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hide.png"))); // NOI18N
        lbHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHideMouseClicked(evt);
            }
        });
        pnLogin.add(lbHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 30, 40));

        lbShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visible.png"))); // NOI18N
        lbShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbShowMouseClicked(evt);
            }
        });
        pnLogin.add(lbShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, 40));

        lbForgotPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbForgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        lbForgotPassword.setText("Forgot Password");
        lbForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbForgotPasswordMouseClicked(evt);
            }
        });
        pnLogin.add(lbForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Don't have an account?");
        pnLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        lbSignUp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbSignUp.setForeground(new java.awt.Color(255, 255, 255));
        lbSignUp.setText("Sign Up");
        lbSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSignUpMouseClicked(evt);
            }
        });
        pnLogin.add(lbSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        tfUsername.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsernameKeyTyped(evt);
            }
        });
        pnLogin.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 310, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        setVisible(false);
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHideMouseClicked
        tfPassword.setEchoChar((char) 0);
        lbHide.setVisible(false);
        lbShow.setVisible(true);
    }//GEN-LAST:event_lbHideMouseClicked

    private void lbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowMouseClicked
        tfPassword.setEchoChar('*');
        lbHide.setVisible(true);
        lbShow.setVisible(false);
    }//GEN-LAST:event_lbShowMouseClicked

    private void tfUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyTyped
        char input = evt.getKeyChar();
        if (!(input < '0' || input > '9') && input != '\b') {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Username doesn't contain any number!", "Warning", 2);
        }
    }//GEN-LAST:event_tfUsernameKeyTyped

    private void pnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLoginMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnLoginMousePressed

    private void pnLoginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLoginMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnLoginMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i < 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);

            try {
                Thread.sleep(40);

            } catch (InterruptedException ex) {
                Logger.getLogger(LoginJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void lbSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSignUpMouseClicked
        new SignUpFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_lbSignUpMouseClicked

    private void lbForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgotPasswordMouseClicked
        new ForgotPasswordFrame().setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_lbForgotPasswordMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (isEmpty()) {
            String username = tfUsername.getText().trim();
            String password = String.valueOf(tfPassword.getPassword());
            if (dao.getMaxRowAdminTable() != 1) {
                if (dao.login(username, password)) {
                    JOptionPane.showMessageDialog(this, "Login Success!!");
                    new HomeFrame().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect username and password", "Login Failed", 2);

                }
            } else {
                JOptionPane.showMessageDialog(this, "No admin in the admin table!!\nYou need to sign up first.", "Login Failed", 2);
                new SignUpFrame().setVisible(true);
                setVisible(false);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public boolean isEmpty() {
        if (tfUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is required", "Warning", 2);
            return false;
        }
        if (String.valueOf(tfPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is required", "Warning", 2);
            return false;
        }

        return true;
    }

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbForgotPassword;
    private javax.swing.JLabel lbHide;
    private javax.swing.JLabel lbShow;
    private javax.swing.JLabel lbSignUp;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
