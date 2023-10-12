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
Menu utama
![menu utama](https://github.com/ayucahyarani/pbo-post-test-2/assets/121865360/800aac37-481b-4845-a179-3b7f47472296)
#
Fitur Tambah Nasabah
![tambah nasabah](https://github.com/ayucahyarani/pbo-post-test-2/assets/121865360/61fa30bd-943d-4a74-9b94-368c5db7199c)
#
Fitur tampilan setelah berhasil ditambahkan
![tampilan nasabah](https://github.com/ayucahyarani/pbo-post-test-2/assets/121865360/36699c75-0483-44ea-90e9-f79c8f3762e1)
#
Fitur Edit Nasabah
![edit nasabah](https://github.com/ayucahyarani/pbo-post-test-2/assets/121865360/13bfe845-196e-4902-a2fa-8571a8a6eea2)
#
Fitur tampilan setelah berhasil diedit
![tampilan edit nasabah](https://github.com/ayucahyarani/pbo-post-test-2/assets/121865360/b3af31a1-0e37-4d92-84f9-8cf5715fee60)
#
Menambahkan data nasabah
![tambah nasabah 2](https://github.com/ayucahyarani/pbo-post-test-2/assets/121865360/e87fc57c-8576-45f2-83d1-4b4dd1ae0c51)
#
Fitur tampilan setelah berhasil ditambahkan
![tampilan nasabah 2](https://github.com/ayucahyarani/pbo-post-test-2/assets/121865360/95b5dbaf-c85a-49f6-876e-8c8e29c0afb6)
#
Fitur Hapus Nasabah
![hapus nasabah](https://github.com/ayucahyarani/pbo-post-test-2/assets/121865360/cd1d5667-4f51-475a-ac8e-fa43c88a2803)
#
Fitur tampilan setelah berhasil dihapus
![tampilan nasabah 3](https://github.com/ayucahyarani/pbo-post-test-2/assets/121865360/76627c2d-461d-4186-ac4b-0ba828b8c407)
#
Tampilan ketika admin salah nomor rekening
![salah edit nasabah](https://github.com/ayucahyarani/pbo-post-test-2/assets/121865360/9faa9f96-488e-487d-b081-6734e4b8293c)
#
Fitur keluar
![keluar nasabah](https://github.com/ayucahyarani/pbo-post-test-2/assets/121865360/10aab60f-9c6c-4014-830d-2b03b7d6acc0)
