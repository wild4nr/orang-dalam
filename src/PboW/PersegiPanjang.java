package PboW;

public class PersegiPanjang {
        private final double panjang;
        private final double lebar;

        public PersegiPanjang(double panjang, double lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }

        public double hitungLuas() {
            return panjang * lebar;
        }

        public double hitungKeliling() {
            return 2 * (panjang + lebar);
        }

        public static void main(String[] args) {
            TesterPersegiPanjang.persegiPanjang();
        }

}
