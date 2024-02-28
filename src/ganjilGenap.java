import java.util.Scanner;

public class ganjilGenap {
    public static void main (String[] args){

        int a, b, jumlah;
        Scanner scan = new Scanner(System.in);
        System.out.print("a= ");
        a = scan.nextInt();
        System.out.print("b= ");
        b = scan.nextInt();

        jumlah = a + b + 1;

        if(jumlah % 2 == 0){
            System.out.println("a + b + 1 = " + jumlah + ", adalah bilangan genap");
        }
        else {
            System.out.println("a + b + 1 = " + jumlah + ", adalah bilangan ganjil");
        }


    }



}
