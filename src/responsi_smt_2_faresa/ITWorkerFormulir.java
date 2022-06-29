/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package responsi_smt_2_faresa;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ITWorkerFormulir extends javax.swing.JFrame {

   private Connection db;
    
    // TODO: ADD variabel default tabel model
    private DefaultTableModel model;
    public ITWorkerFormulir() {
        initComponents();
        initNewComponent();
        optionComponent();
    }
    
   private void optionComponent(){
       cmbPosition.addItemListener((ItemEvent e) -> {
            switch (e.getItem().toString()) {
                case "Senior Programmer" -> txtSalary.setText("Rp. 15.000.000,00");
                case "Business Analyst" -> txtSalary.setText("Rp. 21.000.000,00");
                case "Data Center Officer" -> txtSalary.setText("Rp. 18.000.000,00");
                default -> txtSalary.setText("Rp. 8.000.000,00");
            }
        });
        switch (cmbPosition.getSelectedItem().toString()) {
            case "Senior Programmer" -> txtSalary.setText("Rp. 15.000.000,00");
            case "Business Analyst" -> txtSalary.setText("Rp. 21.000.000,00");
            case "Data Center Officer" -> txtSalary.setText("Rp. 18.000.000,00");
            default -> txtSalary.setText("Rp. 8.000.000,00");
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        exitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNoPegawai = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        cmbPosition = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setText("IT Worker Form");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama");

        jLabel3.setText("No. Pegawai");

        jLabel4.setText("Posisi");

        jLabel5.setText("Gaji (IDR)");

        txtSalary.setActionCommand("<Not Set>");

        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senior Programmer", "Business Analyst", "Data Center Officer", "Junior Progammer" }));

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(500, 400));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama", "No Pegawai", "Posisi", "Gaji", "ID"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        jLabel6.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNoPegawai)
                            .addComponent(txtName)
                            .addComponent(cmbPosition, 0, 319, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInsert)
                                .addGap(31, 31, 31)
                                .addComponent(btnUpdate))
                            .addComponent(txtSalary))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(exitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNoPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cmbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        try {
            this.insertAll();
            db = KoneksiDB.getKoneksi();

            String sql = "INSERT INTO data_pgw "
            + "(no_pegawai, nama_pegawai, posisi_pegawai, gaji_pegawai) "
            + "VALUES (?,?,?,?)";
            try (PreparedStatement ps = db.prepareStatement(sql)) {
                ps.setString(1, txtNoPegawai.getText());
                ps.setString(2, txtName.getText());
                ps.setString(3, cmbPosition.getSelectedItem().toString());
                ps.setString(4, txtSalary.getText());
                
                int rowInsert = ps.executeUpdate();
                if (rowInsert > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Succes", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

       
        catch (SQLException e){
            System.err.println("Insert data eror: " + e.getMessage());
        } catch (IdTidakBolehKosong ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }catch (NoPegawaiHarus10Digit ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        catch (WarningMessage ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            this.loadDataToTabel();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            db = KoneksiDB.getKoneksi();

            String sql = "DELETE FROM data_pgw "
            + "WHERE id=?;";
            try (PreparedStatement ps = db.prepareStatement(sql)) {
                ps.setString(1, txtID.getText());
                
                int rowInsert = ps.executeUpdate();
                if (rowInsert > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Succes", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch (SQLException e){
            System.err.println("Delete data eror: " + e.getMessage());
        }
        finally {
            this.loadDataToTabel();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            this.insertAll();
            db = KoneksiDB.getKoneksi();

            String sql = "UPDATE data_pgw "
            + "SET nama_pegawai=?, no_pegawai=?, posisi_pegawai=?, gaji_pegawai=? "
            + "WHERE id=?";
            
           
            try (PreparedStatement ps = db.prepareStatement(sql)) {
                 ps.setString(1, txtName.getText());
                 ps.setString(2, txtNoPegawai.getText());
                 ps.setString(3, cmbPosition.getSelectedItem().toString());
                 ps.setString(4, txtSalary.getText());
                 ps.setString(5, txtID.getText());
               
                
                int rowInsert = ps.executeUpdate();
                if (rowInsert > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Succes", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

       
        catch (SQLException e){
            System.err.println("Update data eror: " + e.getMessage());
        } catch (IdTidakBolehKosong ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }catch (NoPegawaiHarus10Digit ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        catch (WarningMessage ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            this.loadDataToTabel();
        }
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        
        int rowIdx = tblData.getSelectedRow();

        String noPegawai = tblData.getValueAt(rowIdx, 1).toString();
        txtNoPegawai.setText(noPegawai);

        String id = tblData.getValueAt(rowIdx, 4).toString();
        txtID.setText(id);
    

        String nama = tblData.getValueAt(rowIdx, 0).toString();
        txtName.setText(nama);
       
        int index = cmbPosition.getSelectedIndex();
        String posisi = tblData.getValueAt(rowIdx, 3    ).toString();
        cmbPosition.setSelectedIndex(index);
        switch (posisi) {
            case "Senior Progammer" -> {
                cmbPosition.setSelectedIndex(0);
                txtSalary.setText("Rp. 15.000.000,00");
           }
            case "Business Analyst" -> {
                cmbPosition.setSelectedIndex(1);
                txtSalary.setText("Rp. 21.000.000,00");
           }
            case "Data Center Officer" -> {
                cmbPosition.setSelectedIndex(2);
                txtSalary.setText("Rp. 18.000.000,00");
           }
            default -> {
                cmbPosition.setSelectedIndex(3);
                txtSalary.setText("Rp. 8.000.000,00");
           }
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void initNewComponent() {
        model = (DefaultTableModel) tblData.getModel();
        
        this.loadDataToTabel();
        jLabel6.setVisible(false);
        txtID.setVisible(false);
        txtSalary.setEditable(true);
        

        // Sembunyikan kolom ID Pegawai
        tblData.getColumnModel().getColumn(4).setMinWidth(0);
        tblData.getColumnModel().getColumn(4).setMaxWidth(0); 
    }

    private void loadDataToTabel() {
        model.setRowCount(0);
        
        try {
            db = KoneksiDB.getKoneksi();
            Statement st = db.createStatement();
            
            String sql = "SELECT * FROM data_pgw";
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()) {
                Object[] data = new Object[5];
                data[0] = rs.getString("nama_pegawai");
                data[1] = rs.getString("no_pegawai");
                data[2] = rs.getString("posisi_pegawai");
                data[3] = rs.getString("gaji_pegawai");
                data[4] = rs.getInt("id");
                
                model.addRow(data);
            }
            rs.close();
            st.close();
        } 
        catch (SQLException e){
            System.err.println("Load data error : " + e.getMessage());
        } 
    }
    
    public void insertAll() throws NoPegawaiHarus10Digit,IdTidakBolehKosong, WarningMessage{
        long no_pgw;
        String text = txtNoPegawai.getText();
       
        try {
            no_pgw = Long.parseLong(txtNoPegawai.getText());
        }
        catch (NumberFormatException e) {
            throw new IdTidakBolehKosong();
        }
        if(Long.toString(no_pgw).length() < 1) {
            throw new IdTidakBolehKosong();
        }
         if (Long.toString(no_pgw).length() != 10) {
            throw new NoPegawaiHarus10Digit();
        }
       
        if (txtName.getText().isBlank() && (text.trim().length() < 1)) {
                throw new WarningMessage();
        }
    }

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
            java.util.logging.Logger.getLogger(ITWorkerFormulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ITWorkerFormulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ITWorkerFormulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ITWorkerFormulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ITWorkerFormulir().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNoPegawai;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}

