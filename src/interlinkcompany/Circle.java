package interlinkcompany;

public class Circle implements Piiii{

	private int r;

	public Circle(int r) {

		this.r = r;
	}

	@Override
	public int perimetr() {

		return (int) (PI * r * r);
	}

	@Override
	public int square() {

		return (int) (2 * PI * r);

	}	
}
