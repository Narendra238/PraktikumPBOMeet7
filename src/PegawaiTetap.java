public class PegawaiTetap extends Pegawai{
    private double gajiPokok;
    public PegawaiTetap(String nama, String jabatan,double gajiPokok) {
        super(nama, jabatan);
        this.gajiPokok = gajiPokok;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok;
    }
}
