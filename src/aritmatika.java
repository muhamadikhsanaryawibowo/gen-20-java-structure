import java.util.Scanner;

public class aritmatika {
    public static void main(String[] args) {

        int x, y, z;
        Scanner sum = new Scanner(System.in);
        System.out.print("x= ");
        x = sum.nextInt();
        System.out.print("y= ");
        y = sum.nextInt();

        z = x + y;

        System.out.println("z= x + y" );
        System.out.println("z= " + z);

    }
}