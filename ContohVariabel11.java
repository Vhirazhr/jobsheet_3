/**
 * ContohVariabel11
 */
public class ContohVariabel11 {

    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Mendengarkan Music";
        boolean iskamuPandai = true;
        char jenisKelamin = 'p';
        byte _umurSayaSekarang = 20;
        double $ipk = 4.00, tinggi = 1.78;

        System.out.println(salahSatuHobiSayaAdalah);
        ;
        System.out.println("Apakah pandai? " + iskamuPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("UmurKu saat ini: " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s dengan tinggi badan %s meters", $ipk, tinggi));
    }
}