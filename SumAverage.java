package assignment6;

import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] t = new int[n];
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + " la: ");
            t[i] = sc.nextInt();
            sum += t[i];
        }
        double ave = (double) sum / n;
        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("Trung binh cong: " + ave);
    }
}
