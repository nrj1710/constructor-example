package example_of_constructor;

public class Null_Default_constructor_ex_2 {
	int id;
	String name;
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Null_Default_constructor_ex_2 df2 =new Null_Default_constructor_ex_2();
		Null_Default_constructor_ex_2 df3 =new Null_Default_constructor_ex_2();
		df2.display();
		df3.display();
	}
	

}
