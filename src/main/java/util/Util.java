package util;

import java.util.Scanner;

public class Util {

    /**
     * Считать целое число n, если n:
     * 1) равно 0 , то считать число m и создать матрицу таблицу m на m заполненную числами по порядку
     * 2) равно 1, то считать числа m и t и сделать таблицу m на t заполненную числами по порядку с конца как в примере
     * 3 4
     * 12 11 10 9
     * 8 7 6 5
     * 4 3 2 1
     */

    public static int[][] builderMxM(int m) {
        int[][] arr = new int[m][m];
        int k = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = k;
                k++;
            }
        }
        return arr;
    }

    public static int[][] builderMxT(int m, int t) {
        int[][] arr = new int[m][t];
        int k = m * t;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < t; j++) {
                arr[i][j] = k;
                k--;
            }
        }
        return arr;
    }
}
