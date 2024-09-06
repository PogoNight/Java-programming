package ru.mirea.lab1;
import java.util.Scanner;
public class Proj_1_3 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    float avg;
    int[] mas = new int[10];
    for (int i = 0; i < mas.length; i++) {
        if (sc.hasNextInt()) {
            mas[i] = sc.nextInt();
        }
     else {
        System.out.println("Вы ввели не целое число");
        //i--;
    }
    }
    for (int i = 0; i < mas.length; i++){
        sum+=mas[i];
    }
    avg = (float) sum /mas.length;
    System.out.println("Сумма чисел - "+sum+"\nСреднее арифметическое - "+avg);
    sc.close();
}
}
