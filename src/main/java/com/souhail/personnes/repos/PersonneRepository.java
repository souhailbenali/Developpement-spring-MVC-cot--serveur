package com.souhail.personnes.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.souhail.personnes.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
