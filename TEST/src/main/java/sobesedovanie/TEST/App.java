package sobesedovanie.TEST;

import java.awt.AWTException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App {

	static MyThreadClass myThread = new MyThreadClass();
	static MyRunnableClass myRunnable = new MyRunnableClass();

	static MyCallableClass myCallable = new MyCallableClass();

	public static void main(String[] args) throws AWTException, InterruptedException, ExecutionException {

		myThread.start();
		new Thread(myRunnable).start();

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future fut = executorService.submit(myCallable);

		ScheduledExecutorService executorService2 = Executors.newSingleThreadScheduledExecutor();
		executorService2.scheduleAtFixedRate(myThread, 1000, 1000, TimeUnit.MILLISECONDS);

		System.out.println(fut.get());
	}

}
