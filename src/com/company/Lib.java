package com.company;

public class Lib {
    private Book[] book;
    private int capacity;
    private int size;

    public Lib (int capacity) {
        this.book = new Book[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public void incMas(Book books){
        if (size < capacity) {
            book[size] = books;
            size++;
        } else {
            Book[] buffer = new Book[capacity * 2];
            for (int i = 0; i < size; ++i) {
                buffer[i] = book[i];
            }
            book = buffer;
            capacity = capacity * 2;
            book[size] = books;
            size++;
        }
    }

    public void print() {
        for (int i = 0; i < size; ++i) {
            book[i].toString();
        }
    }

    public void searchYears(int y) {

        for (int i = 0; i < size; ++i) {
            System.out.println(book[i].getYear()+ " " + y);
            if (y<=book[i].getYear()) {
                System.out.println(book[i]);
            }
        }
    }

    public void SortAvtor(String a) {
        for (int i = 0; i < size; ++i) {
            if (a==(book[i].getAvtor())) {
                print();
            }

        }
    }
    public void SortPublish(String publishq) {
                for (int i = 0; i < size; ++i) {
                    if (publishq.equals(book[i].getPublish())){
                        book[i].toString();
                    }
                }
    }
}



