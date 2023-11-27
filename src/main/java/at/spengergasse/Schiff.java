package at.spengergasse;

public class Schiff{

    private int kanonen;
    private char typ;
    private Pirat kapitaen;
    private Pirat [] piraten;

    
    public Schiff(char typ) {
        setTyp(typ);
        Pirat [] pirat = new Pirat[5];
    }

    public char getTyp() {
        return this.typ;
    }

    public void setTyp(char typ) {
        this.typ = typ;
    }

    private void kanonenKlarmachen(int kanonen) {}

    public int getKanonen() {return this.kanonen;}

    public void anheuern(Pirat pirat) {
        if (kapitaen == null) {
            this.kapitaen = pirat;
            return;
        }
        for (int i = 0; i< piraten.length; i++) {
            if (piraten[i] == null) {
                piraten[i] = pirat;
                return;
            }
        }
        throw new IllegalArgumentException("Kein Grog mehr für...");
    }
    
    public void print() {
        System.out.println(this);
    }

    public String toString() {
        String rw = "";
        switch (this.getTyp()) {
            case 's' -> rw = "Crew Schaluppe (3):" + "\n" + "_________________" + "\n";
            case 'b' -> rw = "Crew Brigg (4):" + "\n" + "_________________" + "\n";
            case 'f' -> rw = "Crew Fregatte (5):" + "\n" + "_________________" + "\n";
            case 'g' -> rw = "Crew Galeone (6):" + "\n" + "_________________" + "\n";
            default -> throw new IllegalArgumentException("Ungueltig!");
        }

    }


}