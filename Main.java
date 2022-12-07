import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner obj=new Scanner(System.in);
        Mahasiswa mahasiswa=new Mahasiswa(18210018,"Wahyu Kurniawan");
        mahasiswa.cetak_siswa();
        System.out.println("============input data Matakuliah :======");
        Nilai nilai=new Nilai();
        Nilai grade= new Nilai();
        System.out.print("kode Matakuliah=");
        nilai.kdmt= obj.nextLine();
        System.out.print("nama matakuliah =");
        nilai.nmmt=obj.nextLine();
        System.out.println("============Data Matakuliah============");
        nilai.cetakmt();
        System.out.println("============Data Nilai============");
        System.out.print("Nilai tugas 1=");
        nilai.nilai_tugas_1=obj.nextInt();
        System.out.print("Nilai tugas 2=");
        nilai.nilai_tugas_2=obj.nextInt();
        System.out.print("Nilai tugas 3=");
        nilai.nilai_tugas_3=obj.nextInt();
        System.out.print("nilai_UTS =");
        nilai.nilai_uts=obj.nextInt();
        System.out.print("nilai_UAS =");
        nilai.nilai_uas=obj.nextInt();
        nilai.addnnlai();
        System.out.println("============Status Nilai============");
        nilai.getRata_rata();
        nilai.cetak_nilai();
        System.out.println("================================");
        nilai.cetak_status();
    }
}