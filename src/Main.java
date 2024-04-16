import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("task1");

        int[] arrOne = new int[3];
        arrOne[0] = 1;
        arrOne[1] = 2;
        arrOne[2] = 3;

        double[] arrTwo = {1.57, 7.654, 9.986};

        int i = 5;
        int[] arrThree = new int[4];
        arrThree[2] = i;

        System.out.println("___________________________");
        System.out.println("task2");
        //Вывод первого массива
        for (int index = 0; index < arrOne.length; index++) {
            if (index == arrOne.length - 1) {
                System.out.println(arrOne[index]);
                break;
            }
            System.out.print(arrOne[index] + ", ");
        }

        //Вывод второго массива
        System.out.println(Arrays.toString(arrTwo));

        //Вывод третьего массива
        for (int index = 0; index < arrThree.length; index++) {
            if (index == arrThree.length - 1) {
                System.out.println(arrThree[index]);
                break;
            }
            System.out.print(arrThree[index] + ", ");
        }

        System.out.println("___________________________");
        System.out.println("task3");
        //Вывод первого массива
        for (int index = arrOne.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arrOne[index]);
                break;
            }
            System.out.print(arrOne[index] + ", ");
        }

        //Вывод второго массива
        for (int index = arrTwo.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arrTwo[index]);
                break;
            }
            System.out.print(arrTwo[index] + ", ");
        }

        //Вывод третьего массива
        for (int index = arrThree.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arrThree[index]);
                break;
            }
            System.out.print(arrThree[index] + ", ");
        }

        System.out.println("___________________________");
        System.out.println("task4");
        for (int index = 0; index < arrOne.length; index++) {
            int j = arrOne[index];
            if (j % 2 != 0) {
                j++;
                arrOne[index] = j;
            }
        }
        System.out.println(Arrays.toString(arrOne));


    }
}