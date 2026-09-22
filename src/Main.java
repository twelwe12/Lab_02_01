// Lab_02.1.java
// Лука Остап
// Лабораторна робота №2
// Лінійні програми
// Варіант 18

import java.util.Scanner;

public class Main{
    static void main(){
        System.out.print("Введіть число: ");
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double z1, z2;

        z1 = ((a + 2) / Math.sqrt(2 * a)
                - a / (Math.sqrt(2 * a) + 2)
                + 2 / (a - Math.sqrt(2 * a)))
                * (Math.sqrt(a) - Math.sqrt(2)) / (a + 2);

        z2 = 1 / (Math.sqrt(a) + Math.sqrt(2));

        System.out.println("z1: " + z1);
        System.out.println("z2: " + z2);
    }
}