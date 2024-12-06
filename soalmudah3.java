import java.util.Scanner;

public class soalmudah3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 50; i >= 2; i--) {
            if (i % 3 == 0) {
                System.out.println(i + " saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + " saya anak mokleters");
            } else {
                System.out.println(i + " saya anak wikusama");
            }
        }

        System.out.println(".");
        System.out.println("1 saya senang");

        scanner.close();
    }
}
