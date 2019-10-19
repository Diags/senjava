package com.senjava.demo;

import com.senjava.demo.model.Voiture;
import com.senjava.demo.repository.VoitureRepository;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private VoitureRepository voitureRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.asList(new Voiture(null, RandomString.make(3), RandomString.make(4)),
                new Voiture(null, RandomString.make(3), RandomString.make(4)),
                new Voiture(null, RandomString.make(3), RandomString.make(4)),
                new Voiture(null, RandomString.make(3), RandomString.make(4))).stream()
                .forEach(v -> voitureRepository.save(v));
    }
}
