public abstract class Pegawai {
    private String nama,jabatan;

    public Pegawai(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public abstract double hitungGaji();
}
