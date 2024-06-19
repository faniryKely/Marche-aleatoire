package org.app.marchealeatoire;

import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class Marcheur {
    private String positionActuelle;

    public void marcheAleatoirement(String lieuxDeDepart, String destination){
        Environnement environnement = new Environnement();
        for( Rues rues : environnement.getListDesRues()) {
            if(!rues.equals(lieuxDeDepart)) {
                System.out.println("Rue indisponible");
            }
            positionActuelle = lieuxDeDepart;
            Random random = new Random();

            while (!positionActuelle.equals(destination)) {
                List<Rues> ruesVoisines = environnement.getListDesRues()
                        .stream().filter(e -> e.getNomDeRue().equals(positionActuelle))
                        .collect(Collectors.toList());

                if (ruesVoisines.isEmpty()) {
                    System.out.println("Aucune rue voisine trouvée depuis la position actuelle.");
                    return;
                }


                Rues rueSuivante = ruesVoisines.get(random.nextInt(ruesVoisines.size()));
                positionActuelle = rueSuivante.getNomDeRue();


                if (positionActuelle.equals(destination)) {
                    System.out.println(destination);

                }
            }
        }
   }
}

