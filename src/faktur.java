import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class faktur extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    private void update(){
        String sql = "select no_faktur,tgl_faktur from faktur ";
         try{
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        tabel_faktur.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
    public faktur() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        faktur = new javax.swing.JTextField();
        tgl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        save_faktur = new javax.swing.JButton();
        update_faktur = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        delete_faktur = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        new_faktur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_faktur = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false; //Disallow the editing of any cell
            }
        };
        barang = new javax.swing.JButton();
        satuan = new javax.swing.JButton();
        detail_faktur = new javax.swing.JButton();
        Faktur = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("No faktur");

        jLabel3.setText("Tgl Faktur");

        save_faktur.setText("Save");
        save_faktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_fakturMouseClicked(evt);
            }
        });

        update_faktur.setText("Update");
        update_faktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_fakturMouseClicked(evt);
            }
        });

        jLabel1.setText("TABEL FAKTUR");

        delete_faktur.setText("Delete");
        delete_faktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_fakturMouseClicked(evt);
            }
        });

        jLabel4.setText("contoh : 2012-10-02");

        new_faktur.setText("New");
        new_faktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_fakturMouseClicked(evt);
            }
        });

        tabel_faktur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No faktur", "Tgl Faktur"
            }
        ));
        tabel_faktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_fakturMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_faktur);

        barang.setText("Barang");
        barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barangMouseClicked(evt);
            }
        });

        satuan.setText("Satuan");
        satuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                satuanMouseClicked(evt);
            }
        });

        detail_faktur.setText("Detail Faktur");
        detail_faktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detail_fakturMouseClicked(evt);
            }
        });

        Faktur.setText("Faktur");

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tgl)
                            .addComponent(faktur, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(new_faktur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save_faktur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_faktur)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete_faktur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(satuan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detail_faktur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Faktur))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(jButton2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jButton2))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(faktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(new_faktur)
                            .addComponent(save_faktur)
                            .addComponent(update_faktur)
                            .addComponent(delete_faktur))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barang)
                    .addComponent(satuan)
                    .addComponent(detail_faktur)
                    .addComponent(Faktur))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_fakturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_fakturMouseClicked
        // TODO add your handling code here:
        String sql = "insert into faktur (no_faktur, tgl_faktur) values (?,?)";

        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, faktur.getText());
            pst.setString(2, tgl.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "save");
            update();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_save_fakturMouseClicked

    private void update_fakturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_fakturMouseClicked
        // TODO add your handling code here:
        String sql = "update faktur set tgl_faktur = ? where no_faktur = ? ";
        try{
            pst= conn.prepareStatement(sql);
            pst.setString(1, faktur.getText());
            pst.setString(2, tgl.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"berhasil di update");
            update();

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_update_fakturMouseClicked

    private void delete_fakturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_fakturMouseClicked
        // TODO add your handling code here:
        String sql = "delete from faktur where no_faktur = ?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,faktur.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data terhapus");
            update();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_delete_fakturMouseClicked

    private void new_fakturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_fakturMouseClicked
        // TODO add your handling code here:
        faktur.setText("");
        tgl.setText("");

        //meletakkan cursor aktif pada textfield txtNT
        faktur.requestFocus();
}//GEN-LAST:event_new_fakturMouseClicked

    private void tabel_fakturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_fakturMouseClicked
        // TODO add your handling code here:
        int row = tabel_faktur.getSelectedRow();
        faktur.setText(tabel_faktur.getModel().getValueAt(row, 0).toString());
        tgl.setText(tabel_faktur.getModel().getValueAt(row, 1).toString());
    }//GEN-LAST:event_tabel_fakturMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         conn = koneksi.koneksi_DB();
         update();
           Faktur.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barangMouseClicked
        // TODO add your handling code here:
          barang s = new barang();
        s.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_barangMouseClicked

    private void satuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_satuanMouseClicked
        // TODO add your handling code here:
          satuan s = new satuan();
        s.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_satuanMouseClicked

    private void detail_fakturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detail_fakturMouseClicked
        // TODO add your handling code here:
          detail_faktur s = new detail_faktur();
        s.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_detail_fakturMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth())/2;
        int y = (posisi.height -this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new faktur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Faktur;
    private javax.swing.JButton barang;
    private javax.swing.JButton delete_faktur;
    private javax.swing.JButton detail_faktur;
    private javax.swing.JTextField faktur;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton new_faktur;
    private javax.swing.JButton satuan;
    private javax.swing.JButton save_faktur;
    private javax.swing.JTable tabel_faktur;
    private javax.swing.JTextField tgl;
    private javax.swing.JButton update_faktur;
    // End of variables declaration//GEN-END:variables

}
