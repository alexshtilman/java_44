
public class SharedResource {
	static void takeANap() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// do nothing
		}
	}

	synchronized void calculateAtTheLeft(SharedResource s) {
		System.out.printf("%s calculating data at the left...\n", Thread.currentThread().getName());
		takeANap();
		s.calculateAtTheRight(s);
		System.out.println("done");
	}

	synchronized void calculateAtTheRight(SharedResource s) {
		System.out.printf("%s calculating data at the right...\n", Thread.currentThread().getName());
		takeANap();
		s.calculateAtTheLeft(s);
		System.out.println("done");
	}
}