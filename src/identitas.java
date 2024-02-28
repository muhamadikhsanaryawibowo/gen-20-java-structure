import java.util.Scanner;

public class identitas {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print(" Siapa nama kamu? ");
        String nama = scan.nextLine();
        System.out.print(" Lahir tahun berapa? ");
        int tahunLahir = scan.nextInt();
        int umur = 2024 - tahunLahir;
        System.out.println("Halo " + nama + ", " + umur +" Tahun");

    }
}
