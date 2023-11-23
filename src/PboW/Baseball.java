package PboW;

public class Baseball {
        private final double massa;
        private final double kecepatanAwal;

        public Baseball(double massa, double kecepatanAwal) {
            this.massa = massa / 1000; // Konversi gram ke kilogram
            this.kecepatanAwal = kecepatanAwal;
        }

        public double hitungEnergiKinetik() {
            return 0.5 * massa * kecepatanAwal * kecepatanAwal;
        }

        public double hitungUsaha() {
            double kecepatanAwalDiam = 0;
            return 0.5 * massa * (kecepatanAwal * kecepatanAwal - kecepatanAwalDiam * kecepatanAwalDiam);
        }

        public static void main(String[] args) {
            double massa = 145; // Massa dalam gram
            double kecepatanAwal = 25; // Kecepatan awal dalam m/s

            Baseball baseball = new Baseball(massa, kecepatanAwal);

            double energiKinetik = baseball.hitungEnergiKinetik();
            double usaha = baseball.hitungUsaha();

            System.out.println("Energi Kinetik: " + energiKinetik + " Joule");
            System.out.println("Usaha yang dilakukan: " + usaha + " Joule");
        }
}
