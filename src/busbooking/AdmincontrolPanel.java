/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busbooking;

import java.util.logging.Logger;

/**
 *
 * @author akash004
 */
public class AdmincontrolPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdmincontrolPanel
     */
    String luser;
    public AdmincontrolPanel() {
        initComponents();
    }

    AdmincontrolPanel(String loginUser) {
      
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      initComponents();
        this.luser=loginUser;
        String getvalue=admin_name.getText();
        admin_name.setText(getvalue+":"+luser);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin_name = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        addbusdetails = new javax.swing.JMenuItem();
        deletebusdetails = new javax.swing.JMenuItem();
        allbusdetails = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Addadmin = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        btn_exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        admin_name.setText("Welcome:");

        jMenuBar1.setBackground(new java.awt.Color(52, 37, 234));
        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setForeground(java.awt.SystemColor.activeCaptionText);
        jMenuBar1.setToolTipText("");
        jMenuBar1.setPreferredSize(new java.awt.Dimension(541, 35));

        jMenu5.setBackground(new java.awt.Color(241, 239, 229));
        jMenu5.setForeground(new java.awt.Color(12, 26, 26));
        jMenu5.setText("Manage Bus");
        jMenu5.setOpaque(true);

        addbusdetails.setBackground(new java.awt.Color(255, 255, 255));
        addbusdetails.setForeground(new java.awt.Color(60, 59, 55));
        addbusdetails.setText("Add Bus Details");
        addbusdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbusdetailsActionPerformed(evt);
            }
        });
        jMenu5.add(addbusdetails);

        deletebusdetails.setBackground(new java.awt.Color(255, 255, 255));
        deletebusdetails.setForeground(new java.awt.Color(60, 59, 55));
        deletebusdetails.setText("Delete Bus Details");
        deletebusdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebusdetailsActionPerformed(evt);
            }
        });
        jMenu5.add(deletebusdetails);

        allbusdetails.setBackground(new java.awt.Color(255, 255, 255));
        allbusdetails.setForeground(new java.awt.Color(60, 59, 55));
        allbusdetails.setText("All Bus Details");
        allbusdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allbusdetailsActionPerformed(evt);
            }
        });
        jMenu5.add(allbusdetails);

        jMenuBar1.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(241, 239, 229));
        jMenu6.setForeground(new java.awt.Color(8, 22, 22));
        jMenu6.setText("Booking");
        jMenu6.setOpaque(true);

        jMenuItem9.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem9.setForeground(new java.awt.Color(60, 59, 55));
        jMenuItem9.setText("Booking Details");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        jMenu3.setBackground(new java.awt.Color(241, 239, 229));
        jMenu3.setForeground(new java.awt.Color(9, 17, 17));
        jMenu3.setText("Manage Admin");
        jMenu3.setOpaque(true);

        Addadmin.setBackground(new java.awt.Color(255, 255, 255));
        Addadmin.setForeground(new java.awt.Color(60, 59, 55));
        Addadmin.setText("Add admin");
        Addadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddadminActionPerformed(evt);
            }
        });
        jMenu3.add(Addadmin);

        jMenuItem8.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setForeground(new java.awt.Color(60, 59, 55));
        jMenuItem8.setText("Edit Admin");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        btn_exit.setBackground(new java.awt.Color(241, 239, 229));
        btn_exit.setForeground(new java.awt.Color(21, 18, 10));
        btn_exit.setText("Exit");
        btn_exit.setOpaque(true);
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jMenuBar1.add(btn_exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(696, Short.MAX_VALUE)
                .addComponent(admin_name, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(admin_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static final Logger LOG = Logger.getLogger(AdmincontrolPanel.class.getName());

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void AddadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddadminActionPerformed
        // TODO add your handling code here:
        AddAdmin adm=new AddAdmin();
       jDesktopPane1.add(adm);
       adm.show();
        
        
    }//GEN-LAST:event_AddadminActionPerformed

    private void addbusdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbusdetailsActionPerformed
        // TODO add your handling code here:
        
        AddBusDetails abs=new AddBusDetails();
        jDesktopPane1.add(abs);
        abs.show();
        
    }//GEN-LAST:event_addbusdetailsActionPerformed

    private void deletebusdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebusdetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebusdetailsActionPerformed

    private void allbusdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allbusdetailsActionPerformed
        // TODO add your handling code here:
        
        AllBusDetails abd=new AllBusDetails();
         jDesktopPane1.add(abd);
        abd.show();
    }//GEN-LAST:event_allbusdetailsActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:  AllBusDetails abd=new AllBusDetails();
        AllBooking ab=new AllBooking();
        jDesktopPane1.add(ab);
        ab.show();
        
        
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
       // System.out.print("hello to pk");
        //dispose();
        //MainScreen ms=new MainScreen();
        
        // ms.setLocationRelativeTo(null);
         //   ms.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        // TODO add your handling code here:
        // System.out.print("hello to pk");
         dispose();
        MainScreen ms=new MainScreen();
        
         ms.setLocationRelativeTo(null);
            ms.setVisible(true);
    }//GEN-LAST:event_btn_exitMouseClicked

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
            java.util.logging.Logger.getLogger(AdmincontrolPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmincontrolPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmincontrolPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmincontrolPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmincontrolPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Addadmin;
    private javax.swing.JMenuItem addbusdetails;
    private javax.swing.JLabel admin_name;
    private javax.swing.JMenuItem allbusdetails;
    private javax.swing.JMenu btn_exit;
    private javax.swing.JMenuItem deletebusdetails;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
