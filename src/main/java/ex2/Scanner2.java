package ex2;
import java.util.Scanner;

public class Scanner2 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            String s = scan.nextLine();
            scan.close();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }

}
