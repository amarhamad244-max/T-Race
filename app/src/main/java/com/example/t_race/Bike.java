package com.example.t_race;

import com.google.firebase.Firebase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.io.Serializable;

public class Bike implements Serializable {
    private String id;
    private String name ;
    private String type;
    private String description;
    private String location ;
    private String logoUrl;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
// Empty constructor: Firestore  needs this to rebuild the object






}

