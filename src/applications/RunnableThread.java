package applications;

public class RunnableThread implements Runnable {

	public int count = 0;

	@Override
	public void run() {
		System.out.println("start");

		try {
			while (count < 5) {
				Thread.sleep(500);
				count++;
			}
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		System.out.println("terminate");
	}
}
