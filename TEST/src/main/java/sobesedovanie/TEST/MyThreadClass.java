package sobesedovanie.TEST;

public class MyThreadClass extends Thread {

	@Override
	public void run() {
		System.out.println(this.getName());
	}
}
