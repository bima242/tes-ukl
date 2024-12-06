import java.util.Scanner;

public class soalsedang2 {

    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        double pi = (22/7);
        double hasil = pi * jariJari * jariJari * tinggi;
        return hasil;
    }

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = scanner.nextDouble();

        double hasil = hitungVolumeTabung(jariJari, tinggi); 
        System.out.print("Volume tabung: " + hasil); 

        scanner.close();
    }
}