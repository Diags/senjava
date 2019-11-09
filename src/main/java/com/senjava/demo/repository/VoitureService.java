package com.senjava.demo.repository;

import com.senjava.demo.model.Voiture;

import java.util.List;

public interface VoitureService {
    List<Voiture> getAllVoitures() throws InterruptedException;
}
