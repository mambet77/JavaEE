package sobesedovanie.TEST;

public class MyRunnableClass implements Runnable {

	@Override
	public void run() {
		System.out.println(this.getClass());
	}

}
