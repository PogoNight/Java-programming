package ru.mirea.lab1;
import java.util.Scanner;
public class Proj_1_7 {
    public static int fact(int a){
        if (a<0){
            System.out.println("Введено число меньше нуля!");
            System.exit(-1);
        }
        if (a<=1&&a>=0){
        return 1;
        }
        int ans = 1;
        for (int i = 1; i<a+1; i++){
            ans*=i;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(fact(sc.nextInt()));
        sc.close();
    }
}
