package interlinkcompany;

public interface Geometric {

	int perimetr();

	int square();

	public default void print() {
		System.out.println(" Perimeter= " + perimetr());
		System.out.println("Square = " + square());
	}
}
