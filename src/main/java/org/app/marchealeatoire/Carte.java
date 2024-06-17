package org.app.marchealeatoire;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Carte {

    private Map<String, Lieux> lieux;

    public Carte () {
        this.lieux = new HashMap<>();
    }

    public Lieux obtenirLieux (String nom) {
        return  lieux.get(nom);
    }


    public void ajouterLieu(String nom) {
        lieux.put(nom, lieux.get(nom));
    }

    public void ajouterRue(String nomRue, String nomLieuOrigine, String nomLieuDestination) {
        Lieux origine = lieux.get(nomLieuOrigine);
        Lieux destination = lieux.get(nomLieuDestination);
        if (origine != null && destination != null) {
            origine.ajouterRue(nomRue, destination);
        }
    }
}
