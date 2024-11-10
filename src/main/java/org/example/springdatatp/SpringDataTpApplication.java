package org.example.springdatatp;

import org.example.springdatatp.enums.Genre;
import org.example.springdatatp.model.Centre;
import org.example.springdatatp.model.Etudiant;
import org.example.springdatatp.repository.CentreRepository;
import org.example.springdatatp.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class SpringDataTpApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(SpringDataTpApplication.class, args);
    }

    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    CentreRepository centreRepository;

    @Override
    public void run(String... args) throws Exception {
        Etudiant et1 = Etudiant.builder().nom("Adnani").prenom("Morad").genre(Genre.Homme).build();
        Etudiant et2 = Etudiant.builder().nom("Ziyani").prenom("Laila").genre(Genre.Femme).build();
        Etudiant et3 = Etudiant.builder().nom("Hamdaoui").prenom("Amina").genre(Genre.Femme).build();
        Etudiant et4 = Etudiant.builder().nom("Ziraoui").prenom("Ahmed").genre(Genre.Homme).build();

        etudiantRepository.save(et1);
        etudiantRepository.save(et2);
        etudiantRepository.save(et3);
        etudiantRepository.save(et4);

        Centre centre1 = Centre.builder().nom_centre("Moulay Abdellah").adresse("bd mohamed 6").build();
        Centre centre2 = Centre.builder().nom_centre("Hassan 2").adresse("bd mohamed 5").build();

        centreRepository.save(centre1);
        centreRepository.save(centre2);

        // Associer les étudiants aux centres
        et1.setCentre(centre1);
        et2.setCentre(centre1);
        et3.setCentre(centre2);
        et4.setCentre(centre2);

        etudiantRepository.save(et1);
        etudiantRepository.save(et2);
        etudiantRepository.save(et3);
        etudiantRepository.save(et4);
    }
    }
