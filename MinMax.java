package assignment6;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] t = new int[n];

        System.out.print("Phan tu thu 1 la: ");
        t[0] = sc.nextInt();
        int l = t[0];
        int b = t[0];

        for (int i = 1; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + " la: ");
            t[i] = sc.nextInt();
            if (t[i] > l) {
                l = t[i];
            }
            if (t[i] < b) {
                b = t[i];
            }
        }
        System.out.println("Phan tu lon nhat: " + l);
        System.out.println("Phan tu be nhat: " + b);
    }
}