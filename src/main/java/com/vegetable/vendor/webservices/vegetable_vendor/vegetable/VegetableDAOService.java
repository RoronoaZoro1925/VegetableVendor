package com.vegetable.vendor.webservices.vegetable_vendor.vegetable;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class VegetableDAOService
{
    private static List<Vegetable> vegetables =  new ArrayList<>();

    static {
        vegetables.add(new Vegetable(20.00,2.00,"Potato"));
        vegetables.add(new Vegetable(10.15,3.50,"Onion"));
        vegetables.add(new Vegetable(15.80,5.25,"Tomato"));
    }

    public List<Vegetable> findAll()
    {
        return vegetables;
    }

    public Vegetable findOne(String item)
    {
        Predicate<? super Vegetable> predicate = vegetable -> vegetable.getItem().equals(item);
        return vegetables.stream().filter(predicate).findFirst().get();
    }

    public Vegetable save(Vegetable vegetable)
    {
        vegetables.add(vegetable);
        return vegetable;
    }
}
