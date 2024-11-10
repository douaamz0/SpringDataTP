package org.example.springdatatp.repository;

import org.example.springdatatp.model.Centre;
import org.example.springdatatp.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path="centres")
public interface CentreRepository extends JpaRepository<Centre,Long> {


}
