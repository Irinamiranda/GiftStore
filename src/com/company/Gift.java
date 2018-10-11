package com.company;

public class Gift {

    private String nameGift;
    private String gender;
    private int price;

    public String getNameGift() {
        return nameGift;
    }

    public void setNameGift(String nameGift) {
        this.nameGift = nameGift;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Gift() {

    }

    public Gift(String nameGift, String gender, int price) {
        this.nameGift = nameGift;
        this.gender = gender;
        this.price = price;


    }

}
