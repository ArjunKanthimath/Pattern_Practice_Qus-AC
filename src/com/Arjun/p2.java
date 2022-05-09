package com.Arjun;

import java.util.Scanner ;

public class p2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //outer loop                                    //    *
        for (int i=1; i<=n; i++) {                     //    **
            //space loop                              //    ***
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //inner loop
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
