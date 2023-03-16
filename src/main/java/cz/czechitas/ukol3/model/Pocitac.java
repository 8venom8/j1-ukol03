package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty; //pouze field bez getteru a setteru
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    
    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return "Počítač= cpu: " + cpu + ", ram: " + ram + ", pevny disk: " + pevnyDisk;
    }



    public boolean jeZapnuty() {
            return jeZapnuty;
    }

    public void zapniSe() {
            if (jeZapnuty) {
                System.err.println("Počítač je zapnutý, nelze zapnout dvakrát");
            } else {
                if (this.ram == null || this.cpu == null || this.pevnyDisk == null ) {
                    System.err.println("Počítač se nezapne dokud nezadáte ram, cpu, pevnyDisk");
                } else {
                    System.out.println("Počítač se zapíná");
                    jeZapnuty = true;
                }
            }
    }

            public void vypniSe() {
                if (jeZapnuty) {
                    System.out.println("Počítač se vypíná");
                    jeZapnuty = false;
                } else {
                    System.err.println("Počítač je už vypnutý");
                }
            }

}





