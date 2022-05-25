package com.example.ta_pam;

public class ItemModel {

    String name, year;
    int cover;

    public ItemModel(String name, String year, int cover) {
        this.name = name;
        this.year = year;
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }
}
