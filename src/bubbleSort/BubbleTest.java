package bubbleSort;

import static java.lang.System.out;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BubbleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 20, 3, 6, 10, 30, 1 };
		int temp;

		// int j = 0;
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array.length - 1 - x; y++) {
				if (array[y] > array[y + 1]) {
					temp = array[y];
					array[y] = array[y + 1];
					array[y + 1] = temp;
				}
			}
		}

		out.println(ToStringBuilder.reflectionToString(array,
				ToStringStyle.MULTI_LINE_STYLE));

	}

}
