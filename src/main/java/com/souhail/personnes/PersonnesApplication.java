package com.souhail.personnes;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.souhail.personnes.entities.Personne;
import com.souhail.personnes.services.PersonneService;

@SpringBootApplication
public class PersonnesApplication implements CommandLineRunner {
@Autowired
PersonneService personneService;
public static void main(String[] args) {
SpringApplication.run(PersonnesApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
personneService.savePersonne(new Personne("salim",124.55,new Date()));
personneService.savePersonne(new Personne("mohamed",184.55,new Date()));
personneService.savePersonne(new Personne("salem",174.55,new Date()));
}
}
