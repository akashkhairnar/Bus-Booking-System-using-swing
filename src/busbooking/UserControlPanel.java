/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busbooking;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;

/**
 *
 * @author akash004
 */
public class UserControlPanel extends javax.swing.JFrame {

    /**
     * Creates new form UserControlPanel
     */
    String luser;
    List<Object> list=new ArrayList<Object>();
    
            
    public UserControlPanel() {
        initComponents();
    }
    public UserControlPanel(String loginUser)
    {
         initComponents();
        this.luser=loginUser;
        String getvalue=et_userlabel.getText();
        et_userlabel.setText(getvalue+":"+luser);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        et_userlabel = new javax.swing.JLabel();
        userpanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        addbooking = new javax.swing.JMenu();
        mybooking = new javax.swing.JMenuItem();
        add_booking = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        btn_exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        et_userlabel.setText("Welome");

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        addbooking.setBackground(new java.awt.Color(37, 24, 34));
        addbooking.setForeground(new java.awt.Color(246, 221, 238));
        addbooking.setText("Booking");
        addbooking.setOpaque(true);

        mybooking.setText("My  Booking");
        mybooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mybookingActionPerformed(evt);
            }
        });
        addbooking.add(mybooking);

        add_booking.setText("Add Booking");
        add_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bookingActionPerformed(evt);
            }
        });
        addbooking.add(add_booking);

        jMenuItem1.setText("deleteBooking");
        jMenuItem1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenuItem1StateChanged(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        addbooking.add(jMenuItem1);

        jMenuBar1.add(addbooking);

        btn_exit.setText("Exit");
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });
        jMenuBar1.add(btn_exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 773, Short.MAX_VALUE)
                .addComponent(et_userlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addComponent(userpanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(et_userlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mybookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mybookingActionPerformed
        // TODO add your handling code here:
       if(!list.isEmpty())
        {
          Object ob=list.get(0);
           if(ob instanceof DeleteBooking) {
              // System.out.println("Delete Booking");
               DeleteBooking ob2=(DeleteBooking)ob;
               ob2.dispose();
           }
            if(ob instanceof AddBooking) {
              // System.out.println("Add Booking");
               AddBooking ob2=(AddBooking)ob;
                ob2.dispose();
           }
             if(ob instanceof MyBooking) {
              // System.out.println("My Booking");
               MyBooking ob2=(MyBooking)ob;
               ob2.dispose();
           }
             list.clear();
        }
         MyBooking myb=new MyBooking(luser);
          list.add(myb);
         userpanel.add(myb);
        myb.show();
        
    }//GEN-LAST:event_mybookingActionPerformed

    private void add_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bookingActionPerformed
        // TODO add your handling code here:
       if(!list.isEmpty())
        {
          Object ob=list.get(0);
           if(ob instanceof DeleteBooking) {
               System.out.println("Delete Booking");
               DeleteBooking ob2=(DeleteBooking)ob;
               ob2.dispose();
           }
            if(ob instanceof AddBooking) {
               System.out.println("Add Booking");
               AddBooking ob2=(AddBooking)ob;
                ob2.dispose();
           }
             if(ob instanceof MyBooking) {
               System.out.println("My Booking");
               MyBooking ob2=(MyBooking)ob;
               ob2.dispose();
           }
             list.clear();
        }
       AddBooking addb=new AddBooking(luser);
         list.add(addb);
         userpanel.add(addb);
        addb.show();
    }//GEN-LAST:event_add_bookingActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here: 
        if(!list.isEmpty())
        {
          Object ob=list.get(0);
           if(ob instanceof DeleteBooking) {
               System.out.println("Delete Booking");
               DeleteBooking ob2=(DeleteBooking)ob;
               ob2.dispose();
     
           }
            if(ob instanceof AddBooking) {
               System.out.println("Add Booking");
               AddBooking ob2=(AddBooking)ob;
                ob2.dispose();
     
           }
             if(ob instanceof MyBooking) {
               System.out.println("My Booking");
               MyBooking ob2=(MyBooking)ob;
               ob2.dispose();
               
           }
             list.clear();
        }
        DeleteBooking db=new DeleteBooking(luser);
        list.add(db);
        userpanel.add(db);
        db.show();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenuItem1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1StateChanged

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add_booking;
    private javax.swing.JMenu addbooking;
    private javax.swing.JMenu btn_exit;
    private javax.swing.JLabel et_userlabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mybooking;
    private javax.swing.JDesktopPane userpanel;
    // End of variables declaration//GEN-END:variables
}
