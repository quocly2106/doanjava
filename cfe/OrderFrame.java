/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cfe;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import model.Cart;
import model.Dao;

/**
 *
 * @author Admin
 */
public class OrderFrame extends javax.swing.JFrame {

    /**
     * Creates new form OrderFrame
     */
    int xx, xy, rowIndex;
    Dao dao = new Dao();
    DefaultTableModel model;
    private double price = 0.0, total = 0.0;

    public OrderFrame() {
        initComponents();
        tfCartID.setText(String.valueOf(dao.getMaxRowOrderTable()));
        tableProduct();
    }

    private void tableProduct() {
        dao.getallProducts(tbOrder);
        model = (DefaultTableModel) tbOrder.getModel();
        tbOrder.setRowHeight(100);
        tbOrder.setShowGrid(true);
        tbOrder.setGridColor(Color.black);
        tbOrder.setBackground(Color.white);
        tbOrder.setSelectionBackground(Color.gray);
        tbOrder.setModel(model);
        tbOrder.getTableHeader().setReorderingAllowed(false);
        tbOrder.getColumnModel().getColumn(3).setCellRenderer(new OrderFrame.ImageRenderer());

    }

    private class ImageRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel jL = new JLabel();
            byte[] bytes = (byte[]) value;
            ImageIcon imageicon = new ImageIcon(new ImageIcon(bytes).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            jL.setIcon(imageicon);
            return jL;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnOrder = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrder = new javax.swing.JTable();
        lbTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCartID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfProductName = new javax.swing.JTextField();
        tfQuanlity = new javax.swing.JTextField();
        btnAddtoCart = new javax.swing.JButton();
        Cart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnOrder.setBackground(new java.awt.Color(158, 111, 78));
        pnOrder.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnOrderMouseDragged(evt);
            }
        });
        pnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnOrderMousePressed(evt);
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

        tbOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Price", "Image"
            }
        ));
        tbOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbOrder);

        lbTotal.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(255, 255, 255));
        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTotal.setText("Total($):0.0");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cart ID :");

        tfCartID.setBackground(new java.awt.Color(204, 204, 204));
        tfCartID.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Name:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quanlity:");

        tfProductName.setBackground(new java.awt.Color(204, 204, 204));
        tfProductName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        tfQuanlity.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tfQuanlity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfQuanlity.setText("0");

        btnAddtoCart.setBackground(new java.awt.Color(237, 226, 219));
        btnAddtoCart.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAddtoCart.setText("Add to Cart");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });

        Cart.setBackground(new java.awt.Color(237, 226, 219));
        Cart.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cart.setText("Cart");
        Cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnOrderLayout = new javax.swing.GroupLayout(pnOrder);
        pnOrder.setLayout(pnOrderLayout);
        pnOrderLayout.setHorizontalGroup(
            pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnOrderLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCartID)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(tfProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(tfQuanlity, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(btnAddtoCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnOrderLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnOrderLayout.createSequentialGroup()
                            .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnOrderLayout.createSequentialGroup()
                            .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)))))
        );
        pnOrderLayout.setVerticalGroup(
            pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(lbTotal)
                .addGap(18, 18, 18)
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnOrderLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCartID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuanlity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnAddtoCart, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Cart, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        setVisible(false);
    }//GEN-LAST:event_lbExitMouseClicked

    private void pnOrderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnOrderMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnOrderMousePressed

    private void pnOrderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnOrderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnOrderMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i < 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);

            try {
                Thread.sleep(40);

            } catch (InterruptedException ex) {
                Logger.getLogger(OrderFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void tbOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOrderMouseClicked
        model = (DefaultTableModel) tbOrder.getModel();
        rowIndex = tbOrder.getSelectedRow();
        tfProductName.setText(model.getValueAt(rowIndex, 1).toString());
    }//GEN-LAST:event_tbOrderMouseClicked

    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
        if (tfProductName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a product", " Warning ", 2);
        } else if (tfQuanlity.getText().isEmpty() || tfQuanlity.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, "Product quanlity is required", " Warning ", 2);
        } else {
            try {
                model = (DefaultTableModel) tbOrder.getModel();
                int cid = Integer.parseInt(tfCartID.getText().trim());
                int qty = Integer.parseInt(tfQuanlity.getText().trim());
                int proId = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
                String pName = tfProductName.getText().trim();

                price = Double.parseDouble(model.getValueAt(rowIndex, 2).toString());

                if (!dao.isProductExist(cid, proId)) {
                    Cart cart = new Cart();
                    cart.setId(cid);
                    cart.setPid(proId);
                    cart.setpName(pName);
                    cart.setQty(qty);
                    cart.setPrice(price);
                    cart.setTotal(price * (double) qty);
                    total += price * (double) qty;

                    lbTotal.setText(String.format("Total ($) :" + "%.2f", total));
                    if (dao.insertCart(cart)) {
                        JOptionPane.showMessageDialog(this, "Product added ");
                        clear();

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "This product alrealy exists", " Warning ", 2);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "" + e, " Warning ", 2);
            }

        }
    }//GEN-LAST:event_btnAddtoCartActionPerformed

    private void CartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartActionPerformed
        if(total != 0.0){
            new CartFrame().setVisible(true);
            setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "You haven't purchased any product ","Warning" , 2);
            
        }
    }//GEN-LAST:event_CartActionPerformed

    private void clear() {
        tfProductName.setText(null);
        tfQuanlity.setText("0");
        tbOrder.clearSelection();
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
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cart;
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel pnOrder;
    private javax.swing.JTable tbOrder;
    private javax.swing.JTextField tfCartID;
    private javax.swing.JTextField tfProductName;
    private javax.swing.JTextField tfQuanlity;
    // End of variables declaration//GEN-END:variables
}
