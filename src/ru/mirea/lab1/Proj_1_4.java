package ru.mirea.lab1;

import java.util.Scanner;

public class Proj_1_4 {
    public static void main(String[] args) {
        final int LENGTH = 5;
        int sumOne = 0;
        int sumTwo = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[LENGTH];
        int i = 0;
        while (i < LENGTH) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
                i++;
            } else {
                System.out.println("Вы ввели не целое число, перезапустите программу.");
                System.exit(-1);
            }
        }
        int minEl = arr[0];
        int maxEl = arr[0];
            int x = 0;
            while (x < LENGTH){
                sumOne+=arr[x];
                if (minEl>arr[x]) {
                    minEl = arr[x];
                }
                x++;
            }
            int z = 0;
            do{
                sumTwo+=arr[z];
                if (maxEl<arr[z]){
                    maxEl = arr[z];
                }
                z++;
            }
            while (z < LENGTH);
        System.out.println("Первая сумма - "+sumOne+"\nВторая сумма - "+sumTwo);
        System.out.println("Мин эл - "+minEl+"\nМакс эл - "+maxEl);
        sc.close();
    }
}
