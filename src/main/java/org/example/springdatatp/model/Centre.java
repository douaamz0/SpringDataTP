package org.example.springdatatp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Centre {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   Long id;
   String nom_centre;
   String adresse;
   @OneToMany(mappedBy = "centre", fetch = FetchType.EAGER)
   List<Etudiant> etudiants=new ArrayList<>();


}
