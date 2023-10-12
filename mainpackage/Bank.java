package mainpackage;

import newpackage.Nasabah;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        
        // Inisialisasi Scanner
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi collection untuk menyimpan data nasabah
        ArrayList<Nasabah> nasabahList = new ArrayList<>();

        // Menu utama
        while (true) {
            System.out.println("===== Menu Bank =====");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Edit Nasabah");
            System.out.println("3. Hapus Nasabah");
            System.out.println("4. Tampilkan Nasabah");
            System.out.println("5. Keluar");

            // Pilih menu
            System.out.print("Pilih menu (1/2/3/4/5): ");
            int pilihan = scanner.nextInt();

            // Lakukan aksi sesuai pilihan
            switch (pilihan) {
                case 1 -> // Tambah nasabah
                    tambahNasabah(nasabahList, scanner);
                case 2 -> // Edit nasabah
                    editNasabah(nasabahList, scanner);
                case 3 -> // Hapus nasabah
                    hapusNasabah(nasabahList, scanner);
                case 4 -> // Tampilkan nasabah
                    tampilkanNasabah(nasabahList);
                case 5 -> // Keluar
                    System.exit(0);
                default -> // Pilihan tidak valid
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
        
    // Fungsi untuk menambah nasabah
    private static void tambahNasabah(ArrayList<Nasabah> nasabahList, Scanner scanner) {
        // Input data nasabah
        System.out.print("Masukkan nama nasabah: ");
        String nama = scanner.next();
        System.out.print("Masukkan nomor rekening: ");
        String nomorRekening = scanner.next();
        System.out.print("Masukkan saldo: ");
        int saldo = scanner.nextInt();

        // Tambah nasabah ke collection
        nasabahList.add(new Nasabah(nama, nomorRekening, saldo));
    }
    
    // Cari nasabah berdasarkan nomor rekening
    private static Nasabah getNasabahByNomorRekening(ArrayList<Nasabah> nasabahList, String nomorRekening) {
        for (Nasabah nasabah : nasabahList) {
            if (nasabah.getNomorRekening().equals(nomorRekening)) {
                return nasabah;
            }
        }
        return null;
    }

    // Fungsi untuk mengedit nasabah
    private static void editNasabah(ArrayList<Nasabah> nasabahList, Scanner scanner) {
        // Input nomor rekening nasabah yang akan diedit
        System.out.print("Masukkan nomor rekening nasabah yang akan diedit: ");
        String nomorRekening = scanner.next();

        // Cari nasabah berdasarkan nomor rekening
        Nasabah nasabah = getNasabahByNomorRekening(nasabahList, nomorRekening);

        // Jika nasabah tidak ditemukan, tampilkan pesan
        if (nasabah == null) {
            System.out.println("Nasabah tidak ditemukan");
            return;
        }

        // Input data nasabah yang baru
        System.out.print("Masukkan nama nasabah baru: ");
        String nama = scanner.next();
        System.out.print("Masukkan saldo baru: ");
        int saldo = scanner.nextInt();

        // Set data nasabah yang baru
        nasabah.setNama(nama);
        nasabah.setSaldo(saldo);

        // Tampilkan pesan berhasil
        System.out.println("Nasabah berhasil diedit");
    }


    // Fungsi untuk menghapus nasabah
    private static void hapusNasabah(ArrayList<Nasabah> nasabahList, Scanner scanner) {
        // Input nomor rekening nasabah yang akan dihapus
        System.out.print("Masukkan nomor rekening nasabah yang akan dihapus: ");
        String nomorRekening = scanner.next();

        // Cari nasabah berdasarkan nomor rekening
        Nasabah nasabah = getNasabahByNomorRekening(nasabahList, nomorRekening);

        // Jika nasabah tidak ditemukan, tampilkan pesan
        if (nasabah == null) {
            System.out.println("Nasabah tidak ditemukan");
            return;
        }

        // Hapus nasabah dari collection
        nasabahList.remove(nasabah);

        // Tampilkan pesan berhasil
        System.out.println("Nasabah berhasil dihapus");
    }

        // Tampilkan header
    public static void tampilkanNasabah(ArrayList<Nasabah> nasabahList) {
        System.out.println("===== Data Nasabah =====");
        System.out.println("No | Nama | Nomor Rekening | Saldo");

        // Tampilkan data nasabah
        for (int i = 0; i < nasabahList.size(); i++) {
            Nasabah nasabah = nasabahList.get(i);

            // Format output
            System.out.printf("%d | %s | %s | %d\n",
                    i + 1,
                    nasabah.getNama(),
                    nasabah.getNomorRekening(),
                    nasabah.getSaldo());
    }
}
}