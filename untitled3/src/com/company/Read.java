package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Read {

    public static int Int() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(br.readLine());
        } catch (Exception nfe) {
            System.err.println("Invalid Format!");
            System.exit(0);
            return 0;
        }

    }

    public static String String() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        } catch (Exception nfe) {
            System.err.println("Invalid Format!");
            System.exit(0);
            return "";
        }

    }

}
