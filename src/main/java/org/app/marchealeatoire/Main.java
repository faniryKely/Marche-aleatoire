package org.app.marchealeatoire;

public class Main {
    public static void main(String[] args) {

        Carte carte = new Carte();

        carte.creerRueConnectee("Andriantsihoarana", "HEI", "PULLMAN");
        carte.creerRueConnectee("Andriantsihoarana", "PULLMAN", "HEI");
        carte.creerRueConnectee("anonyme", "PULLMAN", "BALANCOIRE");
        carte.creerRueConnectee("anonyme", "BALANCOIRE", "PULLMAN");
        carte.creerRueConnectee("anonyme", "PULLMAN", "NEXTA");
        carte.creerRueConnectee("anonyme", "NEXTA", "PULLMAN");
        carte.creerRueConnectee("anonyme", "BALANCORE", "ESTI");
        carte.creerRueConnectee("anonyme", "SEKOLINTSIKA", "HEI");
        carte.creerRueConnectee("anonyme", "HEI", "SEKOLINTSIKA");
        carte.creerRueConnectee("anonyme", "SEKOLINTSIKA", "MARAIS");
        carte.creerRueConnectee("anonyme", "MARAIS", "SEKOLINTSIKA");

        Marcheur marcheur = new Marcheur();
        marcheur.marcheAleatoirement("HEI", "ESTI");
    }
}

