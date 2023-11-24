/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
        
        

public class Aplikasi_Inventaris_Barang extends javax.swing.JFrame {
        int x=0;
    
    public Aplikasi_Inventaris_Barang() {
        initComponents();
         Dimension screenSize = 
         Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = this.getSize();
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            this.setLocation(
                    (screenSize.width - frameSize.width) / 2, 
                    (screenSize.height - frameSize.height) / 2); 
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_keterangan = new javax.swing.JTextArea();
        txt_kode = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_warna = new javax.swing.JTextField();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_lokasi = new javax.swing.JList<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cb_jenis = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbdata = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 255));
        jLabel1.setText("Kode Jam");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 255));
        jLabel2.setText("Nama Jam");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 255));
        jLabel3.setText("Warna");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 255));
        jLabel4.setText("Keterangan");

        txt_keterangan.setColumns(20);
        txt_keterangan.setRows(5);
        jScrollPane1.setViewportView(txt_keterangan);

        b5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b5.setText("Simpan ");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b4.setText("Clear");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b1.setText("Tambah Data");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b6.setText("X");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        list_lokasi.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Banjarmasin", "Banjarbaru", "Kota Baru", "Tanah Laut", "Amuntai", "Tabalong", "Sampit", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(list_lokasi);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 255));
        jLabel9.setText("Lokasi");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 255));
        jLabel10.setText("Jenis");

        cb_jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jam Rantai", "Jam Karet", "Jam Dinding", "Jam Digital", "Jam Analog", " " }));
        cb_jenis.setSelectedIndex(-1);

        tbdata.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE JAM", "NAMA JAM", "WARNA", "HARGA", "KETERANGAN", "LOKASI", "JENIS"
            }
        ));
        jScrollPane4.setViewportView(tbdata);

        b2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b2.setText("Ubah");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b3.setText("hapus");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 255));
        jLabel5.setText("Harga");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 255));
        jLabel6.setText("Selamat Datang Di Aplikasi Inventaris Barang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(b6)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(596, 596, 596)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_warna, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(b4))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                            .addComponent(b5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b6)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))))
                .addGap(6, 6, 6)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_warna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(12, 12, 12)
                        .addComponent(cb_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(b4))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b5)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        System.exit(0); // Menutup aplikasi dengan menghentikan proses JVM (Java Virtual Machine) dengan kode keluar 0
     
    }//GEN-LAST:event_b6ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
                  // Mengambil model dari tabel yang digunakan
                  DefaultTableModel model = (DefaultTableModel) tbdata.getModel(); 

                  // Mengambil nilai dari komponen-komponen input pada antarmuka pengguna
                  String kode = txt_kode.getText();
                  String nama = txt_nama.getText();
                  String warna = txt_warna.getText();
                  String harga = txt_harga.getText();
                  String keterangan = txt_keterangan.getText();
                  String lokasi = list_lokasi.getSelectedValue();
                  String jenis = cb_jenis.getSelectedItem().toString();
                

                // Melakukan validasi, jika ada kolom yang kosong, tampilkan pesan kesalahan
                if (kode.trim().isEmpty() || nama.isEmpty() || warna.isEmpty() || harga.isEmpty() || keterangan.isEmpty()
                        || lokasi.isEmpty() || jenis.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Semua kolom harus diisi sebelum menambah Data!");
                    return; // Keluar dari metode jika ada kolom yang kosong
                }

                // Menyiapkan data untuk ditambahkan ke dalam tabel
                Object[] rowData = {kode, nama, warna, harga, keterangan, lokasi, jenis};

                // Menambahkan data ke dalam tabel
                model.addRow(rowData);

    }//GEN-LAST:event_b1ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
                // Mengambil nilai dari komponen-komponen input pada antarmuka pengguna
                  String kode = txt_kode.getText();
                  String nama = txt_nama.getText();
                  String warna = txt_warna.getText();
                  String harga = txt_harga.getText();
                  String keterangan = txt_keterangan.getText();
                  String lokasi = list_lokasi.getSelectedValue();
                  String jenis = cb_jenis.getSelectedItem().toString();
          

           // Validasi untuk memastikan semua kolom telah diisi
          if (kode.trim().isEmpty() || nama.isEmpty() || warna.isEmpty() || harga.isEmpty() || keterangan.isEmpty()
                        || lokasi.isEmpty() || jenis.isEmpty()) {
               JOptionPane.showMessageDialog(rootPane, "Semua kolom harus diisi sebelum menyimpan!");
               return; // Keluar dari metode jika ada kolom yang kosong
           }

    try {
        // Membuka file "Simpan Data.txt" untuk ditambahi (append)
        FileWriter InventarisBarang = new FileWriter("Data Barang Inventaris.txt", true);

    // Menulis setiap informasi seseorang/pengguna ke file
     InventarisBarang.write("Kode : " + kode);  // Menulis ID ke file
            InventarisBarang.write(System.getProperty("line.separator"));
             InventarisBarang.write("nama : " + nama);  // Menulis ID ke file
            InventarisBarang.write(System.getProperty("line.separator"));
             InventarisBarang.write("Warna : " + warna);  // Menulis ID ke file
            InventarisBarang.write(System.getProperty("line.separator"));
             InventarisBarang.write("Harga : " + harga);  // Menulis ID ke file
            InventarisBarang.write(System.getProperty("line.separator"));
             InventarisBarang.write("Keterangan : " + keterangan);  // Menulis ID ke file
            InventarisBarang.write(System.getProperty("line.separator"));
             InventarisBarang.write("Lokasi: " + lokasi);  // Menulis ID ke file
            InventarisBarang.write(System.getProperty("line.separator"));
             InventarisBarang.write("Jenis: " + jenis);  // Menulis ID ke file
            InventarisBarang.write(System.getProperty("line.separator"));
            

        // Menutup file setelah selesai menulis
        InventarisBarang.close();

        // Menampilkan pesan sukses jika data berhasil disimpan
        JOptionPane.showMessageDialog(rootPane, "Data Anda Berhasil Disimpan Ke Format .Txt!");
    } catch (Exception e) {
        // Menampilkan pesan error jika terjadi kesalahan
        JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
    }

    }//GEN-LAST:event_b5ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // Mendapatkan indeks baris terpilih di tabel
        int selectedRow = tbdata.getSelectedRow();

        // Validasi apakah ada baris yang dipilih
        if (selectedRow == -1) {
            // Menampilkan pesan kesalahan jika tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(rootPane, "Pilih baris yang ingin diubah!");
            // Keluar dari metode jika tidak ada baris yang dipilih
            return;
       }

            // Mengambil nilai dari komponen-komponen input pada antarmuka pengguna
           String kode = txt_kode.getText();
                  String nama = txt_nama.getText();
                  String warna = txt_warna.getText();
                  String harga = txt_harga.getText();
                  String keterangan = txt_keterangan.getText();
                  String lokasi = list_lokasi.getSelectedValue();
                  String jenis = cb_jenis.getSelectedItem().toString();
          

            // Validasi apakah semua kolom telah diisi
            if (kode.trim().isEmpty() || nama.isEmpty() || warna.isEmpty() || harga.isEmpty() || keterangan.isEmpty()
                        || lokasi.isEmpty() || jenis.isEmpty()) {
                // Menampilkan pesan kesalahan jika ada kolom yang kosong
                JOptionPane.showMessageDialog(rootPane, "Semua kolom harus diisi sebelum menyimpan!");
                // Keluar dari metode jika ada kolom yang kosong
                return;
            }

                // Mengubah nilai pada tabel dengan nilai baru dari komponen input
                tbdata.setValueAt(kode, selectedRow, 0);
                tbdata.setValueAt(nama, selectedRow, 1);
                tbdata.setValueAt(warna, selectedRow, 2);
                tbdata.setValueAt(harga, selectedRow, 3);
                tbdata.setValueAt(keterangan, selectedRow, 4);
                tbdata.setValueAt(lokasi, selectedRow, 5);
                tbdata.setValueAt(jenis, selectedRow, 6);
               

            // Menampilkan pesan sukses setelah berhasil melakukan perubahan
            JOptionPane.showMessageDialog(rootPane, "Data berhasil diubah!");

    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

    // Mendapatkan indeks baris terpilih di tabel
    int selectedRow = tbdata.getSelectedRow();

    // Validasi apakah ada baris yang dipilih
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(rootPane, "Pilih baris yang ingin dihapus!");
        return; // Keluar dari metode jika tidak ada baris yang dipilih
    }

    // Konfirmasi pengguna sebelum menghapus baris
    int confirmDialogResult = JOptionPane.showConfirmDialog(rootPane, "Apakah Anda yakin ingin menghapus baris ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
    
    if (confirmDialogResult == JOptionPane.YES_OPTION) {
        // Hapus baris terpilih dari tabel
        DefaultTableModel model = (DefaultTableModel) tbdata.getModel();
        model.removeRow(selectedRow);

        // Menampilkan pesan sukses setelah berhasil menghapus
        JOptionPane.showMessageDialog(rootPane, "Data berhasil dihapus!");
    }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // Mengosongkan teks pada JTextField "txtid"
        txt_kode.setText("");
        // Mengosongkan teks pada JTextField "txtnm1"
        txt_nama.setText("");
        // Mengosongkan teks pada JTextField "txtnm2"
        txt_warna.setText("");
        // Menetapkan nilai null pada komponen JList "listJeniskelamin" dan menggunakan opsi "rootPaneCheckingEnabled"
        txt_kode.setText("");
        // Mengosongkan teks pada JTextField "txtnm1"
        list_lokasi.setSelectedValue(null, rootPaneCheckingEnabled);
        // Menetapkan nilai null pada komponen JComboBox "CoAgama"
        cb_jenis.setSelectedItem(null);
        // Mengosongkan teks pada JTextField "txtAlamat"
        txt_keterangan.setText("");
        // Mengosongkan teks pada JTextField "txt_keterangan"
        
    }//GEN-LAST:event_b4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   // Mengatur tampilan dan nuansa (Look and Feel) aplikasi menggunakan Nimbus
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            // Menetapkan tampilan dan nuansa Nimbus
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            // Keluar dari loop setelah menemukan Nimbus
                            break;
                        }
                    }
                    } catch (ClassNotFoundException ex) {
                    // Log jika kelas Nimbus tidak ditemukan
                    java.util.logging.Logger.getLogger(Aplikasi_Inventaris_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    // Log jika terjadi kesalahan instansiasi
                    java.util.logging.Logger.getLogger(Aplikasi_Inventaris_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    // Log jika terjadi kesalahan akses yang tidak sah
                    java.util.logging.Logger.getLogger(Aplikasi_Inventaris_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    // Log jika tampilan dan nuansa yang tidak didukung
                    java.util.logging.Logger.getLogger(Aplikasi_Inventaris_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>
                //</editor-fold>
                //</editor-fold>
                //</editor-fold>

                /* Membuat dan menampilkan formulir (frame) Aplikasi_Inventaris_Barang */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        // Membuat instance dari kelas BukuAlamat dan menampilkannya
                        new Aplikasi_Inventaris_Barang().setVisible(true);
                    }
                });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JComboBox<String> cb_jenis;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.List list1;
    private javax.swing.JList<String> list_lokasi;
    private javax.swing.JTable tbdata;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextArea txt_keterangan;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_warna;
    // End of variables declaration//GEN-END:variables

    void show(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
