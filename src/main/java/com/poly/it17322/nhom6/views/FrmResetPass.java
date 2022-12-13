/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.poly.it17322.nhom6.views;

import com.poly.it17322.nhom6.services.IDangNhapService;
import com.poly.it17322.nhom6.services.impl.DangNhapServiceImpl;
import com.poly.it17322.nhom6.utilities.MD5Util;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author LiamTrieu
 */
public class FrmResetPass extends javax.swing.JFrame {

    private final IDangNhapService dangNhapService = new DangNhapServiceImpl();
    private String mail;

    /**
     * Creates new form FrmDangNhap
     */
    public FrmResetPass(String email) {
        initComponents();
        setLocationRelativeTo(null);
        mail = email;
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
        lblTitile = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtpass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtpass2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(380, 210));
        setUndecorated(true);
        setResizable(false);

        pnlMainLogin.setBackground(new java.awt.Color(0, 102, 102));
        pnlMainLogin.setMaximumSize(new java.awt.Dimension(380, 210));
        pnlMainLogin.setMinimumSize(new java.awt.Dimension(380, 210));
        pnlMainLogin.setPreferredSize(new java.awt.Dimension(380, 210));

        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setMaximumSize(new java.awt.Dimension(30, 30));
        lblExit.setMinimumSize(new java.awt.Dimension(30, 30));
        lblExit.setPreferredSize(new java.awt.Dimension(30, 30));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        lblTitile.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTitile.setForeground(new java.awt.Color(255, 255, 255));
        lblTitile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitile.setText("Đổi mật khẩu");
        lblTitile.setMaximumSize(new java.awt.Dimension(330, 30));
        lblTitile.setMinimumSize(new java.awt.Dimension(330, 30));
        lblTitile.setPreferredSize(new java.awt.Dimension(330, 30));
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

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setMaximumSize(new java.awt.Dimension(340, 30));
        jPanel4.setMinimumSize(new java.awt.Dimension(340, 30));
        jPanel4.setPreferredSize(new java.awt.Dimension(340, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password.png"))); // NOI18N

        jPanel5.setMaximumSize(new java.awt.Dimension(304, 1));
        jPanel5.setMinimumSize(new java.awt.Dimension(304, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        txtpass.setBackground(new java.awt.Color(0, 102, 102));
        txtpass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setToolTipText("Mật khẩu mới");
        txtpass.setBorder(null);
        txtpass.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpass.setMaximumSize(new java.awt.Dimension(303, 20));
        txtpass.setMinimumSize(new java.awt.Dimension(303, 20));
        txtpass.setPreferredSize(new java.awt.Dimension(303, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(51, 51, 51));
        btnLogin.setText("Xong");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setMaximumSize(new java.awt.Dimension(70, 25));
        btnLogin.setMinimumSize(new java.awt.Dimension(70, 25));
        btnLogin.setPreferredSize(new java.awt.Dimension(70, 25));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setMaximumSize(new java.awt.Dimension(340, 30));
        jPanel6.setMinimumSize(new java.awt.Dimension(340, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass2.png"))); // NOI18N

        jPanel7.setMaximumSize(new java.awt.Dimension(304, 1));
        jPanel7.setMinimumSize(new java.awt.Dimension(304, 1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        txtpass2.setBackground(new java.awt.Color(0, 102, 102));
        txtpass2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpass2.setForeground(new java.awt.Color(255, 255, 255));
        txtpass2.setToolTipText("Nhập lại mật khẩu");
        txtpass2.setBorder(null);
        txtpass2.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpass2.setMaximumSize(new java.awt.Dimension(303, 20));
        txtpass2.setMinimumSize(new java.awt.Dimension(303, 20));
        txtpass2.setPreferredSize(new java.awt.Dimension(303, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpass2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainLoginLayout = new javax.swing.GroupLayout(pnlMainLogin);
        pnlMainLogin.setLayout(pnlMainLoginLayout);
        pnlMainLoginLayout.setHorizontalGroup(
            pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLoginLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblTitile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(pnlMainLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlMainLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel4, jPanel6});

        pnlMainLoginLayout.setVerticalGroup(
            pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLoginLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlMainLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel4, jPanel6});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new FrmDangNhap().setVisible(true);
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String pass1 = String.valueOf(txtpass.getPassword());
        String pass2 = String.valueOf(txtpass2.getPassword());
        if (pass1.trim().equals("") || pass1.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống dữ liệu");
            return;
        }
        if (!pass1.equals(pass2)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không chính xác");
            return;
        }
        if (pass1.length() <= 7) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải trên 8 ký tự");
            return;
        }
        try {
            String password = MD5Util.md5EnCode(pass1);
            if (dangNhapService.resetPass(password, mail)) {
                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");
                this.dispose();
                new FrmDangNhap().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thất bại");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hệ thống đang bận");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblTitile;
    private javax.swing.JPanel pnlMainLogin;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JPasswordField txtpass2;
    // End of variables declaration//GEN-END:variables
}
