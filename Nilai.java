import java.util.Scanner;
public class Nilai extends MataKuliah {

    int nilai_tugas_1;

    int nilai_tugas_2;

    int nilai_tugas_3;

    int nilai_uts;

    int nilai_uas;

    double addnnlai() {
        double total_nilai = ( nilai_tugas_1 + nilai_tugas_2 + nilai_tugas_3 + nilai_uts + nilai_uas);
        return total_nilai;
    }

    double getRata_rata() {
        double rata_rata =(nilai_tugas_1 * 0.2) + (nilai_tugas_2 * 0.2) + ((nilai_tugas_3 * 0.2)  )+ (nilai_uts * 0.3) +(nilai_uas * 0.5);
        if (rata_rata <= 100)
            System.out.println("predikat anda A");
        else if (rata_rata <= 80)
            System.out.println("predikat anda B");
        else if (rata_rata <= 60)
            System.out.println("predikat anda c");
        else if (rata_rata <= 40)
            System.out.println("predikat anda D");
        else if (rata_rata <= 20)
            System.out.println("predikat anda E");
        return rata_rata;
    }
    void cetak_nilai() {
        System.out.println("total nilai =" + addnnlai());
        System.out.println(("nilai rata-rata =" + getRata_rata()));
    }

    void cetak_status() {
        if (getRata_rata() >= nilailulus) {
            System.out.println("anda lulus dengan nilai =" + getRata_rata());
        } else {
            System.out.println("nilai anda," + getRata_rata() + ",anda dinyatakan belum lulus");
        }
    }
}