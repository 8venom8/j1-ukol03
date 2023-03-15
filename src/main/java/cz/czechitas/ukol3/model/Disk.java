package cz.czechitas.ukol3.model;

public class Disk {

    private long kapacita;
    private long vyuziteMisto;

    @Override
    public String toString() {
        return "Disk: " + "kapacita: " + kapacita + ", vyuziteMisto: " + vyuziteMisto;
    }
}
