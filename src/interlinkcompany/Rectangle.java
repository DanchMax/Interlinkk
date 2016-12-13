package interlinkcompany;

public class Rectangle implements Geometric {

	private int a;

	private int b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int square() {
		return 2 * (a + b);

	}

	@Override
	public int perimetr() {

		return a * b;
	}

}
