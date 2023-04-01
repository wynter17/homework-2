package ex6;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true

public class Arrayv2 {

        public static boolean canWin(int leap, int[] game) {
            for(int index = 0;index < game.length;index ++){
                if(game[index] == 0){
                    return true;

                }
            }
return false;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
            while (q-- > 0) {
                int n = scan.nextInt();
                int leap = scan.nextInt();

                int[] game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = scan.nextInt();
                }

                System.out.println((canWin(leap, game)) ? "YES" : "NO");
            }
            scan.close();
        }
    }

