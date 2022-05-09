package com.Arjun;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

    int T = in.nextInt();
    for (int tc = 0; tc < T; tc++){
        int A = in.nextInt();
        int B = in.nextInt();

        System.out.println(solve(A,B));
    }

    in.close();

    }

    static int solve(int A,int B) {
        return A + B;
    }
}
