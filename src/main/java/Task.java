public class Task {

    //Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Задание 2
    public static void checkSumSign() {
        int a = 5;
        int b = -7;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //Задание 3
    public static void printColor() {
        int value = 50;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //Задание 4
    public static void compareNumbers() {
        int a = -7;
        int b = 7;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //Задание 5
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    //Задание 6
    public static void paramNumber(int c) {
        if (c >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    //Задание 7
    public static boolean paramInteger(int D) {
        if (D < 0) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 8
    public static void paramStrInt(String x, int y) {
        for (int i = 0; i < y; i++) {
            System.out.println(x);
        }
    }

    //Задание 9
    public static boolean leapYear(int year) {
        if (year % 4 == 0) { //каждый 4-й год является високосным
            if (year % 100 == 0) { //каждый 4-й год является високосным, кроме каждого 100-го
                if (year % 400 == 0) { //каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й - високосный
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    //Задание 14
    public static int[] argsTwo (int len, int initialValue){
        int[] arr = new int [len];

        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        } return arr;
    }
}