### Laporan Praktikum
### Pemprograman Berorientasi Objek
### Program Sederhana Pengelola Data Nasabah Bank
#
##### Oleh: 
##### Ayu Cahyarani (2209116008)

##### Sistem Informasi A 22
#
#
#### Deskripsi Program

Program ini adalah sebuah aplikasi sederhana yang khusus dan hanya bisa digunakan oleh admin bank untuk mengelola data nasabah bank. Aplikasi ini memiliki fitur untuk menambah, mengedit, menghapus, dan menampilkan data nasabah.
 
#### Struktur Program

Program ini terdiri dari dua package, yaitu com.mycompany.bank dan com.mycompany.bank.newpackage. Package com.mycompany.bank berisi kode untuk menu utama dan fungsi-fungsi untuk mengelola data nasabah. Package com.mycompany.bank.newpackage berisi kode untuk kelas Nasabah yang mewakili data nasabah. Berikut adalah penjelasan dari kode program yang digunakan:

File Bank.java
- main(): Fungsi utama yang menjalankan program
- tambahNasabah(): Fungsi untuk menambah nasabah
- editNasabah(): Fungsi untuk mengedit nasabah
- hapusNasabah(): Fungsi untuk menghapus nasabah
- tampilkanNasabah(): Fungsi untuk menampilkan data nasabah

File Nasabah.java
- Nasabah(): Konstruktor untuk membuat objek Nasabah
- getNama(): Mengembalikan nama nasabah
- setNama(): Mengatur nama nasabah
- getNomorRekening(): Mengembalikan nomor rekening nasabah
- setNomorRekening(): Mengatur nomor rekening nasabah
- getSaldo(): Mengembalikan saldo nasabah
- setSaldo(): Mengatur saldo nasabah

#### Fitur dan Fungsionalitas

Program ini memiliki fitur dan fungsionalitas yang khusus dan hanya bisa digunakan oleh admin bank, yaitu:

- Fitur Tambah Nasabah
Fitur ini memungkinkan admin untuk menambahkan data nasabah baru. Untuk menggunakan fitur ini, pilih menu "Tambah Nasabah". Kemudian, masukkan data nasabah yang diperlukan, yaitu nama, nomor rekening, dan saldo.
- Fitur Edit Nasabah
Fitur ini memungkinkan admin untuk mengubah data nasabah yang sudah ada. Untuk menggunakan fitur ini, pilih menu "Edit Nasabah". Kemudian, masukkan nomor rekening nasabah yang akan diedit. Setelah nomor rekening ditemukan, admin dapat mengubah data nasabah yang diperlukan, yaitu nama dan saldo.
- Fitur Hapus Nasabah
Fitur ini memungkinkan admin untuk menghapus data nasabah yang sudah ada. Untuk menggunakan fitur ini, pilih menu "Hapus Nasabah". Kemudian, masukkan nomor rekening nasabah yang akan dihapus.
- Fitur Tampilkan Data Nasabah
Fitur ini memungkinkan admin untuk menampilkan data semua nasabah. Untuk menggunakan fitur ini, pilih menu "Tampilkan Nasabah".

#### Cara Penggunaan dan Output