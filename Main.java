import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        //0001
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a + b);

        out.flush();

        //0025
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a>b) {
            System.out.println(">");
        }
        if (a<b) {
            System.out.println("<");
        }
        if (a==b) {
            System.out.println("=");
        }

        out.flush();

        //0195
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a * b * n * 2);

        out.flush();

        //0773
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int k = in.nextInt();
        int m = in.nextInt();

        System.out.println(k*m*k);

        out.flush();

        //0021
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] arr = new int[]{a,b,c};
        Arrays.sort(arr);
        System.out.println(arr[2] - arr[0]);

        out.flush();

    }
}
