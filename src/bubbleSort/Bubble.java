package bubbleSort;

import static java.lang.System.out;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Bubble {

	public static void main(String[] args) throws ParseException {
		int[] number = { 3, 6, 30, 20, 30, 30 };
		int temp = 0;

		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss SSSSSSSSS");
		String afterDate = sdf.format(new Date());

		// System.out.println("number.length:" + number.length);
		for (int i = 0; i < number.length; i++) {
			System.out.println("i:" + i + "==");

			for (int j = 0; j < number.length - 1 - i; j++) {
				System.out.println("j:" + j);
				// System.out.println("number.length - 1 - i:"
				// + (number.length - 1 - i));

				if (number[j] > number[j + 1]) {
					temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
				}

			}
		}
		// System.err.println(afterDate);
		// System.err.println(sdf.format(new Date()));

		out.println(ToStringBuilder.reflectionToString(number,
				ToStringStyle.MULTI_LINE_STYLE));

	}
}
