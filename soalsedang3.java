import java.util.Random;
import java.util.Scanner;

public class soalsedang3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean lanjut = true;

        while (lanjut) {
            int bilanganPertama = random.nextInt(100); 
            int bilanganKedua = random.nextInt(100); 
            String operator = "";

            int jenisOperator = random.nextInt(3); 
            double jawaban = 0;
      
            switch (jenisOperator) {
                case 0: 
                    operator = "*";
                    jawaban = bilanganPertama * bilanganKedua;
                    break;
                case 1: 
                    if (bilanganKedua == 0) {
                        bilanganKedua = 1; 
                    }
                    operator = "/";
                    jawaban = (double) bilanganPertama / bilanganKedua;
                    break;
                case 2: // Modulus
                    operator = "%";
                    jawaban = bilanganPertama % bilanganKedua;
                    break;
            }

            System.out.print(bilanganPertama + " " + operator + " " + bilanganKedua + " = ");
            double jawabanUser  = scanner.nextDouble();

            if (jawabanUser  == jawaban) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawaban);
            }

            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("tidak")) {
                lanjut = false;
            }
        }

        scanner.close();
        System.out.println("Terima kasih telah mengikuti kuis!");
    }
}