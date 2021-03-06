package com.epam.JavaIntro.Travel;

import java.util.Comparator;
import java.util.Objects;

public class TravelVoucher {

    Country country;
    TravelType type;
    Transport transport;
    FoodType food;
    int amountDays;
    int price;

    public TravelVoucher() {
    }

    public TravelVoucher(Country country, TravelType type, Transport transport, FoodType food, int amountDays, int price) {
        this.country = country;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.amountDays = amountDays;
        this.price = price;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public TravelType getType() {
        return type;
    }

    public void setType(TravelType type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public FoodType getFood() {
        return food;
    }

    public void setFood(FoodType food) {
        this.food = food;
    }

    public int getAmountDays() {
        return amountDays;
    }

    public void setAmountDays(int amountDays) {
        this.amountDays = amountDays;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Comparator<TravelVoucher> getSortPrice() {
        return sortPrice;
    }

    public static void setSortPrice(Comparator<TravelVoucher> sortPrice) {
        TravelVoucher.sortPrice = sortPrice;
    }

    enum Country {
        Египет,
        Турция,
        Израиль,
        Грузия,
        Таиланд
    }

    enum TravelType {
        REST,
        EXCURSION,
        TREATMENT,
        SHOPPING,
        CRUISE
    }

    enum Transport {
        BUS,
        TRAIN,
        AIRPLANE
    }

    enum FoodType {
        OB,
        BB,
        HB,
        FB,
        ALL_INCLUSIVE
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TravelVoucher)) return false;
        TravelVoucher that = (TravelVoucher) o;
        return amountDays == that.amountDays && price == that.price && country == that.country && type == that.type && transport == that.transport && food == that.food;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, type, transport, food, amountDays, price);
    }

    @Override
    public String toString() {
        return "Доступные путевки: {" +
                "страна: " + country +
                ", тип: " + type +
                ", транспорт: " + transport +
                ", тип питания: " + food +
                ", количество дней: " + amountDays +
                ", стоимость тура: " + price +
                '}';
    }

    public static Comparator<TravelVoucher> sortPrice = new Comparator<TravelVoucher>() {
        @Override
        public int compare(TravelVoucher o1, TravelVoucher o2) {
            return (int) (o1.price - o2.price);
        }
    };
}

