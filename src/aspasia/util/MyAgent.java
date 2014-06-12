package aspasia.util;

import java.lang.instrument.*;
import java.util.BitSet;

public class MyAgent {
	public static void premain(String args, Instrumentation inst) {
		BitSet obj = new BitSet();
		long size = inst.getObjectSize(obj);
		System.out.println("Bytes used by object: " + size);
		
		
		Boolean[] obj2 = new Boolean[0];
		long size2 = inst.getObjectSize(obj2);
		System.out.println("Bytes used by object2: " + size2);
	}
}
