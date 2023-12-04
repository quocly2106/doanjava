    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cfe;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class HomeFrame extends javax.swing.JFrame {


    public HomeFrame() {
        initComponents();
        setDateTime();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddProduct = new javax.swing.JButton();
        btnManageProduct = new javax.swing.JButton();
        btnAllProduct = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnViewOrders = new javax.swing.JButton();
        btnStatistics = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbPM = new javax.swing.JLabel();
        lbDay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddProduct.setBackground(new java.awt.Color(237, 226, 219));
        btnAddProduct.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnAddProduct.setText("Add Product");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 180, 40));

        btnManageProduct.setBackground(new java.awt.Color(237, 226, 219));
        btnManageProduct.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnManageProduct.setText("Manage Product");
        btnManageProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnManageProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 180, 40));

        btnAllProduct.setBackground(new java.awt.Color(237, 226, 219));
        btnAllProduct.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnAllProduct.setText("All Product");
        btnAllProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnAllProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 180, 40));

        btnOrder.setBackground(new java.awt.Color(237, 226, 219));
        btnOrder.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 180, 40));

        btnViewOrders.setBackground(new java.awt.Color(237, 226, 219));
        btnViewOrders.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnViewOrders.setText("View Orders");
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 180, 40));

        btnStatistics.setBackground(new java.awt.Color(237, 226, 219));
        btnStatistics.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnStatistics.setText("Statistics");
        btnStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticsActionPerformed(evt);
            }
        });
        getContentPane().add(btnStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 180, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hut Coffee");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, -1));

        lbTime.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbTime.setForeground(new java.awt.Color(255, 255, 255));
        lbTime.setText("00:00:00");
        getContentPane().add(lbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, -1, -1));

        lbPM.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbPM.setForeground(new java.awt.Color(255, 255, 255));
        lbPM.setText("PM");
        getContentPane().add(lbPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, -1, -1));

        lbDay.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbDay.setForeground(new java.awt.Color(255, 255, 255));
        lbDay.setText("Monday , 11/8/2023");
        getContentPane().add(lbDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1200, 675));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        new AddProductFrame().setVisible(true);
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnManageProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductActionPerformed
        new ManageProductsFrame().setVisible(true);
    }//GEN-LAST:event_btnManageProductActionPerformed

    private void btnAllProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllProductActionPerformed
        new AllProductFrame().setVisible(true);
    }//GEN-LAST:event_btnAllProductActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        new OrderFrame().setVisible(true);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        new ViewOrdersFrame().setVisible(true);
    }//GEN-LAST:event_btnViewOrdersActionPerformed

    private void btnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticsActionPerformed
        new StatisticsFrame().setVisible(true);
    }//GEN-LAST:event_btnStatisticsActionPerformed

    private void setDateTime(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                        
                    } catch (InterruptedException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE , yyyy-MM-dd");
                    String time = tf.format(date);
                    lbTime.setText(time.split("")[0]);
                    lbPM.setText(time.split("")[1]);
                    lbDay.setText(df.format(date));
                }
            }
        }).start();
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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnAllProduct;
    private javax.swing.JButton btnManageProduct;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbDay;
    private javax.swing.JLabel lbPM;
    private javax.swing.JLabel lbTime;
    // End of variables declaration//GEN-END:variables
}
