package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {


    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac pocitacAcer = new Pocitac ();
        pocitacAcer.setCpu();
        pocitacAcer.setRam();
        pocitacAcer.setPevnyDisk();


    }



}
