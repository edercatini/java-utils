package br.com.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
	public static void main(String[] args) {
		listSection();
		setSection();
		mapSection();
	}

	// List
	public static void listSection() {
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("List 1", "List 2", "List 3"));

		for (String listItem : list) {
			System.out.println(listItem);
		}
	}

	// Set
	public static void setSection() {
		Set<String> set = new HashSet<String>();
		set.addAll(Arrays.asList("Set 1", "Set 1", "Set 2", "Set 2", "Set 3", "Set 3"));

		for (String setItem : set) {
			System.out.println(setItem);
		}
	}

	// Map
	public static void mapSection() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Map 1");
		map.put(2, "Map 2");
		map.put(3, "Map 3");
		map.put(4, "Map 4");
		map.put(5, "Map 5");

		for (Map.Entry<Integer, String> mapItem : map.entrySet()) {
			System.out.println("[" + mapItem.getKey() + "] -- " + mapItem.getValue());
		}
	}
}