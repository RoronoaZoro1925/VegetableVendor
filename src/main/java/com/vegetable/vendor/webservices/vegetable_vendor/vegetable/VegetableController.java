package com.vegetable.vendor.webservices.vegetable_vendor.vegetable;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VegetableController
{
    private VegetableDAOService service;

    public VegetableController(VegetableDAOService service)
    {
        this.service= service;
    }

    @GetMapping("/vegetable-list")
    public List<Vegetable> retrieveAllVegetables()
    {
        return service.findAll();
    }

    @GetMapping("/vegetable-list/{item}")
    public Vegetable retrieveVegetable(@PathVariable String item)
    {
        return service.findOne(item);
    }

    @PostMapping("/vegetables")
    public void createVegetable(@RequestBody Vegetable vegetable)
    {
        service.save(vegetable);
    }

}
