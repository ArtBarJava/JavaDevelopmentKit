package org.example.homeWork_3.task1;


// Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
// sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
// над которыми должна быть произведена операция.
public class Main {
    public static void main(String[] args) {

        int num1 = 555;
        double num2 = 5.5;
        float num3 = 0;

        System.out.println(num1 + " + " + num2 + " = " + Calculator.sum(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + Calculator.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + Calculator.divide(num1, num2));
        System.out.println(num2 + " / " + num3 + " = " + Calculator.divide(num2, num3));
        System.out.println(num1 + " - " + num2 + " = " + Calculator.subtract(num1, num2));

    }
}
