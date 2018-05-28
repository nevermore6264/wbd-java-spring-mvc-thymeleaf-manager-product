package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private double money;
    private String category;

    public Product() {
    }

    public Product(int id, String name, double money, String category) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.category = category;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}