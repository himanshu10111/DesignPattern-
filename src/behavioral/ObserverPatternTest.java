package behavioral;

import java.util.ArrayList;
import java.util.List;

interface Subject{
	void register(Observer obj);
	void unregister(Observer obj);
	void notifyObserver();
}

class DeliveryData implements Subject
{
	private List<Observer> observers;
	private String location;
	
	public DeliveryData(){
		this.observers=new ArrayList<>();	
		
	}
	public void register(Observer obj){
		observers.add(obj);
	}
	public void unregister(Observer obj)
	{
		observers.remove(obj);
	}
	public void notifyObserver(){
		for(Observer obj: observers){
			obj.update(location);
		}
	}
	
	public void locationChanged(){
		this.location= getLocation();
		notifyObserver();
	}
	
	public String getLocation()
	{
		return "pune Warje ";
	}
}

interface Observer{
	public void update(String location);
}

class Seller implements Observer{
	private String location;
	@Override
	public void update(String location) {
		this.location=location;
		showLocation();
		
	}
	
	public void showLocation()
	{
		System.out.println("Notification at seller - Current Location: "+location);
	}
}

class User implements Observer{
	private String location;
	public void update(String location) {
		this.location=location;
		showLocation();
		
	}
	
	public void showLocation()
	{
		System.out.println("Notification at User - Current Location: "+location);
	}
	
}

class DatawareHouseCenter implements Observer{
	private String location;
	public void update(String location) {
		this.location=location;
		showLocation();
		
	}
	
	public void showLocation()
	{
		System.out.println("Notification at DataWareHouse - Current Location: "+location);
	}
}


public class ObserverPatternTest {
	public static void main(String[] args) {
		
	DeliveryData topic = new DeliveryData();
	
	Observer obj1= new Seller();
	Observer obj2= new User();
	Observer obj3= new DatawareHouseCenter();
	
	topic.register(obj1);
	topic.register(obj2);
	topic.register(obj3);
	
	topic.locationChanged();
	topic.unregister(obj3);
	System.out.println();
	topic.locationChanged();
	}

}
