import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
public class satuan extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
     private void update(){
        String sql = "select id_satuan, jenis_satuan from satuan ";
         try{
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        tabel_satuan.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }

    /** Creates new form satuan */
    public satuan() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_satuan = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false; //Disallow the editing of any cell
            }
        };
        delete_satuan = new javax.swing.JButton();
        update_satuan = new javax.swing.JButton();
        save_satuan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jenis = new javax.swing.JTextField();
        new_satuan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tbl_detail_faktur1 = new javax.swing.JButton();
        tbl_barang = new javax.swing.JButton();
        satuan = new javax.swing.JButton();
        faktur = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("TABEL SATUAN");

        tabel_satuan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Satuan", "Jenis Satuan"
            }
        ));
        tabel_satuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_satuanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_satuan);

        delete_satuan.setText("Delete");
        delete_satuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_satuanMouseClicked(evt);
            }
        });

        update_satuan.setText("Update");
        update_satuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_satuanMouseClicked(evt);
            }
        });

        save_satuan.setText("Save");
        save_satuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_satuanMouseClicked(evt);
            }
        });

        jLabel3.setText("Jenis Satuan");

        new_satuan.setText("New");
        new_satuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_satuanMouseClicked(evt);
            }
        });

        jLabel2.setText("ID Satuan");

        tbl_detail_faktur1.setText("Detail Faktur");
        tbl_detail_faktur1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_detail_faktur1MouseClicked(evt);
            }
        });

        tbl_barang.setText("Barang");
        tbl_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangMouseClicked(evt);
            }
        });

        satuan.setText("Satuan");

        faktur.setText("faktur");
        faktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fakturMouseClicked(evt);
            }
        });

        back.setBackground(new java.awt.Color(102, 255, 204));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(297, Short.MAX_VALUE)
                        .addComponent(tbl_barang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(satuan)
                        .addGap(14, 14, 14)
                        .addComponent(tbl_detail_faktur1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(faktur))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(back)
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jenis)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(new_satuan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(save_satuan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(update_satuan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(delete_satuan)))
                    .addContainerGap(353, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbl_barang)
                    .addComponent(satuan)
                    .addComponent(tbl_detail_faktur1)
                    .addComponent(faktur))
                .addGap(31, 31, 31))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(new_satuan)
                        .addComponent(save_satuan)
                        .addComponent(update_satuan)
                        .addComponent(delete_satuan))
                    .addContainerGap(171, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabel_satuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_satuanMouseClicked
        // TODO add your handling code here:
        int row = tabel_satuan.getSelectedRow();
        id.setText(tabel_satuan.getModel().getValueAt(row, 0).toString());
        jenis.setText(tabel_satuan.getModel().getValueAt(row, 1).toString());
    }//GEN-LAST:event_tabel_satuanMouseClicked

    private void delete_satuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_satuanMouseClicked
        // TODO add your handling code here:
        String sql = "delete from satuan where id_satuan = ?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,id.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data terhapus");
            update();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_delete_satuanMouseClicked

    private void update_satuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_satuanMouseClicked
        // TODO add your handling code here:
        String sql = "update satuan set jenis_satuan = ? where id_satuan = ? ";
        try{
            pst= conn.prepareStatement(sql);
            pst.setString(1, id.getText());
            pst.setString(2, jenis.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"berhasil di update");
            update();

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_update_satuanMouseClicked

    private void save_satuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_satuanMouseClicked
        // TODO add your handling code here:
        String sql = "insert into satuan (id_satuan, jenis_satuan) values (?,?)";

        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, id.getText());
            pst.setString(2, jenis.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "save");
            update();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_save_satuanMouseClicked

    private void new_satuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_satuanMouseClicked
        // TODO add your handling code here:
        id.setText("");
        jenis.setText("");

        //meletakkan cursor aktif pada textfield txtNT
        id.requestFocus();
    }//GEN-LAST:event_new_satuanMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conn = koneksi.koneksi_DB();
        update();
             satuan.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void tbl_detail_faktur1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_detail_faktur1MouseClicked
        // TODO add your handling code here:
        detail_faktur s = new detail_faktur();
        s.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_tbl_detail_faktur1MouseClicked

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        // TODO add your handling code here:
        barang s = new barang();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tbl_barangMouseClicked

    private void fakturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fakturMouseClicked
        // TODO add your handling code here:
         faktur s = new faktur();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fakturMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
         Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth())/2;
        int y = (posisi.height -this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new barang().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new satuan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton delete_satuan;
    private javax.swing.JButton faktur;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jenis;
    private javax.swing.JButton new_satuan;
    private javax.swing.JButton satuan;
    private javax.swing.JButton save_satuan;
    private javax.swing.JTable tabel_satuan;
    private javax.swing.JButton tbl_barang;
    private javax.swing.JButton tbl_detail_faktur1;
    private javax.swing.JButton update_satuan;
    // End of variables declaration//GEN-END:variables

}
