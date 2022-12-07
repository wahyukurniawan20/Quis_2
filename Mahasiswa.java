public class Mahasiswa{
    int nis;
    String nama;
    String jkl;
    String alamat;

    public Mahasiswa() {
    }
    public Mahasiswa(int nis, String nama) {
        this.nis = nis;
        this.nama = nama;
    }
    public Mahasiswa(int nis, String nama, String jkl, String alamat) {
        this.nis = nis;
        this.nama = nama;
        this.jkl = jkl;
        this.alamat = alamat;
    }

    public void cetak_siswa() {
        System.out.println("Nis =" + nis + "\n" + "Nama =" + nama + "\n" +
                "jkl =" + jkl + "\n"
        );
    }
}