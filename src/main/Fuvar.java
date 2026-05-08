

package main;


public class Fuvar {
    private String rendszam;
    private int ido;
    private double osszeg;
    private String fizetesiMod;

    public Fuvar(String rendszam, int ido, double osszeg, String fizetesiMod) {
        this.rendszam = rendszam;
        this.ido = ido;
        this.osszeg = osszeg;
        this.fizetesiMod = fizetesiMod;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getIdo() {
        return ido;
    }

    public double getOsszeg() {
        return osszeg;
    }

    public String getFizetesiMod() {
        return fizetesiMod;
    }

    @Override
    public String toString() {
        return rendszam + " | " + ido + " perc | "
                + osszeg + " EUR | " + fizetesiMod;
    }
}
