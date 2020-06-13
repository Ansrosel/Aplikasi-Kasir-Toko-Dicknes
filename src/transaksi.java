import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class transaksi extends javax.swing.JFrame {

   Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    private void update(){
        String sql = "SELECT no_item as No ,detail_faktur.id_barang,nama_barang,harga,kuantitas as Qty,ROUND((kuantitas*harga)-((kuantitas*harga*diskon)/100)) AS total FROM detail_faktur,barang WHERE detail_faktur.id_barang=barang.id_barang AND no_faktur='"+faktur.getText()+"';";
        String sql2="SELECT SUM(ROUND((kuantitas*harga)-((kuantitas*harga*diskon)/100))) AS total FROM detail_faktur,barang WHERE detail_faktur.id_barang=barang.id_barang AND no_faktur='"+faktur.getText()+"';";
        try{
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        tabel_transaksi.setModel(DbUtils.resultSetToTableModel(rs));
        pst = conn.prepareStatement(sql2);
        rs = pst.executeQuery();
        if (rs.next()){
              String total = rs.getString("total");
              jumlah.setVisible(true);
              nama_total.setVisible(true);
              jumlah.setText(total);

            }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
    public transaksi() {
        initComponents();
    }
    private void combobox(){
      String sql = "SELECT nama_barang FROM barang;";
      try{
          pst = conn.prepareStatement(sql);
          rs = pst.executeQuery();
          while (rs.next()){
              String name = rs.getString("nama_barang");
              combo_barang.addItem(name);
          }
      }
       catch(Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Kualitas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        faktur = new javax.swing.JTextField();
        combo_barang = new javax.swing.JComboBox();
        kuantitas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_transaksi = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false; //Disallow the editing of any cell
            }
        };
        save = new javax.swing.JButton();
        baru = new javax.swing.JButton();
        barang = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        finish = new javax.swing.JButton();
        nama_total = new javax.swing.JLabel();
        jumlah = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("No Faktur");

        jLabel3.setText("Barang");

        Kualitas.setText("kuantitas");

        jLabel4.setText("TRANSAKSI");

        tabel_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "null", "null", "null", "null"
            }
        ));
        tabel_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_transaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_transaksi);

        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        baru.setText("new");
        baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baruMouseClicked(evt);
            }
        });

        barang.setText("Barang");
        barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barangMouseClicked(evt);
            }
        });

        transaksi.setText("Transaksi");

        finish.setText("Finish");
        finish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finishMouseClicked(evt);
            }
        });

        nama_total.setText("Total");

        jumlah.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(Kualitas))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kuantitas)
                            .addComponent(combo_barang, 0, 126, Short.MAX_VALUE)
                            .addComponent(faktur))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(save)
                            .addComponent(baru)
                            .addComponent(finish)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel4)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addComponent(nama_total)
                        .addGap(18, 18, 18)
                        .addComponent(jumlah))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(faktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baru))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(save))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kuantitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kualitas)
                    .addComponent(finish))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nama_total)
                        .addComponent(jumlah))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(barang)
                        .addComponent(transaksi)))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conn = koneksi.koneksi_DB();
       
        combobox();
        transaksi.setEnabled(false);
        save.setEnabled(false);
        finish.setEnabled(false);
        combo_barang.setEnabled(false);
        kuantitas.setEnabled(false);
        jumlah.setVisible(false);
        nama_total.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
         String id_barang="";
         no_item = no_item+1;

       String sql = "select id_barang from barang where nama_barang='"+combo_barang.getItemAt(combo_barang.getSelectedIndex())+"'";

        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()){
                id_barang=rs.getString("id_barang");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      sql="insert into faktur values('"+faktur.getText()+"',NOW())";
      String sql2="insert into detail_faktur values('"+faktur.getText()+"','"+no_item+"','"+id_barang+"','"+kuantitas.getText()+"','0')";
        try{
            pst = conn.prepareStatement(sql);
            pst.execute();
            pst = conn.prepareStatement(sql2);
            pst.execute();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      kuantitas.setText(null);
      update();
        // TODO add your handling code here:
    /*   String id_barang="";
       String sql = "select id_barang from barang where nama_barang='"+combo_barang.getItemAt(combo_barang.getSelectedIndex())+"'";

        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()){
                id_barang=rs.getString("id_barang");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      sql="insert into faktur values('"+faktur.getText()+"',NOW())";
      String sql2="insert into detail_faktur values('"+faktur.getText()+"','1','"+id_barang+"','"+kuantitas.getText()+"','0')";
        try{
            pst = conn.prepareStatement(sql);
            pst.execute();
            pst = conn.prepareStatement(sql2);
            pst.execute();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      update();
*/
    }//GEN-LAST:event_saveMouseClicked

    private void tabel_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_transaksiMouseClicked
        // TODO add your handling code here:
         int row = tabel_transaksi.getSelectedRow();
         faktur.setText(tabel_transaksi.getModel().getValueAt(row, 0).toString());
         combo_barang.setSelectedItem(tabel_transaksi.getModel().getValueAt(row, 2).toString());
         kuantitas.setText(tabel_transaksi.getModel().getValueAt(row, 4).toString());
    }//GEN-LAST:event_tabel_transaksiMouseClicked

    private void baruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baruMouseClicked
        // TODO add your handling code here:
        baru.setEnabled(false);
        faktur.setEnabled(false);
        save.setEnabled(true);
        finish.setEnabled(true);
        combo_barang.setEnabled(true);
        kuantitas.setEnabled(true);
       String sql="insert into faktur values('"+faktur.getText()+"',NOW())";
        try{
            pst = conn.prepareStatement(sql);
            pst.execute();
             }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_baruMouseClicked

    private void barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barangMouseClicked
        // TODO add your handling code here:
         barang s = new barang();
         s.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_barangMouseClicked

    private void finishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishMouseClicked
        // TODO add your handling code here:
        no_item=0;
        faktur.setText(null);
        kuantitas.setText(null);
        faktur.setEnabled(true);
        kuantitas.setEnabled(false);
         baru.setEnabled(true);
        save.setEnabled(false);
        finish.setEnabled(false);
        combo_barang.setEnabled(false);
        jumlah.setVisible(false);
        nama_total.setVisible(false);
        tabel_transaksi.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
    },
    new String [] {
        "null", "null", "null", "null"
    }
));
    }//GEN-LAST:event_finishMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kualitas;
    private javax.swing.JButton barang;
    private javax.swing.JButton baru;
    private javax.swing.JComboBox combo_barang;
    private javax.swing.JTextField faktur;
    private javax.swing.JButton finish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jumlah;
    private javax.swing.JTextField kuantitas;
    private javax.swing.JLabel nama_total;
    private javax.swing.JButton save;
    private javax.swing.JTable tabel_transaksi;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
    int no_item = 0;
}
