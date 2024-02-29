import java.util.Scanner;

public class layarSegitiga {
    public static void main(String[] args){
        int i, j, baris;

        Scanner row = new Scanner(System.in);
        System.out.print("baris= ");
        baris = row.nextInt();
        baris += 1;

        for (i=0; i<baris; i++){
            for (j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

