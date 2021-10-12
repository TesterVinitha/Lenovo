package PackageLenovo;

public class TechLenovo {

	public void sub() {

		int a = 10, b = 40;

		int c = a - b;

		System.out.println(c);

	}

	public void add() {

		int a = 10, b = 50;

		int c = a + b;

		System.out.println(c);

	}

	public static void main(String[] args) {

		TechLenovo t = new TechLenovo();

		t.add();
		t.sub();

	}

}
