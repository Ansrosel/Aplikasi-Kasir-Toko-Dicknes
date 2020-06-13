
import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class detail_faktur extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    private void update() {
        String sql = "select no_faktur,no_item, id_barang, kuantitas, diskon from detail_faktur ";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tabel_datail_faktur.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public detail_faktur() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        delete_detail = new javax.swing.JButton();
        barang = new javax.swing.JTextField();
        kuantitas = new javax.swing.JTextField();
        faktur = new javax.swing.JTextField();
        item = new javax.swing.JTextField();
        new_detail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        save_detail = new javax.swing.JButton();
        diskon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        update_detail = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_datail_faktur = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel3 = new javax.swing.JLabel();
        tbl_barang = new javax.swing.JButton();
        tbl_satuan = new javax.swing.JButton();
        tbl_faktur = new javax.swing.JButton();
        detail_faktur = new javax.swing.JButton();
        back = new javax.swing.JButton();
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

        jLabel6.setText("Diskon");

        jLabel5.setText("Kuantitas");

        jLabel4.setText("ID Barang");

        delete_detail.setText("Delete");
        delete_detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_detailMouseClicked(evt);
            }
        });

        new_detail.setText("new");
        new_detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_detailMouseClicked(evt);
            }
        });

        jLabel1.setText("DETAIL FAKTUR");

        save_detail.setText("Save");
        save_detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_detailMouseClicked(evt);
            }
        });

        jLabel2.setText("No Faktur");

        update_detail.setText("Update");
        update_detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_detailMouseClicked(evt);
            }
        });

        tabel_datail_faktur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No Faktur", "No Item", "ID Barang", "Kuantitas", "Diskon"
            }
        ));
        tabel_datail_faktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_datail_fakturMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_datail_faktur);

        jLabel3.setText("No Item");

        tbl_barang.setText("Barang");
        tbl_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangMouseClicked(evt);
            }
        });

        tbl_satuan.setText("Satuan");
        tbl_satuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_satuanMouseClicked(evt);
            }
        });

        tbl_faktur.setText("Faktur");
        tbl_faktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_fakturMouseClicked(evt);
            }
        });

        detail_faktur.setText("Detail Faktur");

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(new_detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save_detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_detail))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(item)
                            .addComponent(barang)
                            .addComponent(kuantitas)
                            .addComponent(diskon)
                            .addComponent(faktur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbl_barang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbl_satuan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detail_faktur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbl_faktur))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(back)
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(back)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(faktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(kuantitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(new_detail)
                            .addComponent(save_detail)
                            .addComponent(update_detail)
                            .addComponent(delete_detail)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbl_barang)
                    .addComponent(tbl_satuan)
                    .addComponent(tbl_faktur)
                    .addComponent(detail_faktur))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delete_detailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_detailMouseClicked
        // TODO add your handling code here:
        String sql = "delete from detail_faktur where no_faktur = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, faktur.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data terhapus");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_delete_detailMouseClicked

    private void new_detailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_detailMouseClicked
        faktur.setText("");
        item.setText("");
        barang.setText("");
        kuantitas.setText("");
        diskon.setText("");

        //meletakkan cursor aktif pada textfield txtNT
        faktur.requestFocus();
}//GEN-LAST:event_new_detailMouseClicked

    private void save_detailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_detailMouseClicked
        String sql = "insert into detail_faktur (no_faktur, no_item, id_barang, kuantitas) values (?,?,?,?)";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, faktur.getText());
            pst.setString(2, item.getText());
            pst.setString(3, barang.getText());
            pst.setString(4, kuantitas.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "save");
            update();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_save_detailMouseClicked

    private void update_detailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_detailMouseClicked
        // TODO add your handling code here:
        String sql = "update detail_faktur set no_item = ? , id_barang = ?, kuantitas = ?, diskon = ? where no_faktur = ? ";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, faktur.getText());
            pst.setString(2, item.getText());
            pst.setString(3, barang.getText());
            pst.setString(4, kuantitas.getText());
            pst.setString(5, diskon.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil di update");
            update();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_update_detailMouseClicked

    private void tabel_datail_fakturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_datail_fakturMouseClicked
        // TODO add your handling code here:
        int row = tabel_datail_faktur.getSelectedRow();
        faktur.setText(tabel_datail_faktur.getModel().getValueAt(row, 0).toString());
        item.setText(tabel_datail_faktur.getModel().getValueAt(row, 1).toString());
        barang.setText(tabel_datail_faktur.getModel().getValueAt(row, 2).toString());
        kuantitas.setText(tabel_datail_faktur.getModel().getValueAt(row, 3).toString());
        diskon.setText(tabel_datail_faktur.getModel().getValueAt(row, 4).toString());
    }//GEN-LAST:event_tabel_datail_fakturMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conn = koneksi.koneksi_DB();
        update();
        detail_faktur.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        // TODO add your handling code here:
        barang s = new barang();
        s.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_tbl_barangMouseClicked

    private void tbl_satuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_satuanMouseClicked
        // TODO add your handling code here:
        satuan s = new satuan();
        s.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_tbl_satuanMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth()) / 2;
        int y = (posisi.height - this.getHeight()) / 2;
        this.setLocation(x, y);
    }//GEN-LAST:event_formWindowActivated

    private void tbl_fakturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_fakturMouseClicked
        // TODO add your handling code here:
        faktur s = new faktur();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tbl_fakturMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new satuan().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detail_faktur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField barang;
    private javax.swing.JButton delete_detail;
    private javax.swing.JButton detail_faktur;
    private javax.swing.JTextField diskon;
    private javax.swing.JTextField faktur;
    private javax.swing.JTextField item;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kuantitas;
    private javax.swing.JButton new_detail;
    private javax.swing.JButton save_detail;
    private javax.swing.JTable tabel_datail_faktur;
    private javax.swing.JButton tbl_barang;
    private javax.swing.JButton tbl_faktur;
    private javax.swing.JButton tbl_satuan;
    private javax.swing.JButton update_detail;
    // End of variables declaration//GEN-END:variables

}