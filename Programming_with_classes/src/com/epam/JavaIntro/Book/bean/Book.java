package com.epam.JavaIntro.Book.bean;

import java.util.Objects;

public class Book {
    {
        startId++;
    }

    private static int startId = 0;
    private int id = startId;

    private String title;
    private String author;
    private String publishingHouse;
    private int year;
    private int countPage;
    private double price;
    private String bindingType;

    public Book() {
    }

    public Book(String title, String author, String publishingHouse, int year, int countPage, double price, String bindingType) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.countPage = countPage;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String toString() {
        String string = "";
        string = string + "Id: " + id + "\n Название: " + title + "\n Автор: " + author + "\n Издательство: " + publishingHouse +
                "\n Год издания: " + year + "\n Количество страниц" + countPage + "\n Цена: " + price + "\n Тип переплета: " + bindingType + "\n";
        return string;
    }

    public void print() {
        System.out.println(toString());
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public int getCountPage() {
        return countPage;
    }

    public double getPrice() {
        return price;
    }

    public String getBindingType() {
        return bindingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id == book.id && getYear() == book.getYear() && getCountPage() == book.getCountPage() && Double.compare(book.getPrice(), getPrice()) == 0 && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getPublishingHouse(), book.getPublishingHouse()) && Objects.equals(getBindingType(), book.getBindingType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getTitle(), getAuthor(), getPublishingHouse(), getYear(), getCountPage(), getPrice(), getBindingType());
    }
}


