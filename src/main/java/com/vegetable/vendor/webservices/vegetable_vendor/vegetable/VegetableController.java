package com.vegetable.vendor.webservices.vegetable_vendor.vegetable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VegetableController
{
    @GetMapping(path = "/vegetable-list")
    public String vegetablesList()
    {
        return "Potato";
    }

    @GetMapping(path = "/vegetable-bean")
    public Vegetable vegetablesBean()
    {
        return new Vegetable("Potato");
    }

}
