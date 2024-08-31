package com.vegetable.vendor.webservices.vegetable_vendor.vegetable;

public class Vegetable
{
    private String item;
    public Vegetable(String item)
    {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "item='" + item + '\'' +
                '}';
    }
}
