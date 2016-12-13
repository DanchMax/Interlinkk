package interlinkcompany;

public class Bard extends Human{

	
	int weight;
	int height;
	
	
	public Bard(int age, String name, int weight, int height) {
		super(age, name);
		this.weight = weight;
		this.height = height;
	}
	
	@Override
	void run(){
		if(height>50 && weight<50){
			System.out.println("im stronger by other");
		}else{
			System.out.println(" I wery big and slowly, bro");
		}
	}
	
	
}
