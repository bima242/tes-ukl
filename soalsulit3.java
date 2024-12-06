import java.util.Scanner;

public class soalsulit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("jumlah data: ");
        int n = scanner.nextInt();
        int[] angka = new int[n];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        boolean[] sudahDihitung = new boolean[n];

        System.out.println("Frekuensi data:");
        for (int i = 0; i < n; i++) {
            if (!sudahDihitung[i]) {
                int jumlah = 1;

                for (int j = i + 1; j < n; j++) {
                    if (angka[i] == angka[j]) {
                        jumlah++;
                        sudahDihitung[j] = true;
                    }
                }

                System.out.println(angka[i] + " muncul " + jumlah + " kali");
            }
        }

        scanner.close();
    }
}

