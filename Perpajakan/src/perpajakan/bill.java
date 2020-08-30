/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpajakan;
import perpajakan.Gpajak.*;
import java.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import static perpajakan.Gpajak.*;
import javax.swing.JOptionPane;
/**
 *
 * @author A S U S
 */
public class bill extends javax.swing.JFrame {

    /**
     * Creates new form bill
     */
    
    public String pn1,np1, a1, mk1, mb1, tp1, is1, nr1, nm1, w1, bk, jn, b; 
    public bill(String val1, String val2,String val3,String val4,String val5,String val6,String val7,String val8,String val9,String val10,String val11,String val12,String val13,String val14, String val15,String val16) {
        initComponents();
        this.pn1= val1;
        this.np1= val2;
        this.a1= val3;
        this.mk1= val4;
        
        this.mb1= val6;
        this.tp1= val7;
        this.is1= val8;
        this.nr1= val9;
        this.nm1= val10;
        this.w1= val11;
        this.bk= val14;
        this.jn= val15;
        this.b= val16;
        
        isipn();
        isinp();
        isia();
        isimk1();
        isijn();
        isitp1();
        isiis1();
        isinr1();
        isinm1();
        isiw1();
        isibk();
        byr();
    }

    
    void isipn() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("PLAT NOMOR");
        v.add(pn1);
        dt.addRow(v);
    }
    void isinp() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("NAMA PEMILIK");
        v.add(np1);
        dt.addRow(v);
    }
    void isia() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("ALAMAT");
        v.add(a1);
        dt.addRow(v);
    }
    void isimk1() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("MERK KENDARAAN");
        v.add(mk1);
        dt.addRow(v);
    }
     void isijn() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("JENIS KENDARAAN");
        v.add(jn);
        dt.addRow(v);
    }
    void isitp1() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("TAHUN PEMBUATAN");
        v.add(tp1);
        dt.addRow(v);
    }
    void isiis1() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("ISI SILINDER");
        v.add(is1+" CC");
        dt.addRow(v);
    } 
    void isinr1() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("NOMOR RANGKA");
        v.add(nr1);
        dt.addRow(v);
    }
    void isinm1() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("NOMOR MESIN");
        v.add(nm1);
        dt.addRow(v);
    }
    void isiw1() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("WARNA");
        v.add(w1);
        dt.addRow(v);
    }
    void isibk() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("BAHAN BAKAR");
        v.add(bk);
        dt.addRow(v);
    }
     void byr() {
        DefaultTableModel dt = (DefaultTableModel) tharga.getModel();
        Vector v = new Vector();
        v.add("PEMBAYARAN ");
        v.add(b+" /Tahun");
        dt.addRow(v);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tharga = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        asa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("KETERANGAN PERPAJAKAN");

        tharga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane1.setViewportView(tharga);

        jButton1.setText("BAYAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("BAYAR :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Rp");

        asa.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        asa.setText("0");
        asa.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                asaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("/Tahun");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(asa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(asa)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void asaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_asaAncestorAdded
        // TODO add your handling code here:
        asa.setText(b);
    }//GEN-LAST:event_asaAncestorAdded

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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tharga;
    // End of variables declaration//GEN-END:variables
}
