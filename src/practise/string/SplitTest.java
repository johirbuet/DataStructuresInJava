package practise.string;

public class SplitTest {
	public static void main(String[] args) {
		String a = "1+2i";
		String [] arr = a.split("\\+|i");
		System.out.println(a.length());
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
