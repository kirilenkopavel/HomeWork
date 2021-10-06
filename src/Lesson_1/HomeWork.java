package Lesson_1;

public class HomeWork {
    public static void main(String[] args) {
        drawSquare();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void drawSquare() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 5;
        int b = 10;
        int result = a + b;

        System.out.println(result >= 0 ? "Сумма положительная" : "Сумма отрицательная");

    }

    static void printColor() {
        int value = 144;

        if (value <= 0){
            System.out.println("Красный");
        }   else if (value > 0 && value <= 100){
                System.out.println("Желтый");
        }   else if (value > 100){
                System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 7;
        int b = 15;

        System.out.println(a >= b? "a>=b" : "a<b");
    }
}
