package Day11.Aufgabe5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int centBetrag = 520;
        ArrayList<Muenzen> wechselGeld = Muenzen.berechneWechselgeld(centBetrag);
        System.out.println("Ich habe : " + centBetrag + " Cent erhalten.");
        for(Muenzen wechsel : wechselGeld){
            System.out.println(wechsel + ": " + wechsel.getWert() + " Cent");
        }

    }
}
