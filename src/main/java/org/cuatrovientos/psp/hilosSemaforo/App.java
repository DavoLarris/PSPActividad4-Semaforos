package org.cuatrovientos.psp.hilosSemaforo;

import java.util.concurrent.Semaphore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Semaphore finHiloPrioritario1 = new Semaphore(0);
        
        Hilo1 hilo1 = new Hilo1(finHiloPrioritario1);
        Hilo2 hilo2 = new Hilo2(finHiloPrioritario1);
        Hilo3 hilo3 = new Hilo3(finHiloPrioritario1);
        Hilo4 hilo4 = new Hilo4(finHiloPrioritario1);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}
