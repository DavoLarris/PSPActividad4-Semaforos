package org.cuatrovientos.psp.hilosSemaforo;

import java.util.concurrent.Semaphore;

public class Hilo3 extends Thread{
	protected Semaphore semaforo;

	/**
	 * @param semaforo
	 */
	public Hilo3(Semaphore semaforo) {
		this.semaforo = semaforo;
	}
	
	@Override
	public void run(){
		try {
			System.out.println("Thread 3 using process...");
			Thread.sleep(1000);
			System.out.println("Thread 3 done");
			semaforo.release(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
