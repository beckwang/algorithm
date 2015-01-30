package quickSort;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class ObjectOriented {
	static Random random = new Random();

	public static void Sort(int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		for (int n : array)
			list.add(n);
		list = Sort(list);
		for (int i = 0; i < array.length; ++i)
			array[i] = list.get(i);
	}

	public static List<Integer> Sort(List<Integer> list) {
		if (list.size() < 2)
			return list;

		// random pivot
		// int pivot = list.get(random.nextInt(list.size() - 1));

		// middle pivot
		int pivot = list.get(list.size() / 2);
		list.remove(list.size() / 2);
		List<Integer> less = new ArrayList<Integer>();
		List<Integer> greater = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		
		for (Integer n : list) {
			if (n > pivot)
				greater.add(n);
			else
				less.add(n);
		}
		
		result.addAll(Sort(less));
		result.add(pivot);
		result.addAll(Sort(greater));
		return result;
	}
}
