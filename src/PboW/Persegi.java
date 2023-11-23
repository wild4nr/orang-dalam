package PboW;

public class Persegi {
        private final double sisi;
        public Persegi(double sisi) {
            this.sisi = sisi;
        }

        public double hitungLuas() {
            return sisi * sisi;
        }

        public double hitungKeliling() {
            return 4 * sisi;
        }

        public static void main(String[] args) {
            double sisiPersegi = 5.0; // Panjang sisi persegi

            Persegi persegi = new Persegi(sisiPersegi);

            double luas = persegi.hitungLuas();
            double keliling = persegi.hitungKeliling();

            System.out.println("Luas Persegi: " + luas);
            System.out.println("Keliling Persegi: " + keliling);
        }
}
