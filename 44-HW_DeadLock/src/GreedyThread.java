
public class GreedyThread extends Thread {
	private SharedResource left;
	private SharedResource right;
	private boolean side;

	public GreedyThread(SharedResource left, SharedResource right, boolean side) {
		this.left = left;
		this.right = right;
		this.side = side;
	}

	@Override
	public void run() {
		if (side) {
			System.out.printf("%s is loading from left to right...\n", Thread.currentThread().getName());
			left.calculateAtTheLeft(right);
		} else {
			System.out.printf("%s is loading from right to left...\n", Thread.currentThread().getName());
			right.calculateAtTheRight(left);
		}
	}
}
