import java.util.Scanner;

public class programSatu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        int count = 0;
        int i = 1;

        while (count < n) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}