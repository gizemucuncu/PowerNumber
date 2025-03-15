package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int pow = scanner.nextInt();

        System.out.println(base + "^" + pow + " = " + powerOfNumber(base,pow));
    }

    private static int powerOfNumber(int base, int power){
        if(power == 0) return 1;
        return base * powerOfNumber(base,power-1);
    }
}