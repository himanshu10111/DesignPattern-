package creational; // package name creational 

public class Factory { // class Factory
public static void main(String[] args) { // main method 
	
	Laptop office = LaptopFactory.getInstance("office", 50000);   // taking reference of Laptop class and calling getInstane method of LaptopFactory class with passing appropriate arguments
	
	System.out.println(office); // Print the return value with the help of (office) reference variable.
	
	Laptop gamming = LaptopFactory.getInstance("gaming",99999); // here we do same but reference variable and parameters are Different.
	System.out.println(gamming);
	
	
}
}

abstract class Laptop // abstract class Laptop
{
	public abstract int getprice(); // creating abstract method getprice 
	
	public String toString() // creating tostring method will return the price of laptop
	{
		return "price:- "+getprice();
	}
	
}

class OfficeLaptop extends Laptop // creating child class OfficeLaptop  of base class Laptop
{
	int price;
	public OfficeLaptop(int price) { // Creating a constructor 
		this.price=price;
	}
	
	public int getprice()  // override and implementing the getprice method 
	{
		return price;
	}
}

class GamingLaptop extends Laptop // creating child class GamingLaptop of base class Laptop
{
	int price;
	
	public GamingLaptop(int price) { //Creating a constructor
		this.price=price;
	}
	
	public int getprice()  // override and implementing the getprice method 
	{
		return price;
	}
}

class LaptopFactory // creating class LaptopFactory
{
	public static Laptop  getInstance(String type,int price){ // creating method getInstance 
		if(type == "office"){  // if object type is office laptop
			return new OfficeLaptop(price); // return the price of office laptop
	}else if(type=="gaming") // else if object type is gaming laptop 
	{
		return new GamingLaptop(price); // return the price of gaming laptop
	}
	return null; // else not match then return null.
}
}
