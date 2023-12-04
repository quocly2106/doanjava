/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cfe;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Calculate;
import model.Dao;
import model.Payment;

/**
 *
 * @author Admin
 */
public class CartFrame extends javax.swing.JFrame {

    int xx, xy, rowIndex;
    Dao dao = new Dao();
    DefaultTableModel model;
    private double total = 0.0;
    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-dd");
    Calculate calculate = new Calculate();

    public CartFrame() {
        initComponents();
        init();
    }

    private void init() {
        tfPaymentID.setText(String.valueOf(dao.getMaxRowPaymentTable()));
        tfPaymentDate.setText(currentDate.format(formatter));
        tfSubTotal.setText(String.valueOf(dao.subTotal()));
        calculate.setSubtotal(Double.parseDouble(tfSubTotal.getText()));
        tfTax.setText(String.valueOf(calculate.getTax()));
        tfTotal.setText(String.valueOf(calculate.getTotal()));
        tableProduct();
    }

    private void tableProduct() {
        dao.getProductsFromCart(tbCart);
        model = (DefaultTableModel) tbCart.getModel();
        tbCart.setRowHeight(100);
        tbCart.setShowGrid(true);
        tbCart.setGridColor(Color.black);
        tbCart.setBackground(Color.white);
        tbCart.setSelectionBackground(Color.gray);
        tbCart.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCart = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCart = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tfPaymentID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfPaymentDate = new javax.swing.JTextField();
        tfTax = new javax.swing.JTextField();
        btnPayment = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfSubTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCustomName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfCash = new javax.swing.JTextField();
        tfChange = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnCart.setBackground(new java.awt.Color(158, 111, 78));
        pnCart.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnCartMouseDragged(evt);
            }
        });
        pnCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnCartMousePressed(evt);
            }
        });

        lbExit.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        lbExit.setForeground(new java.awt.Color(255, 255, 255));
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setText("X");
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });

        tbCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cart ID", "Product ID", "Product Name", "Quanlity", "Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(tbCart);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Payment ID :");

        tfPaymentID.setBackground(new java.awt.Color(204, 204, 204));
        tfPaymentID.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Payment Date:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tax($):");

        tfPaymentDate.setBackground(new java.awt.Color(204, 204, 204));
        tfPaymentDate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        tfTax.setEditable(false);
        tfTax.setBackground(new java.awt.Color(204, 204, 204));
        tfTax.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnPayment.setBackground(new java.awt.Color(237, 226, 219));
        btnPayment.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPayment.setText("Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sub Total($):");

        tfSubTotal.setEditable(false);
        tfSubTotal.setBackground(new java.awt.Color(204, 204, 204));
        tfSubTotal.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total($):");

        tfTotal.setEditable(false);
        tfTotal.setBackground(new java.awt.Color(204, 204, 204));
        tfTotal.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Custom Name:");

        tfCustomName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cash($):");

        tfCash.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tfCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCashKeyReleased(evt);
            }
        });

        tfChange.setEditable(false);
        tfChange.setBackground(new java.awt.Color(204, 204, 204));
        tfChange.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tfChange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfChangeKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Change($):");

        javax.swing.GroupLayout pnCartLayout = new javax.swing.GroupLayout(pnCart);
        pnCart.setLayout(pnCartLayout);
        pnCartLayout.setHorizontalGroup(
            pnCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCartLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(pnCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCartLayout.createSequentialGroup()
                        .addGroup(pnCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPaymentID)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(tfPaymentDate)
                            .addComponent(tfTax)
                            .addComponent(jLabel6)
                            .addComponent(tfSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(tfCustomName, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(tfCash, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(tfChange, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                            .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCartLayout.createSequentialGroup()
                        .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnCartLayout.setVerticalGroup(
            pnCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCartLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPayment))
                    .addGroup(pnCartLayout.createSequentialGroup()
                        .addComponent(tfPaymentID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTax, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCustomName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCash, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfChange, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        setVisible(false);
    }//GEN-LAST:event_lbExitMouseClicked

    private void pnCartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCartMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnCartMousePressed

    private void pnCartMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCartMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnCartMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i < 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);

            try {
                Thread.sleep(40);

            } catch (InterruptedException ex) {
                Logger.getLogger(CartFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        model = (DefaultTableModel) tbCart.getModel();
        String proName = "";
        String proId = "";
        for (int i = 0; i < model.getRowCount(); i++) {
            proId += model.getValueAt(i, 1).toString() + ",";
            proName += model.getValueAt(i, 2).toString() + ",";
        }

        int pid = dao.getMaxRowPaymentTable() + 1;
        String cName = tfCustomName.getText().trim();
        double t = Double.parseDouble(tfTotal.getText().trim());

        Payment payment = new Payment();
        payment.setPid(pid);
        payment.setcName(cName);
        payment.setProId(proId);
        payment.setProName(proName);
        payment.setTotal(t);
        payment.setDate(tfPaymentDate.getText().trim());

        if (check()) {
            if (dao.insertPayment(payment)) {
                JOptionPane.showMessageDialog(this, "Payment Succeed!!");
                int cid = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
                dao.deleteCart(cid);

                int x = JOptionPane.showConfirmDialog(this, "Do you want to print the receipt?", "Print", JOptionPane.YES_NO_OPTION, 0);
                if (x == JOptionPane.YES_OPTION) {
                    try {
                        MessageFormat header = new MessageFormat("***Hut Cafe ***" + "Customer Name:" + cName + " " + "Total($): " + t);
                        MessageFormat footer = new MessageFormat("Page {0, number , integer}");
                        tbCart.print(JTable.PrintMode.FIT_WIDTH, header, footer);
                        setVisible(false);
                    } catch (PrinterException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                } else {
                    setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Payment Failed..", "Warning", 2);
            }
        }
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void tfChangeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfChangeKeyReleased

    }//GEN-LAST:event_tfChangeKeyReleased

    private void tfCashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCashKeyReleased
        cash();
    }//GEN-LAST:event_tfCashKeyReleased

    public void cash(){
        try {
            double cash = Double.parseDouble(tfCash.getText().trim());
            double total = Double.parseDouble(tfTotal.getText().trim());
            double change = (cash - total);
            tfChange.setText(String.valueOf(change));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Not enough cash entered", "Warning", 2);
        }
    }
    
    public boolean check() {
        if (tfCustomName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Customer name is required", " Warning", 2);
            return false;
        }
        if (tfCash.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Cash is required", " Warning", 2);
            return false;
        }
        double change = Double.parseDouble(tfChange.getText().trim());
        if (change < 0.0) {
            JOptionPane.showMessageDialog(this, "Not enough cash entered", "Warning", 2);
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
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPayment;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbExit;
    private javax.swing.JPanel pnCart;
    private javax.swing.JTable tbCart;
    private javax.swing.JTextField tfCash;
    private javax.swing.JTextField tfChange;
    private javax.swing.JTextField tfCustomName;
    private javax.swing.JTextField tfPaymentDate;
    private javax.swing.JTextField tfPaymentID;
    private javax.swing.JTextField tfSubTotal;
    private javax.swing.JTextField tfTax;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables

}
