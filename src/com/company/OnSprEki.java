package com.company;
import java.util.Scanner;
public class OnSprEki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int san = scanner.nextInt();
        int esep = 1;
        for (int i = 1; i <= san; i++) {
            esep *= i;
            if (i == san) {
                System.out.print(i + "=");
            } else {
                System.out.print(i + "*");
            }
        }
            System.out.println(esep);
    }
}
