package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {


    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");


        Pocitac pocitacAcer = new Pocitac();


        Disk acerDisk = new Disk();
        acerDisk.setKapacita(475_000_000L);//bajt
        acerDisk.setVyuziteMisto(107_000_000L);//bajt

        Pamet acerPamet = new Pamet();
        acerPamet.setKapacita(8_000_000L);//bajt

        Procesor acerProcesor = new Procesor();
        acerProcesor.setRychlost(24_000_000_000L);//Hz
        acerProcesor.setVyrobce("Intel(R) Core(TM)");

        pocitacAcer.setCpu(acerProcesor);
        pocitacAcer.setRam(acerPamet);
        pocitacAcer.setPevnyDisk(acerDisk);

        System.out.println(pocitacAcer);





    }



}
