/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkroll;

import com.mysql.jdbc.Statement;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class template extends javax.swing.JFrame {

    /**
     * Creates new form template
     */
    public template() {
        initComponents();
        Connect();
    }
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    PreparedStatement pst1;
    DefaultTableModel df;
    
    public void Connect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cashire", "root","");
        } catch (ClassNotFoundException  ex) {
            Logger.getLogger(template.class.getName()).log(Level.SEVERE, null, ex);
        } catch ( SQLException ex) {
            Logger.getLogger(template.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bbalance = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        bqty = new javax.swing.JSpinner();
        total = new javax.swing.JButton();
        btotal = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        bpay = new javax.swing.JTextField();
        bprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("bokkshop");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("BOOKSHOP      ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("TOTAL");

        jLabel2.setText("ID");

        jLabel5.setText("PAYMENT");

        bbalance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setText("QTY");

        jLabel8.setText("BALANCE");

        jLabel9.setText("NAME");

        jLabel10.setText("PRICE");

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        total.setText("TOTAL");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        btotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });
        bid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bidKeyPressed(evt);
            }
        });

        bname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnameActionPerformed(evt);
            }
        });

        bpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpayActionPerformed(evt);
            }
        });

        bprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpriceActionPerformed(evt);
            }
        });

        jButton1.setText("GET BALANCE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(bqty, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                    .addComponent(bid)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bname)
                                    .addComponent(bprice)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(btotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bpay))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bbalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel2)
                    .addContainerGap(199, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(bprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(add)
                    .addComponent(bqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(total)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bpay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bbalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel2)
                    .addContainerGap(389, Short.MAX_VALUE)))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "PRICE", "QTY", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        int price = Integer.parseInt(bprice.getText());
        int qty = Integer.parseInt((String)bqty.getValue().toString());
        int total1=price*qty;
        
        df =(DefaultTableModel) table.getModel();
        df.addRow(new Object[]{
            bname.getText(),
            bqty.getValue().toString(),
            bprice.getText(),
            total1
            
        });
        bid.setText("");
        bname.setText("");
        bprice.setText("");
        bqty.setValue(0);
    }//GEN-LAST:event_addActionPerformed

    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidActionPerformed

    private void bnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnameActionPerformed

    private void bpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpayActionPerformed

    private void bidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bidKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            String id =bid.getText();
            try {
                pst=con.prepareStatement("select * from book where id =?");
                pst.setString(1, id);
                rs=pst.executeQuery();
                
                if (rs.next()==false)
                {
                     JOptionPane.showMessageDialog(this,"book can not be found");
                }
                else
                {
                    
                    String name =rs.getString("name");
                    bname.setText(name.trim());
                    
                    String price =rs.getString("price");
                    bprice.setText(price.trim());
                    
                    bqty.requestFocus();
                    
                }    
                   
                }catch (SQLException ex) {
                    Logger.getLogger(template.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_bidKeyPressed

    private void bpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpriceActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
        int sum=0;
        for(int i=0;i<table.getRowCount();i++)
        {
            sum=sum+ Integer.parseInt(table.getValueAt(i, 3).toString());
        }
        
        btotal.setText(String.valueOf(sum));
        bid.setText("");
        bname.setText("");
        bprice.setText("");
        bqty.setValue(0);
    }//GEN-LAST:event_totalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int total1= Integer.parseInt(btotal.getText());
        int payment =Integer.parseInt(bpay.getText());
        int bal1 = payment-total1;
        bbalance.setText(String.valueOf(bal1));
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
//    public void sale()
//    {
//        try {
//            String tot =btotal.getText();
//            String payy=bpay.getText();
//            String bbb =bbalance.getText();
//            String qty1 =bqty.getValue().toString();
//            
//            int lastid=0;
//            
//            String query = "insert into getin(subtotal,payment,balance) values (?,?,?)";
//            pst=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
//            pst.setString(1,tot);
//            pst.setString(2,payy);
//            pst.setString(3,bbb);
//            pst.executeUpdate();
//            rs=pst.getGeneratedKeys();
//            
//            if(rs.next())
//            {
//                lastid=rs.getInt(1);
//            }
//             
//            int rows =table.getRowCount();
//            
//            String query1 = "insert into sale(id,name,price,qty,total) values (?,?,?,?,?)";
//            pst1=con.prepareStatement(query1);
//            
//            String name=""; String price;String qty;int total;
//            
//            for(int i=0;i<table.getRowCount();i++)
//            {
//               name=(String) table.getValueAt(i, 0);
//               price=(String) table.getValueAt(i, 1);
//               qty=(String) table.getValueAt(i, 2);
//               total=(int) table.getValueAt(i, 3);
//               
//                pst1.setInt(1,lastid);
//                pst1.setString(2,name);
//                pst1.setString(3,price);
//                pst1.setString(3,qty);
//                pst1.setInt(3,total);
//                pst1.executeUpdate();
//
//            }
//            JOptionPane.showMessageDialog(this, "sales completed");
//           
//        } catch (SQLException ex) {
//            Logger.getLogger(template.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel bbalance;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField bpay;
    private javax.swing.JTextField bprice;
    private javax.swing.JSpinner bqty;
    private javax.swing.JLabel btotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JButton total;
    // End of variables declaration//GEN-END:variables


  
}
