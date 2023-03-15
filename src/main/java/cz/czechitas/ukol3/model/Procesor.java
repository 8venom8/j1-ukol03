package cz.czechitas.ukol3.model;

public class Procesor {
    private String vyrobce;
    private long rychlost;

    @Override
    public String toString() {
        return "Procesor: " + "vyrobce: " + vyrobce  + ", rychlost: " + rychlost;
    }
}
