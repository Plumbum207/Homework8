import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] wholeNumbers = new int[]{1, 2, 3};
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        double[] randomNumbers = new double[4];
        randomNumbers[0] = 1;
        randomNumbers[1] = 2;
        randomNumbers[2] = 3.14;
        randomNumbers[3] = 2.71;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] wholeNumbers = new int[]{1, 2, 3};
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        double[] randomNumbers = new double[4];
        randomNumbers[0] = 1;
        randomNumbers[1] = 2;
        randomNumbers[2] = 3.14;
        randomNumbers[3] = 2.71;

        System.out.println(Arrays.toString(wholeNumbers));
        System.out.println(Arrays.toString(fractionalNumbers));
        System.out.println(Arrays.toString(randomNumbers));
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] wholeNumbers = new int[]{1, 2, 3};
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        double[] randomNumbers = new double[4];
        randomNumbers[0] = 1;
        randomNumbers[1] = 2;
        randomNumbers[2] = 3.14;
        randomNumbers[3] = 2.71;

        for (int i = wholeNumbers.length - 1;    i >= 0; i--) {
            System.out.print(wholeNumbers[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = fractionalNumbers.length - 1;    i >= 0; i--) {
            System.out.print(fractionalNumbers[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = randomNumbers.length - 1;    i >= 0; i--) {
            System.out.print(randomNumbers[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] wholeNumbers = new int[]{1, 2, 3};
        for (int i = 0; i < wholeNumbers.length; i++) {
            if (wholeNumbers[i] % 2 != 0) {
                wholeNumbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(wholeNumbers));
    }
}