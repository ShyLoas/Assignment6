package assignment6;

import java.util.Scanner;

public class Occurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] t = new int[n];
        int c = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + " la: ");
            t[i] = sc.nextInt();
        }

        System.out.print("Nhap so can tim: ");
        int num = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (t[i] == num) {
                c++;
            }
        }
        System.out.println("So " + num + " co " + c + " lan xuat hien");
    }
}
