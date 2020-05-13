/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;

/**
 *
 * @author akash004
 */
public class MyBooking extends javax.swing.JInternalFrame {
    String user;
    /**
     * Creates new form MyBooking
     */
    public MyBooking() {
        initComponents();
    }

    MyBooking(String luser) {
        initComponents();
         this.user=luser;
              connection();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void connection()
    {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //  con=DriverManager.getConnection( databaseUrl, "root", "akash");
       Connection  con=DriverManager.getConnection("jdbc:mysql://localhost/busbooking","root","akash");
        Statement stat=con.createStatement();
         
           
            String selectQuery = "select booking_id,journey_date,bus_no,seatno from bus_booking where booking_user='"+user+"'";
            ResultSet rs=stat.executeQuery(selectQuery);
         
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
           
            
        }
        catch(Exception e)
        {
           // System.out.println(e);
            
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        busbookingPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("busbookingPU").createEntityManager();
        busBookingQuery = java.beans.Beans.isDesignTime() ? null : busbookingPUEntityManager.createQuery("SELECT b FROM BusBooking b");
        busBookingList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busBookingQuery.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("My Booking");
        setPreferredSize(new java.awt.Dimension(750, 500));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<busbooking.BusBooking> busBookingList;
    private javax.persistence.Query busBookingQuery;
    private javax.persistence.EntityManager busbookingPUEntityManager;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
