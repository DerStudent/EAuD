package de.fh.eaud.stopwatch;

public class StopWatch {

	private long startTime;
	private long stopTime;
	private boolean running;

	public StopWatch() {
		startTime = 0;
		stopTime = 0;
		running = false;
	}

	public void start() {
		startTime = System.nanoTime();
		running = true;
	}

	public void stop() {
		stopTime = System.nanoTime();
		running = false;
	}

	
	public long getTimeNano() {
		long time;
		if (running) {
			time = (System.nanoTime() - startTime);
		} else {
			time = (stopTime - startTime);
		}
		return time;
	}

	
	public long getTimeMiliSecs() {
		long time;
		if (running) {
			time = ((System.nanoTime() - startTime) / 1000000);
		} else {
			time = ((stopTime - startTime) / 1000000);
		}
		return time;
	}
	
	public long getTimeSec() {
		long time;
		if (running) {
			time = ((System.nanoTime() - startTime) / 1000000000);
		} else {
			time = ((stopTime - startTime) / 1000000000);
		}
		return time;
	}
	
	public void reset() {
		startTime = 0;
		stopTime = 0;
	}
	
}
