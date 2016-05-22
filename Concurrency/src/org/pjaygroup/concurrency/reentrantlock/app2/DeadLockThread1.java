/**
 * 
 */
package org.pjaygroup.concurrency.reentrantlock.app2;

/**
 * @author Vijay
 *
 */
public class DeadLockThread1 implements Runnable{

	private Object obj1;
	private Object obj2;
	
	public DeadLockThread1(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {
		synchronized (obj1) {
			System.out.println("Thread :: " + Thread.currentThread().getName() + " acquired monitor for obj1");
			synchronized (obj2) {
				System.out.println("Thread :: " + Thread.currentThread().getName() + " acquired monitor for obj2");
			}
		}
	}
}