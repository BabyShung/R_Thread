package applications;

public class SynchronizedEG extends Thread {

	private String n;
	private MyObject mo;

	private int value;
	private Lock_ATM latm;
	
	public SynchronizedEG(MyObject mo, String n) {
		this.n = n;
		this.mo = mo;
	}
	
	public SynchronizedEG(Lock_ATM latm,int value){
		this.latm = latm;
		this.value = value;
	}

	public void run() {
		//mo.foo(n);
		latm.deposit(value);
	}

}
