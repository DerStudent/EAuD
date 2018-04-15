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
		startTime = System.currentTimeMillis();
		running = true;
	}

	public void stop() {
		stopTime = System.currentTimeMillis();
		running = false;
	}

	
	public long getTimeMili() {
		long time;
		if (running) {
			time = (System.currentTimeMillis() - startTime);
		} else {
			time = (stopTime - startTime);
		}
		return time;
	}

	
	public long getTimeSecs() {
		long time;
		if (running) {
			time = ((System.currentTimeMillis() - startTime) / 1000);
		} else {
			time = ((stopTime - startTime) / 1000);
		}
		return time;
	}
	
	
}
