import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Task.printThreeWords();
        System.out.println();

        //Задание 2
        Task.checkSumSign();
        System.out.println();

        //Задание 3
        Task.printColor();
        System.out.println();

        //Задание 4
        Task.compareNumbers();
        System.out.println();

        //Задание 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число - ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число - ");
        int b = scanner.nextInt();
        boolean result = Task.checkSum(a, b);
        System.out.println(result);
        System.out.println();

        //Задание 6
        System.out.print("Задача 6: введите число - ");
        int c = scanner.nextInt();
        Task.paramNumber(c);
        System.out.println();

        //Задание 7
        System.out.print("Задача 7: введите число - ");
        int D = scanner.nextInt();
        boolean result1 = Task.paramInteger(D);
        System.out.println(result1);
        System.out.println();

        //Задание 8
        Task.paramStrInt("Hello, World!", 1);
        System.out.println();

        //Задание 9
        System.out.println(Task.leapYear(2000));
        System.out.println(Task.leapYear(2005));
        System.out.println(Task.leapYear(1895));
        System.out.println(Task.leapYear(1800));
        System.out.println();

        //Задание 10

        int[] array = {0, 0, 0, 1, 1, 1};

        for (int j = 0; j < array.length; j++) {
            if (array[j] == 0) {
                array[j] = 1;
            } else {
                array[j] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println();

        //Задание 11
        int[] arrayNull = new int[100];
        for (int i = 0; i < arrayNull.length; i++) {
            arrayNull[i] = i + 1;
            System.out.println("arrayNull [" + i + "] = " + arrayNull[i]);
        }
        System.out.println();

        //Задание 12
        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < 6) {
                arrayNumbers[i] = arrayNumbers[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println();

        //Задание 13
        int n = 5;
        int[][] arrayTwo = new int[n][n];
        for (int i = 0; i < n; i++) {
            arrayTwo[i][i] = 1;
            arrayTwo[i][n - 1 - i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayTwo[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        //Задание 14
        int[] resultArr = Task.argsTwo(5, 10);
        System.out.println(Arrays.toString(resultArr));
    }
}