package cz.czechitas.lekce5.model;

public class Adresa {

    private String ulice;
    private String castObce;
    private String obec;
    private String psc;


    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        if (ulice.length() > 1) {
            this.ulice = ulice;
        } else {
            System.out.println("Zadej ulici.");
        }
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        if (obec.length() > 1) {
            this.obec = obec;
        } else {
            System.out.println("Zadej obec.");
        }

    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        if (psc.length() == 5) {
            this.psc = psc;
        } else {
            System.out.println("PSČ musí mít 5 znaků.");
        }
    }

    @Override
    public String toString() {
        if (castObce.length() != 0) {
            return ulice + " " + castObce + " " + psc + " " + obec;
        }
        return ulice + " " + psc + " " + obec;
    }
}
