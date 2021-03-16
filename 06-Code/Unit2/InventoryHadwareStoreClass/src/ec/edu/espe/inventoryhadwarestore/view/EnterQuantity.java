/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inventoryhadwarestore.view;

import com.google.gson.Gson;
import ec.edu.espe.inventoryhadwarestore.model.Inventory;
import ec.edu.espe.inventoryhadwarestore.model.Product;
import ec.edu.espe.inventoryhadwarestore.utils.MongoManager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa Zurita ESPE- DCCO
 */
public class EnterQuantity extends javax.swing.JFrame {

    /**
     * Creates new form IngresarCantidad
     */
    public EnterQuantity() {
        
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
        jLabel1 = new javax.swing.JLabel();
        txtProductToAdd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnQuantityOfProduct = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        lbTotalQuantity = new javax.swing.JLabel();
        btnRegistry = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Ingresar Cantidad de Producto al Inventario");

        txtProductToAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductToAddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Ingrese el Producto: ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Ingrese la cantidad que desea añadir: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Cantidad Total Actual");

        lbTotalQuantity.setText("0");
        lbTotalQuantity.setOpaque(true);

        btnRegistry.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnRegistry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventoryhadwarestore/imagen/check.png"))); // NOI18N
        btnRegistry.setText("Registrar");
        btnRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistryActionPerformed(evt);
            }
        });

        btnReload.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventoryhadwarestore/imagen/refresh.png"))); // NOI18N
        btnReload.setText("Recargar");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventoryhadwarestore/imagen/return.png"))); // NOI18N
        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 51));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventoryhadwarestore/imagen/exit.png"))); // NOI18N
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnQuantityOfProduct)
                            .addComponent(txtProductToAdd)
                            .addComponent(lbTotalQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(128, 128, 128))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnRegistry)
                        .addGap(57, 57, 57)
                        .addComponent(btnExit)
                        .addContainerGap(24, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProductToAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnQuantityOfProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotalQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistry)
                    .addComponent(btnReload)
                    .addComponent(btnReturn)
                    .addComponent(btnExit))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductToAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductToAddActionPerformed

    }//GEN-LAST:event_txtProductToAddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed

    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnRegistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistryActionPerformed

    }//GEN-LAST:event_btnRegistryActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed

    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(EnterQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterQuantity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnRegistry;
    public javax.swing.JButton btnReload;
    public javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbTotalQuantity;
    public javax.swing.JSpinner spnQuantityOfProduct;
    public javax.swing.JTextField txtProductToAdd;
    // End of variables declaration//GEN-END:variables
}
