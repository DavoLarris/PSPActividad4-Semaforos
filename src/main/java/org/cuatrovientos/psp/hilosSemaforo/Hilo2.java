package org.cuatrovientos.psp.hilosSemaforo;

import java.util.concurrent.Semaphore;

public class Hilo2 extends Thread{
	protected Semaphore semaforo1;

	/**
	 * @param semaforo
	 */
	public Hilo2(Semaphore semaforo1) {
		this.semaforo1 = semaforo1;
	}
	
	
	@Override
	public void run(){
		try {
			semaforo1.acquire(2);
			System.out.println("Thread 2 using process...");
			Thread.sleep(500);
			System.out.println("Thread 2 done");
			semaforo1.release(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
