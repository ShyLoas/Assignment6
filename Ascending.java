package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] t = new int[n];
        int c = 0, tg = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + " la: ");
            t[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                if(t[i] > t[j]){
                    tg = t[i];
                    t[i] = t[j];
                    t[j] = tg;
                }
            }
        } 
        
        System.out.println(Arrays.toString(t));
    }
}
