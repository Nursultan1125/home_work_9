package com.example.myapplication;

public class Account {
    private int imageId;
    private String name;
    private String calledDate;

    public Account(String name, int imageId, String calledDate){
        this.imageId = imageId;
        this.name = name;
        this.calledDate = calledDate;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCalledDate() {
        return calledDate;
    }

    public void setCalledDate(String calledDate) {
        this.calledDate = calledDate;
    }
}
