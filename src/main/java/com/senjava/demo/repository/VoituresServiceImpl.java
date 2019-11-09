package com.senjava.demo.repository;

import com.senjava.demo.model.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@CacheConfig(cacheNames = "voitures")
public class VoituresServiceImpl implements VoitureService {
    @Autowired  private VoitureRepository voitureRepository;

    @Override
    @Cacheable("voitures")
    public List<Voiture> getAllVoitures() throws InterruptedException {
        Thread.sleep(5000);
       return  voitureRepository.findAll();
    }
}
