package com.senjava.demo.controller;

import com.senjava.demo.model.Voiture;
import com.senjava.demo.repository.VoitureRepository;
import com.senjava.demo.repository.VoituresServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoitureController {
    @Autowired
    private VoituresServiceImpl voituresService;

    @GetMapping("/all")
    public List<Voiture> getVoitures() throws InterruptedException {
        return voituresService.getAllVoitures();
    }
}
