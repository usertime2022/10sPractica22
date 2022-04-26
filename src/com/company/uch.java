package com.company;
import java.util.Scanner;
public class uch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int san1 = scanner.nextInt();
        int san2 = scanner.nextInt();
        san1++;
        for (; san1 < san2; san1++) {
            System.out.println(san1+" "+san1*san1);
     //       System.out.println((int)Math.pow(san1,san1));

        }

    }
}
