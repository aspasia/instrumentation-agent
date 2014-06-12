package aspasia.util;

import java.util.BitSet;

public class Main {

	public static void main(String[] args) {
		System.out.println(MyAgent.getObjectSize("Aspa"));
		System.out.println(MyAgent.getObjectSize(new Boolean[10000]));
		System.out.println(MyAgent.getObjectSize(new BitSet(1000)));
	}
}
