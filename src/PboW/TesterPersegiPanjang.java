package PboW;

public class TesterPersegiPanjang {
        public static void main(String[] args) {
            persegiPanjang();
        }
    static void persegiPanjang() {
        double panjangPersegiPanjang = 7.0; // Panjang persegi panjang
        double lebarPersegiPanjang = 4.0;  // Lebar persegi panjang

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);

        double luas = persegiPanjang.hitungLuas();
        double kililing = persegiPanjang.hitungKeliling();

        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + kililing);
    }
}
