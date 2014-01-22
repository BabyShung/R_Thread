package applications;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock_ATM {

	private Lock lock;
	private int balance = 100;

	public Lock_ATM() {
		lock = new ReentrantLock();
	}

	public int withdraw(int v) {
		lock.lock();

		try {
			Thread.sleep(1000);
			balance -= v;
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock.unlock();
		return balance;

	}

	public int deposit(int v) {
		lock.lock();

		try {
			System.out.println("Depositing $" + v + " start");
			Thread.sleep(2000);
			balance += v;
			System.out.println("Depositing $" + v + " end");
			Thread.sleep(2000);
			

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock.unlock();
		return balance;

	}
}
