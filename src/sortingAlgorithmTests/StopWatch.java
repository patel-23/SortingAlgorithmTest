package sortingAlgorithmTests;

public class StopWatch {

	private long startTime = 0;
	private long stopTime = 0;

	public void start() {
		this.startTime = System.nanoTime();
	}

	public void stop() {
		this.stopTime = System.nanoTime();
	}

	// elaspsed time in "Donald" time (nanosecond/1000)
	public long getElapsedTime() {
		long elapsed;
		elapsed = (stopTime - startTime) / 1000;
		return elapsed;

	}
}
