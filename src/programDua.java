import java.util.Scanner;

public class programDua {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scan.nextInt();
        System.out.print("Jumlah dari sejumlah deret angka n adalah " );
    }
    public static int getNumber(int total, int n){
        for(int i=1;i<n;i++) {
            System.out.print(i);
        }
        return total;
    }
}
