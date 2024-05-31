package org.example.homeWork_4;

import java.time.LocalDate;

/**Создать справочник сотрудников
 Необходимо:
 Создать класс справочник сотрудников, который содержит внутри
 коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 Табельный номер
 Номер телефона
 Имя
 Стаж
 Добавить метод, который ищет сотрудника по стажу (может быть список)
 Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 Добавить метод, который ищет сотрудника по табельному номеру
 Добавить метод добавления нового сотрудника в справочник
 */

public class Main {

 public static void main(String[] args) {

        // создаем список сотрудников методом .add()
        Directory employees = new Directory();

        employees.add(new Employee("Artem", "1211321", LocalDate.of(2022, 5, 24)));
        employees.add(new Employee("Petr", "2343215", LocalDate.of(2023, 2, 10)));
        employees.add(new Employee("Victor", "5671351", LocalDate.of(2023, 1, 2)));
        employees.add(new Employee("Anna", "9732358", LocalDate.of(2015, 5, 5)));
        employees.add(new Employee("Pavel", "5438496", LocalDate.of(2024, 4, 11)));
        employees.add(new Employee("Artem", "8422684", LocalDate.of(2019, 12, 27)));
        employees.add(new Employee("Maria", "2666578", LocalDate.of(2022, 7, 12)));

        System.out.println("Список сотрудников: " + employees);

        // поиск сотрудников по стажу (нижняя и верхняя граница включительно)
        int minYears = 2;
        int maxYears = 5;
        System.out.println("\nСписок сотрудников по стажу (от " + minYears + " до " + maxYears + " лет): "
                + employees.findEmployeeByYearsOnService(minYears, maxYears));

        // поиск сотрудников по имени
        String name = "Artem";
        System.out.println("\nСписок сотрудников с именем '" + name + "': "
                + employees.findEmployeeByName(name));


        // поиск сотрудника по табельному номеру
        int employeeId = 3;
        System.out.println("\nПоиск сотрудника по табельному номеру ID '" + employeeId + "': "
                + employees.findEmployeeById(employeeId));

    }
}
