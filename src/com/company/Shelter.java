package com.company;

public class Shelter {
    private String name;
    private String address;                // Поля

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;            //Конструктор
    }

    public String getName() {              //методы
        return name;
    }


    public String getAddress() {
        return address;
    }


}
