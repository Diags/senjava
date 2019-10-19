package com.senjava.demo.controller;

import com.senjava.demo.model.Voiture;
import com.senjava.demo.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoitureController {
    @Autowired
    private VoitureRepository voitureRepository;

    @GetMapping("/all")
    public List<Voiture> getVoitures() {
        return voitureRepository.findAll();
    }
}
