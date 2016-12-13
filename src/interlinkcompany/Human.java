package interlinkcompany;

public class Human {

	int age;

	String name;

	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	void run() {
		System.out.println(name + ": go-go-go ");
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String toString() {
		return "Human [age=" + age + ", name=" + name + "]";
	}
}
