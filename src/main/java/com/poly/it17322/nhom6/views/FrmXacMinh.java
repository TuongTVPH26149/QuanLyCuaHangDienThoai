/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.poly.it17322.nhom6.views;

import com.poly.it17322.nhom6.utilities.SenderMailUtil;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author LiamTrieu
 */
public class FrmXacMinh extends javax.swing.JFrame {

    private Thread undocode;
    private Thread t2;
    private String email;
    private int code;

    /**
     * Creates new form FrmQuenMatKhau
     */
    public FrmXacMinh(String mail, int ma) {
        initComponents();
        this.setLocationRelativeTo(null);
        email = mail;
        code = ma;
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
        txtCode = new javax.swing.JTextField();
        lblTitile = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        btnUndoCode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(377, 165));
        setUndecorated(true);

        pnlMainLogin.setBackground(new java.awt.Color(0, 102, 102));
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

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(267, 30));
        jPanel2.setMinimumSize(new java.awt.Dimension(267, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new ImageIcon("src/main/resource/icon/authentication.png"));
        jLabel1.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel1.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel1.setPreferredSize(new java.awt.Dimension(24, 24));

        jPanel3.setMaximumSize(new java.awt.Dimension(265, 1));
        jPanel3.setMinimumSize(new java.awt.Dimension(265, 1));
        jPanel3.setPreferredSize(new java.awt.Dimension(265, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        txtCode.setBackground(new java.awt.Color(0, 102, 102));
        txtCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setToolTipText("Mã xác minh");
        txtCode.setBorder(null);
        txtCode.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCode.setMaximumSize(new java.awt.Dimension(260, 20));
        txtCode.setMinimumSize(new java.awt.Dimension(260, 20));
        txtCode.setPreferredSize(new java.awt.Dimension(260, 20));
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        lblTitile.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTitile.setForeground(new java.awt.Color(255, 255, 255));
        lblTitile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitile.setText("Xác minh mã");
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

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(51, 51, 51));
        btnSubmit.setText("Xong");
        btnSubmit.setBorder(null);
        btnSubmit.setBorderPainted(false);
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.setMaximumSize(new java.awt.Dimension(70, 25));
        btnSubmit.setMinimumSize(new java.awt.Dimension(70, 25));
        btnSubmit.setPreferredSize(new java.awt.Dimension(70, 25));
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
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

        btnUndoCode.setBackground(new java.awt.Color(255, 255, 255));
        btnUndoCode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUndoCode.setForeground(new java.awt.Color(51, 51, 51));
        btnUndoCode.setIcon(new ImageIcon("src/main/resource/icon/refresh.png"));
        btnUndoCode.setToolTipText("Gửi lại mã");
        btnUndoCode.setBorder(null);
        btnUndoCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUndoCode.setMaximumSize(new java.awt.Dimension(30, 30));
        btnUndoCode.setMinimumSize(new java.awt.Dimension(30, 30));
        btnUndoCode.setPreferredSize(new java.awt.Dimension(30, 30));
        btnUndoCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUndoCodeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUndoCodeMouseEntered(evt);
            }
        });
        btnUndoCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLoginLayout = new javax.swing.GroupLayout(pnlMainLogin);
        pnlMainLogin.setLayout(pnlMainLoginLayout);
        pnlMainLoginLayout.setHorizontalGroup(
            pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLoginLayout.createSequentialGroup()
                        .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblTitile, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLoginLayout.createSequentialGroup()
                        .addGroup(pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMainLoginLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUndoCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
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
                .addGroup(pnlMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUndoCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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
        this.dispose();
        new FrmDangNhap().setVisible(true);
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

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        try {
            if (Integer.parseInt(txtCode.getText()) == code) {
                this.dispose();
                new FrmResetPass(email).setVisible(true);
                return;
            }
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "Mã xác minh không chính xác hoặc đã hết hạn");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new FrmQuenMatKhau().setVisible(true);
    }//GEN-LAST:event_lblLoginMouseClicked

    private void btnUndoCodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUndoCodeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUndoCodeMouseEntered

    private void btnUndoCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoCodeActionPerformed
        // TODO add your handling code here:
        code = genCode();
        t2 = new Thread() {
            @Override
            public void run() {
                new SenderMailUtil().sendMail("Mobiking mã xác minh", "Code: " + code, email);
                t2.stop();
            }
        };
        t2.start();
        JOptionPane.showMessageDialog(this, "Mã xác minh đã được gửi tới email");
        undocode = new Thread() {
            @Override
            public void run() {
                for (int i = 60; i >= 0; i--) {
                    if (i == 0) {
                        btnUndoCode.setEnabled(true);
                        btnUndoCode.setText(null);
                        btnUndoCode.setIcon(new ImageIcon("src/main/resource/icon/sendundo.png"));
                    } else {
                        btnUndoCode.setEnabled(false);
                        btnUndoCode.setIcon(null);
                        btnUndoCode.setText(i + "");
                    }
                    try {
                        undocode.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                undocode.stop();
            }
        };
        undocode.start();
    }//GEN-LAST:event_btnUndoCodeActionPerformed

    private void btnUndoCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUndoCodeMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnUndoCodeMouseClicked

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUndoCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblTitile;
    private javax.swing.JPanel pnlMainLogin;
    private javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables

    private int genCode() {
        return (int) (Math.random() * (999999 - 111111 + 1) + 111111);
    }
}
