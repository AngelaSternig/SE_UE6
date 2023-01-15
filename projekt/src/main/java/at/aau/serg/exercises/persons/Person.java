//12003325 Angela Sternig

package at.aau.serg.exercises.persons;

public class Person {
    private String vorname;
    private String nachname;
    private Integer alter;
    private String beruf;
    private String bevorzugteProgrammierSprache;
    private String ide;
    private boolean datenbanken;
    private String feld;
    private String bevorzugtesTestFramework;

    public Person(String vorname, String nachname, String beruf, String feld, Integer alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.beruf = beruf;
        this.feld = feld;
        if(!(feld.equals("ENTERPRISE") || feld.equals("APPLIKATION"))){
            throw new IllegalArgumentException();
        }
    }

    public Person(String vorname, String nachname, Integer alter, String beruf, String bevorzugteProgrammierSprache,
                  boolean datenbanken, String ide){
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.beruf = beruf;
        this.bevorzugteProgrammierSprache = bevorzugteProgrammierSprache;
        this.datenbanken = datenbanken;
        this.ide = ide;
        if(!((ide.equals("ECLIPSE")) || (ide.equals("INTELLIJ")) || (ide.equals("NANO")))){
            throw new IllegalArgumentException();
        }
    }

    public Person(String vorname, String nachname, Integer alter, String beruf, String bevorzugtesTestFramework){
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.beruf = beruf;
        this.bevorzugtesTestFramework = bevorzugtesTestFramework;
    }

    public String getJobBeschreibung() {
        switch(beruf) {
            case "Entwickler": return "Entwickelt Code.";
            case "Architekt": return "Designed die Architektur des Projekts.";
            case "Tester": return "Testet Code.";
            default: return "";
        }
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setAlter(Integer alter) {
        this.alter = alter;
    }
    public void setBeruf(String beruf) {
        this.beruf = beruf;
        if(!(beruf == "Entwickler" || beruf.equals("Architekt") || beruf.equals("Tester"))){
            throw new IllegalArgumentException();
        }
    }
    public void setBevorzugteProgrammierSprache(String bevorzugteProgrammierSprache) {
        this.bevorzugteProgrammierSprache = bevorzugteProgrammierSprache;
    }
    public void setIde(String ide) {
        this.ide = ide;
    }
    public void setDatenbanken(boolean datenbanken) {
        this.datenbanken = datenbanken;
    }
    public void setFeld(String feld) {
        this.feld = feld;
    }
    public void setBevorzugtesTestFramework(String bevorzugtesTestFramework) {
        this.bevorzugtesTestFramework = bevorzugtesTestFramework;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Integer getAlter() {
        return alter;
    }

    public String getBeruf() {
        return beruf;
    }

    public String getBevorzugteProgrammierSprache() {
        return bevorzugteProgrammierSprache;
    }

    public String getIde() {
        return ide;
    }

    public boolean isDatenbanken() {
        return datenbanken;
    }

    public String getFeld() {
        return feld;
    }

    public String getBevorzugtesTestFramework() {
        return bevorzugtesTestFramework;
    }
}
