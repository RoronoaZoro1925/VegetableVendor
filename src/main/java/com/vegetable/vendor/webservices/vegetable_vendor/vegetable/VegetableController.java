package com.vegetable.vendor.webservices.vegetable_vendor.vegetable;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VegetableController
{
    private VegetableDAOService service;

    private VegetableRepository repository;

    public VegetableController(VegetableDAOService service, VegetableRepository repository)
    {
        this.service= service;
        this.repository = repository;
    }

    @GetMapping("/vegetable-list")
    public List<Vegetable> retrieveAllVegetables()
    {
        return repository.findAll();
    }

    @GetMapping("/vegetable-list/{item}")
    public Optional<Vegetable> retrieveVegetable(@PathVariable String item)
    {
        return repository.findById(item);
    }


    @PostMapping("/new-vegetable")
    public void createVegetable(@RequestBody Vegetable vegetable)
    {
        repository.save(vegetable);

    }

    @DeleteMapping ("/vegetable-list/{item}")
    public void deleteVegetable(@PathVariable String item)
    {
        repository.deleteById(item);
    }

}
