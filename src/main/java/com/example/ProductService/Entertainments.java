package com.example.ProductService;


import java.util.List;

public class Entertainments {
    private List<Entertainment> entertainments;

    public Entertainments() {}

    public Entertainments(List<Entertainment> entertainments) {
        this.entertainments = entertainments;
    }

    public List<Entertainment> getEntertainments() {
        return entertainments;
    }

    public void setEntertainments(List<Entertainment> entertainments) {
        this.entertainments = entertainments;
    }
}
