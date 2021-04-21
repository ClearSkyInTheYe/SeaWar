package com.company;



import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] string = {"a", "s", "w", "d"};

        Random random = new Random();

        for (int v = 0; v < 10; v++) {


            String x = "";

            for (int i = 0; i < 40; i++) {
                x = x + string[random.nextInt(4)];

            }
            System.out.println(x+" "+ (x.length()-x.replace("a","").length()));
        }




    }
}
