package at.spengergasse;

public class Pirat {
    
    private String name;
    private int gesundheit;  // 0 - 100 
    private boolean holzbein;

    public Pirat() {
        this.setName(name);
        this.setGesundheit(gesundheit);
        this.setHolzbein(holzbein);
    }

//Setter
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Arrgh! Keinen Namen fuer den alten Seebaeren uebergeben!");
        }
        else {
            this.name = name;
        }
    }
    public void setGesundheit(int gesundheit) {
        if (gesundheit < 0 || gesundheit > 100) {
            this.gesundheit = gesundheit;
        }
        else {
            throw new IllegalArgumentException("Yo-ho-ho - Gültiger Bereich für die Gesundheit: 0 bis 100 Prozent");
        }
    }
    public void setHolzbein(boolean holzbein) {
        this.holzbein = holzbein;
    }

//Getter
    public String getName() {
        return name;
    }
    public int getGesundheit() {
        return gesundheit;
    }
    public boolean getHolzbein() {
        return holzbein;
    }

    public void kielholen() {
        if (holzbein) {
            this.gesundheit = gesundheit - 95;
        }
        else {
            this.gesundheit = gesundheit - 90;
        }
        // Gesundheit darf nicht unter 0 kommen
        // Pruefung hat er holzbein, dann 95 sonst 90

        // Einfache Variante mit Zwischenergebnis
        int aktuelleGesundheit = gesundheit - 90;

        // Pruefen ob aktuelleGesundheit <= 0 -> dann gesundheit 0 und Meldung
        int gesundheit = 0;

        // ...

    }
}