import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenar Giriniz : ");
        a = input.nextDouble();
        System.out.print("2. Kenar Giriniz : ");
        b = input.nextDouble();
        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs : " + c);
        /**
         * @author Erdem AYDEMİR.
         */
    }
}
