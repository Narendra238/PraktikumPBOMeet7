import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        String nama = input.next();
        System.out.println("Masukkan Jabatan : ");
        String jabatan = input.next();
        System.out.println("Masukkan Gaji : ");
        double gaji = input.nextDouble();
        PegawaiTetap pegawaitetap = new PegawaiTetap(nama,jabatan,gaji);
        System.out.println("Nama : "+pegawaitetap.getNama());
        System.out.println("Jabatan : "+pegawaitetap.getJabatan());
        System.out.println("Gaji : "+pegawaitetap.hitungGaji());

        System.out.println("Masukkan Nama Karyawan Kontarak : ");
        String namakontrak = input.next();
        System.out.println("Masukkan Jabatan : ");
        String jabatankontrak = input.next();
        System.out.println("Masukkan Gaji Per Jam : ");
        double gajiperjam = input.nextDouble();
        System.out.println("Masukkan Jam Kerja : ");
        int jamkerja = input.nextInt();
        PegawaiKontrak pegawaiKontrak = new PegawaiKontrak(namakontrak,jabatankontrak,gajiperjam,jamkerja);
        System.out.println("Nama Kontrak : "+pegawaiKontrak.getNama());
        System.out.println("Jabatan Kontrak : "+pegawaiKontrak.getJabatan());
        System.out.println("Gaji Kontrak : "+pegawaiKontrak.hitungGaji());
    }
}