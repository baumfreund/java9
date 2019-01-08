package eu.selfhost.baumfreund22.java9;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		generateCollections();

	}

	
	private static void generateCollections() {
//		Set => no duplicates
		Set<Integer> intSet = Set.of(1,2,3);
		intSet.forEach(e -> System.out.println("e: "+e));
		
//		Simple List
		List<Integer> intList = List.of(100,200,300);
		intList.forEach(e -> System.out.println("e: "+e));
		
//		Map
		Map<Integer, String> mapExample = Map.of(1, "Eins", 2, "Zwei");
		mapExample.forEach((e, f) ->  System.out.println("key: "+e+", value: "+f));
		
//		Vorteile: weniger Code, deutlich weniger Speicherbedarf als alte Version
//		152 Bytes vs. 20 Bytes (neu)
		Set<String> nameSet = new HashSet<String>();
		nameSet.add("Hugo");
		nameSet.add("Tom");
		
		
	}
	
	
}
