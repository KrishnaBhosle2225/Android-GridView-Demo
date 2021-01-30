package com.krishna.gridviewactivity;

import android.graphics.ColorSpace;

public class Modeldesign  {
    int image;
    String Name;
    String height;
    String price;
    String off;
    String buyat;

    public Modeldesign() {
        this.image = image;
        this.Name = Name;
        this.height = height;
        this.price = price;
        this.off = off;
        this.buyat = buyat;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBuyat() {
        return buyat;
    }

    public void setBuyat(String buyat) {
        this.buyat = buyat;
    }

    public String getOff() {
        return off;
    }

    public void setOff(String off) {
        this.off = off;
    }

    public String getHeight() {
        return height;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}