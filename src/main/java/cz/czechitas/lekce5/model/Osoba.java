package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Osoba {
    private String jmeno;
    private String prijmeni;
    private String rodneCislo;

    private Telefon telefon;

    private String pracovniMail;
    private String soukromyMail;

    private Adresa adresa;

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public String getPracovniMail() {
        return pracovniMail;
    }

    public void setPracovniMail(String pracovniMail) {
        if (pracovniMail.contains("@") && pracovniMail.contains(".")) {
            this.pracovniMail = pracovniMail;
        } else {
            System.out.println("Zadej validní email.");
        }
    }

    public String getSoukromyMail() {
        return soukromyMail;
    }

    public void setSoukromyMail(String soukromyMail) {
        if (soukromyMail.contains("@") && soukromyMail.contains(".")) {
            this.soukromyMail = soukromyMail;
        } else {
            System.out.println("Zadej validní email.");
        }
    }

    public String getKontakty() {
        String kontakty = "";
        if (telefon != null) {
            kontakty += "Tel.: " + telefon + "\n";
        }
        if (pracovniMail != null) {
            kontakty += "Pracovní mail: " + pracovniMail + "\n";
        }
        if (soukromyMail != null) {
            kontakty += "Soukromý mail: " + soukromyMail + "\n";
        }
        return kontakty;
    }

    public void setJmeno(String jmeno) {
        Objects.requireNonNull(jmeno);
        if (jmeno.isBlank()) {
            System.err.println("Jméno nemůže být prázdné.");
            return;
        }
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        Objects.requireNonNull(prijmeni);
        if (prijmeni.isBlank()) {
            System.err.println("Příjmení nemůže být prázdné.");
            return;
        }
        this.prijmeni = prijmeni;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        Objects.requireNonNull(rodneCislo);
        if (rodneCislo.isBlank()) {
            System.err.println("Rodné číslo nemůže být prázdné.");
            return;
        }
        if (!rodneCislo.contains("/")) {
            System.err.println("Rodné číslo musí obsahovat lomítko.");
            return;
        }
        this.rodneCislo = rodneCislo;
    }

    public Telefon getTelefon() {
        return telefon;
    }

    public void setTelefon(Telefon telefon) {
        this.telefon = telefon;
    }

    public String toString() {
        return jmeno + " " + prijmeni + " (" + rodneCislo + ")";
    }
}

