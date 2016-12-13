package interlinkcompany;

public class Main {

	public static void main(String[] args) {
		Human human = new Human(18, "Ivan");
		human.name = "Ivan";
		human.run();

		
		Hunter hunter = new Hunter(20, " Vova");
		hunter.name = "Petro";
		hunter.eatMeat("bird meat");
		hunter.run();
		hunter.eatMeat();
		System.out.println(human);
		System.out.println(hunter);
		Person jun = new Person();
		jun.setName("max");
		jun.setAge(29);
		System.out.println("Java jun have name " + jun.getName() + " his age "
				+ jun.getAge());
		Person pup = new Person();

		Bard bard = new Bard(10, "Vika", 40, 40);
		bard.run();
		
	}

	static int value(int count, int price) {
		return count * price;
	}

	static int value(int count, int price, double discount) {
		int value = value(count, price);
		return (int) (value * discount);

	}
	

	}


