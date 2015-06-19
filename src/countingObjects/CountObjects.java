package countingObjects;

public class CountObjects {
	public static void main(String [] args){
		
		System.out.println(Thingzoids.count +" : is the count now");
		Thingzoids t1 = new Thingzoids();
		System.out.println("....A Thingzoids object has been created and therefore count will be increased");
		System.out.println(Thingzoids.count +" : is the count now");
		System.out.println(t1.name= "bob");
		System.out.println("....A Thingzoids has been accessed but we didn't create a new one, so count won't be increased");
		System.out.println(Thingzoids.count +" : is the count now");
		
	}

}

class Thingzoids{
	public String name;
	public static int count = 0; 	// here we are creating a static int. Static variables are class variables.
									// they don't belong to the objects they belong to the class.
	Thingzoids(){					// here we are building a constructor which will be called each time the class is called.
		count++;					// so it will increment the value for count each time it's called and keep track of num of calls
	}
}