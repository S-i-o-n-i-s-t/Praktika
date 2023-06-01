//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
//        метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.


package Praktika;

import java.util.Random;

public class Tassk1 {
        public static void main(String[] args) {
            int [][] massiv = new int[5][5];
            Random random = new Random();
            for (int i = 0; i < massiv.length; i++) {
                for (int j = 0; j < massiv[i].length; j++) {
                    massiv[i][j] = random.nextInt(3, 10);
                }
            }
            System.out.println(f1(massiv));
    }

        //  [[1 2 3 94 5]       [[1 2 3 94 5]
        //   [1 2 3 14 5]        [1 2 3 14 5]
        //   [1 2 3 47 5]        [1 2 3 47 5]
        //   [1 2 3 40 5]]       [1 2 3 40 5]]

    public static int f1(int[][] massiv){
        if (massiv.length != massiv[0].length){
            throw new RuntimeException("Массив не квадратный");
        }
        int summ = 0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                if (massiv[i][j] != 0 && massiv[i][j] != 1) {
                    throw new RuntimeException("Значение элемента массива не соответствует условию задачи");
                }
                summ = summ + massiv[i][j];
                System.out.print(massiv[i][j]);
            }
            System.out.println();
        }
        return summ;
    }
}
