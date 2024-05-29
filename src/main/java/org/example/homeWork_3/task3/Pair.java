package org.example.homeWork_3.task3;

// Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
// Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
// а также переопределение метода toString(), возвращающее строковое представление пары.

public class Pair <T, U>{
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString(){
        return "Значение класса " + first.getClass().getSimpleName() + " - " + first
                + "\nЗначение класса " + second.getClass().getSimpleName() + " - " + second + "\n";
    }

    public static void main(String[] args) {

        System.out.println(new Pair<>(123.321d, 39832L));

        System.out.println(new Pair<>(0.78945613f, "Privet!"));

        System.out.println(new Pair<>(0, 'A'));
    }
}
