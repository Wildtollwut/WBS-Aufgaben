package Day12.Aufgabe0;

public class Song {
    private String title;
    private Interpret interpret;

    public Song(String title, Interpret interpret) {
        this.title = title;
        this.interpret = interpret;

        interpret.getSongListe().add(this);
    }

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Interpret getInterpret() {
        return interpret;
    }
}
