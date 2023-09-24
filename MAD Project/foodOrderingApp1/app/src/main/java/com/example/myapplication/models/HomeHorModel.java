package com.example.myapplication.models;

public class HomeHorModel {

    int image;
    String name;

    public HomeHorModel(int image,String name){
        this.name=name;
        this.image=image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
