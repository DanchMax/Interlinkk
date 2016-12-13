package interlinkcompany;

public class Hunter  extends Human {

	int count;

	public Hunter(int age, String name) {
		super(age, name);
		System.out.println("i am hunter");
	}

	public Hunter(int age, String name, int count) {
		super(age, name);
		this.count = count;
	}

	void eatMeat(String meat) {
		System.out.println(name + ": nyam-nyam " + meat);
	}

	void eatMeat() {
		run();
		count++;
		System.out.println(name + ": i kill " + count + " mamont");
		eatMeat("mamont meat");
	}

	@Override
	void run() {
		System.out.println(name + ": faster go-go-go");
		super.run();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + count;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hunter other = (Hunter) obj;
		if (count != other.count)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hunter [count=" + count + ", age=" + age + ", name=" + name
				+ "]";
	}

}
