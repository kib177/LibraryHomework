package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Book {
    private int id, year, NumberStr, cost;
    private static int ID;
    private String name, publish, avtor, typePereplet;

    public Book(String name, String avtor, String publish, int year, int numberStr, int cost, String typePereplet) {
        this.id = ID++;
        this.name = name;
        this.avtor = avtor;
        this.publish = publish;
        this.year = year;
        this.NumberStr = numberStr;
        this.cost = cost;
        this.typePereplet = typePereplet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberStr() {
        return NumberStr;
    }

    public void setNumberStr(int numberStr) {
        NumberStr = numberStr;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTypePereplet() {
        return typePereplet;
    }

    public void setTypePereplet(String typePereplet) {
        this.typePereplet = typePereplet;
    }

    public static @NotNull Book getBook() {
        Scanner in = new Scanner(System.in);
        Book customer = new Book("", "", "",1 ,1 ,1 ,"");
        System.out.print("name: ");
        customer.name = in.next();
        System.out.print("avtor: ");
        customer.avtor = in.next();
        System.out.print("publish: ");
        customer.publish = in.next();
        System.out.print("year: ");
        customer.year = in.nextInt();
        System.out.print("NumberStr: ");
        customer.NumberStr = in.nextInt();
        System.out.print("cost: ");
        customer.cost = in.nextInt();
        System.out.print("typePereplet: ");
        customer.typePereplet = in.next();
        System.out.print(customer);
        return customer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avtor='" + avtor + '\'' +
                ", publish='" + publish + '\'' +
                ", year=" + year +
                ", NumberStr=" + NumberStr +
                ", cost=" + cost +
                ", typePereplet='" + typePereplet + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return Objects.equals(publish, book.publish) && Objects.equals(avtor, book.avtor);
//
//    }

}
