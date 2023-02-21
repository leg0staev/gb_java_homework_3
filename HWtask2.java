package HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class HWtask2 {
    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        ArrayList<Integer> newList = getArrayList(10, 0, 10);

        System.out.println("исходный список:");
        System.out.println(newList);

        System.out.println("обработанный список без четных чисел:");
        System.out.println(deleteEvenNumbers(newList));

    }

    public static void deleteEvenNumbers(ArrayList<Integer> array) {
        // удаляет четные числа из списка

        for (Iterator<Integer> iterator = array.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                // System.out.println("This is Even Number: " + number);
                iterator.remove();
            }

        }
    }

    public static ArrayList<Integer> getArrayList(int size, int min, int max) {
        // генерация массива с случайными числами
        ArrayList<Integer> resultList = new ArrayList<>(size);

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            resultList.add(rand.nextInt(min, max));
        }

        return resultList;
    }
}
