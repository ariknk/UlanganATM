
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER E5-471
 */
public class JFtransfer extends javax.swing.JFrame {

    /**
     * Creates new form transfer
     */
    public JFtransfer() {
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

        jLabel3 = new javax.swing.JLabel();
        nominal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel3.setText("Masukkan Nominal");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 193, 33);
        getContentPane().add(nominal);
        nominal.setBounds(80, 120, 160, 40);

        jButton1.setText("TRANSFER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 180, 100, 30);

        jButton2.setText("KELUAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 180, 90, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel1.setText("PENYETORAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 20, 150, 32);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String tf = nominal.getText();
        int saldo = 100000000;
        int jmltf = Integer.parseInt(tf);
        int total = saldo-jmltf;
       if(jmltf%100!=0)
           JOptionPane.showMessageDialog(null, "Mesin ATM BCA Tidak Bisa mengirim uang koin\nSilahkan Ulangi lagi","Transaksi Gagal",0);
       else{
           if (jmltf>saldo)
               JOptionPane.showMessageDialog(null,"Saldo Anda Tidak Mencukupi \nSilahkan Lakukan Pengisian Ulang","Transaksi Gagal",0);
           else if(jmltf<50000)
               JOptionPane.showMessageDialog(null,"Besaran MInimum Pengiriman adalah Rp 50000","Transaksi Gagal",0);
           else{
               saldo = saldo-jmltf;
               JOptionPane.showMessageDialog(null,"Saldo Anda Saat Ini Sebesar : "+saldo);
               if(saldo<=50000)
               JOptionPane.showMessageDialog(null, "Saldo minimal harus Rp 50000,segera lakukan penyetoran untuk menghindari penutupan akun","CAUTION",2);
               
           }
       }        // TODO add your handling code here:
         
             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "Terimakasih telah melakukan transaksi di ATM ");
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFtransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFtransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFtransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFtransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFtransfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nominal;
    // End of variables declaration//GEN-END:variables
}
