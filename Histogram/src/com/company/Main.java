package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;
        int countNumsP1 = 0;
        int countNumsP2 = 0;
        int countNumsP3 = 0;
        int countNumsP4 = 0;
        int countNumsP5 = 0;

        for (int i = 1; i <= count ; i++){
            int num = scan.nextInt();
            if (num < 200){
                countNumsP1 += 1;
            }else if (num >= 200 && num <= 399){
                countNumsP2 += 1;
            }else if (num >= 400 && num <=599){
                countNumsP3 += 1;
            }else if (num >= 600 && num <=799){
                countNumsP4 += 1;
            }else{
                countNumsP5 += 1;
            }
        }
        p1 = ((double)countNumsP1 / (double)count) * 100;
        p2 = ((double)countNumsP2 / (double)count) * 100;
        p3 = ((double)countNumsP3 / (double)count) * 100;
        p4 = ((double)countNumsP4 / (double)count) * 100;
        p5 = ((double)countNumsP5 / (double)count) * 100;

        System.out.printf("%.2f%% %n%.2f%% %n%.2f%% %n%.2f%% %n%.2f%%", p1, p2, p3, p4, p5);
    }
}
