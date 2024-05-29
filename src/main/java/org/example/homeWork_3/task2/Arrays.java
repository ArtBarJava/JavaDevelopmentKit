package org.example.homeWork_3.task2;

// Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
// и false в противном случае. Массивы могут быть любого типа данных,
// но должны иметь одинаковую длину и содержать элементы одного типа.
public class Arrays {

    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].getClass().equals(arr2[i].getClass())) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {10, 15, 20};
        Integer[] arr2 = {50, 100, 1000};
        System.out.println("Массивы Integer равной длины ? - " + compareArrays(arr1, arr2));

        String[] arr5 = {"asd", "qwe", "rty"};
        String[] arr6 = {"Hi!", "Hello!", "Aloha"};
        System.out.println("Массивы String равной длины ? - " + compareArrays(arr5, arr6));

        Double[] arr3 = {1.2, 3.4, 5.6};
        Double[] arr4 = {7.8, 9.0, 11.12, 13.14};
        System.out.println("Массивы Double равной длины ? - " + compareArrays(arr3, arr4));
    }
}
