package L25_July26.GenericsFxn;

import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-Jul-2019
 *
 */

public class CarSpeedComparator implements Comparator<Car>{

	@Override
	public int compare(Car t, Car o) {
		return t.speed - o.speed;
	}

	
}
