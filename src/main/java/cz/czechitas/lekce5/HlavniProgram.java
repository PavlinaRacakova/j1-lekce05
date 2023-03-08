package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        //TODO tady bude náš kód

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Osoba testovaciOsoba = new Osoba();
        testovaciOsoba.setJmeno("Franta");
        testovaciOsoba.setPrijmeni("Vopršálek");
        testovaciOsoba.setPracovniMail("hodnePrace@gmail.com");
        testovaciOsoba.setSoukromyMail("zadnaPrace@gmail.com");

        Adresa novaAdresa = new Adresa();
        novaAdresa.setObec("Dolní Horní");
        novaAdresa.setUlice("Dlouhá");
        novaAdresa.setPsc("12345");
        testovaciOsoba.setAdresa(novaAdresa);


    }

}
