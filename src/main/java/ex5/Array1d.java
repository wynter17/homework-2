package ex5;
import java.util.*;

//https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true

public class Array1d {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int index = 0; index < a.length; index++){
                a[index] = scan.nextInt();
            }
            scan.close();

            // Prints each sequential element in array a
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }

