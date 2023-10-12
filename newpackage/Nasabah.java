package newpackage;

import java.util.Objects;

public class Nasabah {

    private String nama;
    private String nomorRekening;
    private int saldo;

    public Nasabah(String nama, String nomorRekening, int saldo) {
        this.nama = nama;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nasabah nasabah = (Nasabah) o;
        return Objects.equals(nama, nasabah.nama) &&
                Objects.equals(nomorRekening, nasabah.nomorRekening) &&
                Objects.equals(saldo, nasabah.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nama, nomorRekening, saldo);
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "nama='" + nama + '\'' +
                ", nomorRekening='" + nomorRekening + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

