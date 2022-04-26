package com.company;
import java.util.Scanner;
public class OnSbir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //    int a = scanner.nextLine();
        int summa = 0;
        for (int i = 1; i <= 10; i++) {
            summa += i;
            if (i == 10) {
                System.out.print(i + "=");
            } else {
                System.out.print(i + "+");
            }
            //public static void main(String[] args) {
        }
            System.out.print(summa);
    }
}
