package com.vegetable.vendor.webservices.vegetable_vendor.vegetable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VegetableController
{
    private VegetableDAOService service;

    public VegetableController(VegetableDAOService service)
    {
        this.service= service;
    }

    @GetMapping(path = "/vegetable-list")
    public List<Vegetable> retrieveAllVegetables()
    {
        return service.findAll();
    }

}
