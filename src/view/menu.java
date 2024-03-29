/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author DELL
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSach = new javax.swing.JButton();
        btnMTra = new javax.swing.JButton();
        btnDG = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý thư viện");

        btnSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hinh/Documents.png"))); // NOI18N
        btnSach.setText("Quản lý sách");
        btnSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSachActionPerformed(evt);
            }
        });

        btnMTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hinh/Task list.png"))); // NOI18N
        btnMTra.setText("Quản lý mượn - trả");
        btnMTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTraActionPerformed(evt);
            }
        });

        btnDG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hinh/Users.png"))); // NOI18N
        btnDG.setText("Quản lý độc giả");
        btnDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDGActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hinh/Log out.png"))); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hinh/Statistics.png"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSach, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMTra, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(btnDG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSach, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDG, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMTra, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDGActionPerformed
        // TODO add your handling code here:
        QuanLyDocGia qldg = new QuanLyDocGia();
        qldg.setVisible(true);
        
    }//GEN-LAST:event_btnDGActionPerformed

    private void btnSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSachActionPerformed
        // TODO add your handling code here:
        QuanLySach qls = new QuanLySach();
        qls.setVisible(true);
        
    }//GEN-LAST:event_btnSachActionPerformed

    private void btnMTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMTraActionPerformed
        // TODO add your handling code here:
        quanLyMuonTra mt = new quanLyMuonTra();
        mt.setVisible(true);
    }//GEN-LAST:event_btnMTraActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        ThongKe tk = new ThongKe();
        tk.setVisible(true);
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        DangNhap login = new DangNhap();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDG;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMTra;
    private javax.swing.JButton btnSach;
    private javax.swing.JButton btnThongKe;
    // End of variables declaration//GEN-END:variables

    private void depose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
