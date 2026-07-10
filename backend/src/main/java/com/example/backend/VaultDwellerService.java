package com.example.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaultDwellerService {

    @Autowired
    private VaultDwellerRepository repository;

    public List<VaultDweller> findAll() {
        return repository.findAll();
    }

    public VaultDweller findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("VaultDweller not found"));
    }

    public VaultDweller save(VaultDweller dweller) {
        return repository.save(dweller);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
