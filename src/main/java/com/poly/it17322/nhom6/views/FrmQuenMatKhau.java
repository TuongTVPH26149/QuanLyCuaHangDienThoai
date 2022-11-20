/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.poly.it17322.nhom6.views;

import com.poly.it17322.nhom6.services.IDangNhapService;
import com.poly.it17322.nhom6.services.impl.DangNhapServiceImpl;
import com.poly.it17322.nhom6.utilities.SenderMailUtil;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author LiamTrieu
 */
public class FrmQuenMatKhau extends javax.swing.JFrame {

    private IDangNhapService dnService = new DangNhapServiceImpl();
    private int code;
    private String email;
    private int check = 0;
    private Thread t1;

    /**
     * Creates new form FrmQuenMatKhau
     */
    public FrmQuenMatKhau() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainLogin = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtTaiKhoan = new javax.swing.JTextField();
        lblTitile = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(377, 165));
        setMinimumSize(new java.awt.Dimension(377, 165));
        setUndecorated(true);

        pnlMainLogin.setBackground(new java.awt.Color(51, 51, 51));
        pnlMainLogin.setMaximumSize(new java.awt.Dimension(377, 165));
        pnlMainLogin.setMinimumSize(new java.awt.Dimension(377, 165));
        pnlMainLogin.setPreferredSize(new java.awt.Dimension(377, 165));

        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setIcon(new ImageIcon("src/main/resource/icon/close.png"));
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setMaximumSize(new java.awt.Dimension(30, 30));
        lblExit.setMinimumSize(new java.awt.Dimension(30, 30));
        lblExit.setPreferredSize(new java.awt.Dimension(30, 30));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(340, 30));
        jPanel2.setMinimumSize(new java.awt.Dimension(340, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new ImageIcon("src/main/resource/icon/account.png"));
        jLabel1.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel1.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel1.setPreferredSize(new java.awt.Dimension(24, 24));

        jPanel3.setMaximumSize(new java.awt.Dimension(304, 1));
        jPanel3.setMinimumSize(new java.awt.Dimension(304, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        txtTaiKhoan.setBackground(new java.awt.Color(51, 51, 51));
        txtTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        txtTaiKhoan.setBorder(null);
        txtTaiKhoan.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTaiKhoan.setMaximumSize(new java.awt.Dimension(303, 20));
        txtTaiKhoan.setMinimumSize(new java.awt.Dimension(303, 20));
        txtTaiKhoan.setPreferredSize(new java.awt.Dimension(303, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        lblTitile.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTitile.setForeground(new java.awt.Color(255, 255, 255));
        lblTitile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitile.setText("Forgot password");
        lblTitile.setMaximumSize(new java.awt.Dimension(300, 30));
        lblTitile.setMinimumSize(new java.awt.Dimension(300, 30));
        lblTitile.setPreferredSize(new java.awt.Dimension(300, 30));
        lblTitile.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTitileMouseDragged(evt);
            }
        });
        lblTitile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTitileMousePressed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(255, 255, 255));
        btnSend.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSend.setForeground(new java.awt.Color(51, 51, 51));
        btnSend.setText("Send");
        btnSend.setBorder(null);
        btnSend.setBorderPainted(false);
        btnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSend.setMaximumSize(new java.awt.Dimension(70, 25));
        btnSend.setMinimumSize(new java.awt.Dimension(70, 25));
        btnSend.setPreferredSize(new java.awt.Dimension(70, 25));
        btnSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSendMouseEntered(evt);
            }
        });
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lblLogin.setIcon(new ImageIcon("src/main/resource/icon/undo.png"));
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.setMaximumSize(new java.awt.Dimension(30, 30));
        lblLogin.setMinimumSize(new java.awt.Dimension(30, 30));
        lblLogin.setPreferredSize(new java.awt.Dimension(30, 30));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLoginLayout = new javax.swing.GroupLayout(pnlMainLogin);
        pnlMainLogin.setLayout(pnlMainLoginLayout);
        pnlMainLoginLayout.setHorizontalGroup(
            pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLoginLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblTitile, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(pnlMainLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        pnlMainLoginLayout.setVerticalGroup(
            pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLoginLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMainLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblTitileMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitileMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblTitileMouseDragged
    private int xMouse;
    private int yMouse;
    private void lblTitileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitileMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lblTitileMousePressed

    private void btnSendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendMouseEntered

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        email = txtTaiKhoan.getText();
        if (dnService.checkMail(email) == null) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy email trong hệ thống");
            return;
        }
        code = genCode();

        t1 = new Thread() {
            @Override
            public void run() {
                new SenderMailUtil().sendMail("Mobiking mã xác minh", "Code: " + code, email);
                t1.stop();
            }
        };
        t1.start();
        JOptionPane.showMessageDialog(this, "Mã xác minh đã được gửi tới email");
        this.dispose();
        new FrmXacMinh(email, code).setVisible(true);
    }//GEN-LAST:event_btnSendActionPerformed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new FrmDangNhap().setVisible(true);
    }//GEN-LAST:event_lblLoginMouseClicked

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmQuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmQuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmQuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmQuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmQuenMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblTitile;
    private javax.swing.JPanel pnlMainLogin;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables

    private int genCode() {
        return (int) (Math.random() * (999999 - 111111 + 1) + 111111);
    }
}
