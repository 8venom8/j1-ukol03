package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty; //pouze field bez getteru a setteru
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

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
        return "Počítač Acer AspireA715-75G....." + cpu + ram  + pevnyDisk;
    }



    public boolean jeZapnuty() {
            return jeZapnuty;
    }

    public void zapniSe() {
            if (jeZapnuty) {
                System.out.println("CHYBA: Počítač je zapnutý, nelze zapnout dvakrát");
            } else {
                if (this.ram == null || this.cpu == null || this.pevnyDisk == null ) {
                    System.out.println("CHYBA: Počítač se nezapne dokud nezadáte ram, cpu, pevnyDisk");
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
          }
      }



            //METODY 2.ČÁST

            //VYTVOŘ SOUBOR
    public void vytvorSouborOVelikosti(long velikost) {
        if (!jeZapnuty) {
            System.out.println("CHYBA: Nelze vytvářet soubory pokud je PC vypnutý");
            return;
        }

        if (pevnyDisk.getVyuziteMisto() + velikost > pevnyDisk.getKapacita()) {
            System.out.println("CHYBA: Kapacita je plná, soubor se nemůže uložit");
        } else {
            System.out.println("Soubor se ukládá");
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
        }
    }

        //SMAŽ SOUBOR

    public void vymazSouboryOVelikosti(long velikost) {
        if (!jeZapnuty) {
            System.out.println("CHYBA: Nelze mazat soubory pokud je PC vypnutý");
            return;
        }

        if (pevnyDisk.getVyuziteMisto() - velikost >= 0) {
            System.out.println("Soubor byl smazán");
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
        } else {
            System.out.println("CHYBA: Soubor nelze smazat");
        }

    }



}





