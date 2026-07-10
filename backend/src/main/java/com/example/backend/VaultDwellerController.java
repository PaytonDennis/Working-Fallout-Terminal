package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/dwellers")
public class VaultDwellerController {

    @Autowired
    private VaultDwellerService service;

    @GetMapping
    public List<VaultDweller> getAll() {
        return service.findAll();
    }

    @PostMapping
    public VaultDweller create(@RequestBody VaultDweller dweller) {
        return service.save(dweller);
    }

    @PutMapping("/{id}")
    public VaultDweller update(@PathVariable Long id, @RequestBody VaultDweller dweller) {
        dweller.setId(id);
        return service.save(dweller);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
