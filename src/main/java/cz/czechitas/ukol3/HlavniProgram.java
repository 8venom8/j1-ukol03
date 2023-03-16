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


 //ZKOUSKA FUNKCNOSTI

//TEST-1.)
        pocitacAcer.zapniSe();
        pocitacAcer.vypniSe();//>>>Pocítac se vypíná

//TEST-2.)
        pocitacAcer.vymazSouboryOVelikosti(845_000_000); //>>>CHYBA nelze mazat pokud je pc vypnutý

//TEST-3.)
        pocitacAcer.zapniSe();
        pocitacAcer.vymazSouboryOVelikosti(845_000_000); //>>>CHYBA nelze jít do mínusu s mazáním souboru

//TEST-4.)
        pocitacAcer.zapniSe();
        pocitacAcer.vytvorSouborOVelikosti(45_000_000); //>>>soubor se ukláda

//TEST-5.)
        pocitacAcer.vytvorSouborOVelikosti(1000); //>>>CHYBA pocitac neni zapnutý, nezlze vytvářet soubory

//TEST-6.)
        pocitacAcer.zapniSe();
        pocitacAcer.vymazSouboryOVelikosti(45_000); //>>>Soubor byl smazán


        System.out.println(pocitacAcer);





    }



}
