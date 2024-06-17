package org.app.marchealeatoire;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lieux {
    private String nom;
    private Map<String, Lieux> rues;

    public Lieux(String nom) {
        this.nom = nom;
        this.rues = new HashMap<>();
    }

    public void ajouterRue(String nom, Lieux destination) {
        rues.put(nom, destination);
    }

    public Map<String, Lieux> getRues() {
        return rues;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}