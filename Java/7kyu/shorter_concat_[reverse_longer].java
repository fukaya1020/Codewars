public class ReverseLonger {
	public static String shorterReverseLonger(String a, String b) {
		StringBuffer sb;
		if (a.length() < b.length()) {
			sb = new StringBuffer(b);
			return (a + sb.reverse().toString() + a);
		}
		else {
			sb = new StringBuffer(a);
			return (b + sb.reverse().toString() + b);
		}
	}
}