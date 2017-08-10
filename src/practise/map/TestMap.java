package practise.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String, List<Integer>> map = new HashMap<>();
		map.computeIfAbsent("Johir", k-> new ArrayList<>()).add(5);
		map.computeIfAbsent("Test", k-> new ArrayList<>()).add(250);
		map.computeIfAbsent("Johir", k-> new ArrayList<>()).add(6);
		System.out.println(map);
		
	}
}
