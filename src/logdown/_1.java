package logdown;

import java.util.Arrays;
import java.util.List;

public class _1 {

	public static void main(String[] args) {
		
		List<Integer> person = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		int interval = 2;
		int sales = 5;
		//亂數是 1～10 要取 n~m 就是 亂數＊(m-n) + n
		int startPoint = (int)(Math.random() * (person.size() - person.get(0))) + person.get(0);
		 
		int i = 0, temp = startPoint;
		while(i < sales){
			
			System.err.println(person.get(temp));
			temp = (temp + interval) > (person.size()-1) ? 
						((temp + interval) - person.size()) : (temp + interval);
			i++;
		}
	}
}
