package com.vegetable.vendor.webservices.vegetable_vendor.vegetable;

public class Vegetable
{
    private Double price;
    private Double quantity;
    private String item;

    public Vegetable(Double price, Double quantity, String item) {
        this.price = price;
        this.quantity = quantity;
        this.item = item;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

//    public Vegetable(String item)
//    {
//        this.item = item;
//    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", item='" + item + '\'' +
                '}';
    }
}
