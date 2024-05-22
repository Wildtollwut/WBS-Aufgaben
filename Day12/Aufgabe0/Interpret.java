package Day12.Aufgabe0;

import java.util.ArrayList;
import java.util.List;

public class Interpret {

    private String name;
    private final List<Song> songListe = new ArrayList<Song>();

    public Interpret(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongListe() {
        return songListe;
    }
}
