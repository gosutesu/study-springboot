package sample;

/**
 * 否定論理和
 */
public class Nor {
	public static void main(String[] args) {
		System.out.println(!(true || true));
		System.out.println(!(true || false));
		System.out.println(!(false || true));
		System.out.println(!(false || false));
	}

}
