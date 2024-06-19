package org.app.marchealeatoire;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lieux {
  private String nom;

  public Lieux (String nom) {
      this.nom = nom;
  }

  public String getNom() {
        return nom;
  }


}