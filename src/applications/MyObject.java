package applications;

public class MyObject {

	public synchronized void foo(String n) {

		try {
			System.out.println("Thread " + n + " started");
			Thread.sleep(2000);
			System.out.println("Thread " + n + " terminated");
		} catch (InterruptedException e) {
			System.out.println("Thread " + n + " interrupted");
		}

	}
}
