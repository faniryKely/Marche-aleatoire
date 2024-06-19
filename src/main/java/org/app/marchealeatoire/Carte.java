package org.app.marchealeatoire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Stream;

@Data
@NoArgsConstructor
public class Carte {
    private Set<Lieux> listDesLieux = new HashSet<>();

    public void ajouterLieux(Lieux lieux) {
        listDesLieux.add(lieux);
    }

    public Lieux prendreLieuxParNom(String nom) {
        for( Lieux lieux : listDesLieux) {
            if( lieux.equals(nom)) {
                return lieux;
            }
        }
        return null;
    }

    public void creerRueConnectee( String nomDeRue, String nomDeLieuxInitial, String nomLieuxDestination) {
        Lieux positionInitial = prendreLieuxParNom(nomDeLieuxInitial);
        Lieux positionDestination = prendreLieuxParNom(nomLieuxDestination);
        Rues nouveauRue = new Rues(nomDeRue);
    }

}
