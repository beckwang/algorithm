import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Random {
	public static void main(String[] args) {
		List list = new ArrayList();
		for (int i = 0; i < 5; i++) {
			//out.println( (int) Math.floor(Math.random()  * 999 ));
			list.add( (int) Math.floor(Math.random()  * 9999 ));
		}
		//out.println("45:" + list.get(45));
		out.println(ToStringBuilder.reflectionToString(list.toArray(), ToStringStyle.MULTI_LINE_STYLE));
	}
}
