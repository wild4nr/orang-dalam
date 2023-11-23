package PboW;

public class TesterPersegi{
    public static void main(String[] args) {
        double sisiPersegi = 5.0; // Panjang sisi persegi

        Persegi persegi = new Persegi(sisiPersegi);

        double luas = persegi.hitungLuas();
        double keliling = persegi.hitungKeliling();

        System.out.println("Luas Persegi: " + luas);
        System.out.println("Keliling Persegi: " + keliling);
    }
}

