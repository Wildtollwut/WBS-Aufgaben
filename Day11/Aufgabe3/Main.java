package Day11.Aufgabe3;

public class Main {
    public static void main(String[] args) {
        Fahrzeug motorrad = new Fahrzeug("gg-gg 140", "rot", "bmw", FahrzeugTyp.MOTOTRAD);
        Fahrzeug pkw = new Fahrzeug("gg-tf 34", "blau", "opel", FahrzeugTyp.PKW);
        Fahrzeug lkw = new Fahrzeug("gg-vb 873", "schwarz", "MAN", FahrzeugTyp.LKW);

        Fahrzeug.gibListeAus();

        motorrad.setLackierung("Grün");

        Fahrzeug.gibListeAus();
    }
}
