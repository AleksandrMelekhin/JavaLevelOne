/**
 * Java 1. Homework # 3
 *
 * @author Aleksandr Melekhin
 * @version 20.12.2021
 */

import java.util.Arrays;

class ThirdHomeWork {
    public static void main(String[] args) {
        changeNumbersInArray();
        fillArray();
        multiplyIfLessSix();
        fillDiagonal();
        System.out.println("5: ");
        System.out.println(Arrays.toString(makeArray(5, 9)));
    }

    static void changeNumbersInArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("1:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1; } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillArray() {
        int arr[] = new int[100];
        System.out.println("2:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void multiplyIfLessSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillDiagonal() {
        int arr[][] = new int[3][3];
        System.out.println("4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

    }

    static int[] makeArray(int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
