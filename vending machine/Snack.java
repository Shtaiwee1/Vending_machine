public class Snack {
	//singleton design pattern was applied here because all we need is a single object which is the final chosen snack by the user
    //properties
	public String name;
	public  double price;
	
    //static object
	static Snack obj1 = new Snack();

    //construcor
	private Snack() {	
	}



	//methods

	//to get the final chosen item
	public static Snack getInstance() {
		return obj1;
	}
	//set the price of the snack
    public static void setPrice(double price){
             obj1.price = price;
    }
	//set the name of the snack
	public static void setName(String name){
		obj1.name = name;
	}
	//get the price of the snack
	public static double getPrice(double price){
		return obj1.price;
	}

}
