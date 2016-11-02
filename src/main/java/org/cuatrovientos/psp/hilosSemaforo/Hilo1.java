package org.cuatrovientos.psp.hilosSemaforo;

import java.util.concurrent.Semaphore;

public class Hilo1 extends Thread{
	protected Semaphore semaforo;

	/**
	 * @param semaforo
	 */
	public Hilo1(Semaphore semaforo) {
		this.semaforo = semaforo;
	}

	@Override
	public void run(){
		
		try {
			System.out.println("Thread 1 using process...");
			Thread.sleep(2000);
			System.out.println("Thread 1 done");
			semaforo.release(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
