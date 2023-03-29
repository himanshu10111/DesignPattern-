package structural;  // package name 
import java.sql.Driver;  // importing the sql driver package

class Facade{  // facade class
public static void main(String[] args){  // main method 
	
	Delivery.getDelivery("swiggy","food"); // calling methods 
	Delivery.getDelivery("zomato","food");
	Delivery.getDelivery("blinkit","food");
	Delivery.getDelivery("dunzo","food");
	Delivery.getDelivery("swiggy","grocery");
	Delivery.getDelivery("zomato","grocery");
	Delivery.getDelivery("blinkit","grocery");
	Delivery.getDelivery("dunzo","grocery");
	Delivery.getDelivery("swigg","grocery");
	
	
}	
}


class Swiggy{ // class swiggy
	public static  Driver getSwiggy()  // method getswiggy
	{
		return null;
	}
	public static void getFood() // method for food from swiggy class
	{
		System.out.println("Food is reaching from the swiggy");
	}
	public static void getGrocery() // method for grocery from swiggy class
	{
		System.out.println("Grocery is coming from the Swiggy");
	}
	
}

class Zomato{ // class zomato
	public static Driver getZomato() // getzomato class
	{
		return null;
	}
	public static void getFood() //getfood method from zomato class
	{
		System.out.println("Food is reaching from the Zomato");
	}
	public static void getGrocery() //getgrocery method from zomato class
	{
		System.out.println("Grocery is coming from the Zomato");
	}
}

class Blinkit{ // Blinkit class
	public static Driver getBlinkit() // getblinkit method
	{
		return null;
	}
	public static void getFood() //getfood method from binkit class
	{
		System.out.println("Food is reaching from the Blinkit");
	}
	public static void getGrocery() // getgrocery method from blinkit class
	{
		System.out.println("Grocery is coming from the Blinkit");
	}
	
}

class Dunzo{ // class Dunzo
	public static Driver getDunzo() // getDunzo method
	{
		return null;
	}
	public static void getFood() // getfood method from dunzo class
	{
		System.out.println("Food is reaching from the Dunzo");
	}
	public static void getGrocery() //getgrocery method from dunzo class
	{
		System.out.println("Grocery is coming from the Dunzo");
	}
}


class Delivery // class  delivery 
{
	public static void getDelivery(String patner,String product) // getdelivery method from delivery class 
	{
		Driver driver=null; 
		switch(patner) // outer switch  check the patner
		{
		case "swiggy":
			driver= Swiggy.getSwiggy();
		switch(product) // inner switch check the product
		{
		case "food":
			Swiggy.getFood();
			break;
		case "grocery":
			Swiggy.getGrocery();
			break;
		}
		break;
		
		case "zomato":
			driver=Zomato.getZomato();
		switch(product)
		{
		case "food":
			Zomato.getFood();
			break;
		case "grocery":
			Zomato.getGrocery();
			break;
		}
		break;
		case "blinkit":
			driver=Blinkit.getBlinkit();
			switch(product)
			{
			case "food":
				Blinkit.getFood();
				break;
			case "grocery":
				Blinkit.getGrocery();
				break;
			}
			break;
		case "dunzo":
			driver=Dunzo.getDunzo();
			switch(product)
			{
			case "food":
				Dunzo.getFood();
				break;
			case "grocery":
				Dunzo.getGrocery();
				break;
			}
			break;
			
			default : // default statement for any entry outside the box.
				System.out.println("worng entry");
		}
		
	}
}
