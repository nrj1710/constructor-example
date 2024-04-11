package parameterized_Constructor;

public class Constructor_overloading {
            int id;
           String name;
           int age;
           Constructor_overloading(int i, String n){
        	   id=i;
        	   name=n;
           }
           Constructor_overloading(int i,String n,int a){
        	   id=i;
        	   name=n;
        	   age=a;
           }
           void display() {
        	   System.out.println(id+" "+name+" "+age);
           }
           public static void main(String[] args) {
			
        	   Constructor_overloading s1= new Constructor_overloading(111, "karan");
        	   Constructor_overloading s2 =new Constructor_overloading(222, "Aryan", 25);
        	   s1.display();
        	   s2.display();
		}

}
