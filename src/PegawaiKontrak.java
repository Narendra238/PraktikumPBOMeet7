public class PegawaiKontrak extends Pegawai{
    private  double gajiPerjam;
    private int jamKerja;
    public PegawaiKontrak(String nama, String jabatan,double gajiPerjam , int jamKerja) {
        super(nama, jabatan);
        this.gajiPerjam = gajiPerjam;
        this.jamKerja = jamKerja;
    }

    public double getGajiPerjam() {
        return gajiPerjam;
    }

    public void setGajiPerjam(double gajiPerjam) {
        this.gajiPerjam = gajiPerjam;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public final double hitungGaji(){
        return gajiPerjam * jamKerja;
    }
}
