package de.fh.eaud.vl1;

import de.fh.eaud.stopwatch.StopWatch;

public class Start {

	private static final int MAX = 10;

	public static void main(String[] args) {
		StopWatch st = new StopWatch();
		VL1 test = new VL1();
		
		st.start();
		
		//test.durchlaufen(MAX);
		//test.doppelTupel(MAX);
		test.teilmengen(MAX);
		
		st.stop();
		System.out.println("Die benötigte Zeit für " + MAX + " Elemente betrug: "+ st.getTimeNano() + " nano sec.");
		System.out.println("Die benötigte Zeit für " + MAX + " Elemente betrug: "+ st.getTimeMiliSecs() + " mili sec.");
		System.out.println("Die benötigte Zeit für " + MAX + " Elemente betrug: "+ st.getTimeSec() + " sec.");
		
	}
}
