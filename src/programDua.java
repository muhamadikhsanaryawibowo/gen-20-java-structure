import java.util.Scanner;

public class programDua {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scan.nextInt();
        System.out.print(" = " + sumNumber(n));
    }
    public static int sumNumber(int n){
        int x = 0;
        for(int i=1;i<=n;i++) {
            if (i == n){
                System.out.print(i);
            }
            else {
                System.out.print(i + " + ");
            }
            x+=i;
        }
        return x;
    }
}
