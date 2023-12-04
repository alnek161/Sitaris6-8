package com.example.ProductService;


public class Entertainment {
    private String name;
    private String category;
    private String description;
    private String place;
    private double price;


    public Entertainment(String name, String category, String description, String place, double price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.place = place;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}