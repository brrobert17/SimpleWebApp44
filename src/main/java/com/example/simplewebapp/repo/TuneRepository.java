package com.example.simplewebapp.repo;

import com.example.simplewebapp.model.Tune;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TuneRepository extends JpaRepository  <Tune, Integer>{

    Optional<Tune> findByName(String name);

}
