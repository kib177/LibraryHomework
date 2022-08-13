package com.company;

import java.util.Scanner;
public class Main {
    private static String avtor, publish;
    private static int years;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lib lib = new Lib(10);

        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выйти\n" +
                            "1. добавить книгу\n" +
                            "2. вывод книг по автору\n" +
                            "3. вывод книг по издательству\n" +
                            "4. вывод книг от года\n" +
                            ": ");

            int choice = scanner.nextInt();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 4) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }

            switch (choice) {
                case 1:
                    lib.incMas(Book.getBook());
                    break;
                case 2:
                    System.out.print("Введите автора для поиска: ");
                    avtor = scanner.next();
                    lib.SortAvtor(avtor);
                    break;
                case 3:
                    System.out.print("Введите издательство для поиска: ");
                    publish = scanner.next();
                    lib.SortPublish(publish);
                    break;
                case 4:
                    System.out.print("Введите год для поиска: ");
                    years = scanner.nextInt();
                    lib.searchYears(years);

            }
        }
    }
}
