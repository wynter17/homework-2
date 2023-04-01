package ex6;


import java.util.Scanner;

public class Array2v2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        for (int count = 1; count <= q; count++) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }

            System.out.println(canWin(leap, array));
        }


    }

    public static String canWin(int leap, int[] array) {
        boolean stuck = false;
        int pos = 0;
        while (pos < array.length && !stuck) {
            if (pos + leap >= array.length) {
                pos += leap;
                break;
            } else {
                if (array[pos + leap] == 0) {
//                    System.out.println("no");
                    pos += leap;
                } else {
                    if (pos > 0 && array[pos - 1 + leap] == 0) {
//                        System.out.println("no2");
                        pos += leap;
                    } else if (pos < array.length - 1 && array[pos + 1] == 0) {
//                        System.out.println("no3");
                        pos += 1;
                    } else {
//                        System.out.println("no4");
                        stuck = true;

                    }
                }
            }
        }
//
//        if (pos >= array.length){
//            return "YES";
//        } else {
//            return "NO";
//        }

        return pos >= array.length && !stuck ? "YES" : "NO";
    }

}
