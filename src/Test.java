import applications.Lock_ATM;
import applications.MyObject;
import applications.SynchronizedEG;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		RunnableThread rt = new RunnableThread();
//		Thread t = new Thread(rt);
//		t.start();
//		while(rt.count!=5){
//			try {
//				Thread.sleep(250);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
//		MyObject obj = new MyObject();
//		
//		SynchronizedEG t1 = new SynchronizedEG(obj,"aaa");
//		SynchronizedEG t2 = new SynchronizedEG(obj,"bbb");
//		t1.start();
//		t2.start();
		
		
		Lock_ATM latm = new Lock_ATM();
		SynchronizedEG t3 = new SynchronizedEG(latm,30);
		SynchronizedEG t4 = new SynchronizedEG(latm,60);
		t3.start();
		t4.start();
	}

}
