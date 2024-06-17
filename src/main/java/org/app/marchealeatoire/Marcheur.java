package org.app.marchealeatoire;

import lombok.Data;

import java.util.*;

@Data
public class Marcheur {
    private Lieux positionActuelle ;
    private Set<Lieux> marche;

    public Marcheur(Lieux positionInitiale) {
        this.positionActuelle = positionInitiale;
        this.marche = new HashSet<>();
        this.marche.add(positionInitiale);
    }

    public void marcheAleatoirement(Lieux destination) {
        Random random = new Random();

        while (!positionActuelle.equals(destination)) {
            Map<String, Lieux> ruesDisponibles = positionActuelle.getRues();
            if (ruesDisponibles.isEmpty()) {
                System.out.println("Route indisponible depuis " + positionActuelle.getNom());
                return;
            }

            List<Lieux> destinationsDisponibles = new ArrayList<>(ruesDisponibles.values());
            positionActuelle = destinationsDisponibles.get(random.nextInt(destinationsDisponibles.size()));
            marche.add(positionActuelle);
        }

        System.out.println("Marche complétée : " + marche);
    }


    public boolean aAtteintLieu(String nomLieu) {
        return positionActuelle.getNom().equals(nomLieu);
    }

    public Set<Lieux> getMarche() {
        return marche;
    }
}
