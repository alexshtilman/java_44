public class DeadlockApp {
	public static void main(String[] args) {
		SharedResource r1 = new SharedResource();
		SharedResource r2 = new SharedResource();
		GreedyThread t2 = new GreedyThread(r1, r2, false);	
		GreedyThread t1 = new GreedyThread(r1, r2, true);
		t1.start();
		t2.start();
	}
}
