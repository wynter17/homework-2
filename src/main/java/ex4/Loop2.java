package ex4;
import java.util.*;

//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true


public class Loop2 {
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int q=1;q<=t;q++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();


                int counter = 1;
                int index = 1;
                while(index <= n){
                    int number = a + counter*b ;
                    index++;
                    counter = counter * 2 + 1;

                    System.out.print(number + " ");

                    if(index == n + 1){
                        System.out.println();
                    }
                }

            }

            in.close();
        }
    }

