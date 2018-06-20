package sobesedovanie.TEST;

import java.util.concurrent.Callable;

public class MyCallableClass implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.getClass());
		return "class Callable";
	}

}
