package Fibonachi;

import java.util.Scanner;

public class fibonachi {

    public static void main(String[] args) {
        int [] fib = new int[45];
        System.out.println("수를 입력하시오");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fib[0] = 0;
        fib[1] = 1;

        for(int i= 2; i<n; i++ ) {
            fib[i] = fib[i-1] + fib[i-2];
        }


        System.out.println(fib[n-1]);

    }

}


