package de.fh.eaud.vl1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VL1 {

	public VL1() {

	}

	public void durchlaufen(int max) {
		for (int i = 1; i <= max; i++) {
			System.out.println(i);
		}
	}

	public void doppelTupel(int max) {
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= max; j++) {
				System.out.println("(" + i + "," + j + ")");
			}
		}
	}

	public void teilmengen(int max) {
		Set<Integer> mySet = new HashSet<Integer>();

		for (int i = 1; i <= max; i++) {
			mySet.add(i);
		}
		for (Set<Integer> s : powerSet(mySet)) {
			System.out.println(s);
		}
	}

	public static <T> Set<Set<T>> powerSet(Set<T> originalSet) {
		Set<Set<T>> sets = new HashSet<Set<T>>();
		if (originalSet.isEmpty()) {
			sets.add(new HashSet<T>());
			return sets;
		}
		List<T> list = new ArrayList<T>(originalSet);
		T head = list.get(0);
		Set<T> rest = new HashSet<T>(list.subList(1, list.size()));
		for (Set<T> set : powerSet(rest)) {
			Set<T> newSet = new HashSet<T>();
			newSet.add(head);
			newSet.addAll(set);
			sets.add(newSet);
			sets.add(set);
		}
		return sets;
	}

}
