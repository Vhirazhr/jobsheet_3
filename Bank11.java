import java.util.Scanner;

/**
 * Bank11
 */
public class Bank11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;
        System.out.println("masukan jumlah tabungan awal");
        jml_tabungan_awal = input.nextInt();
        System.out.println("masukkan lama menabung anda");
        lama_menabung = input.nextInt();
        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;
        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
        input.close();
    }
}