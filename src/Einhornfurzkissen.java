package src;

public class Einhornfurzkissen {

    private String groesse;
    private String farbe;
    private double preis = 19.99;

    public Einhornfurzkissen(String pGroesse, String pFarbe){
        this.groesse = pGroesse;
        this.farbe = pFarbe;
    }

    private String getGroesse(){
        return this.groesse;
    }

    private String getFarbe(){
        return this.farbe;
    }

    private double getPreis(){
        return this.preis;
    }
}