package org.polytech.covidapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.polytech.covidapi.model.Center;

@Repository
public interface CenterRepoitory extends JpaRepository<Center, Integer>{
    
}