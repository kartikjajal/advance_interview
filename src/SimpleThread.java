public class SimpleThread implements Runnable {
	Thread simpleThread;

	public static void main(String args[]) {

		System.out.println("SimpleThread.main()");
		Thread thread = new Thread(new SimpleThread());
		thread.start();
	}

	@Override
	public void run() {
		int counter = 1;
		System.out.println("in run");

		while (counter <= 100) {
			// System.out.println("hii");
			System.out.println(counter);
			counter++;
		}

	}

}
