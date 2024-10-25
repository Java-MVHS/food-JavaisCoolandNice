/* 
 * Kavin Kumar
 * Period 5
 * 10/25/24
 * Pizza3.java
 * 
 * 
 * 
*/

public class Pizza3 extends Food3 
{
	public Pizza3(String ingredient, String name, int price, int numOfFood) //deep dish - sends DeepDishPizza to fod
	{
		super("baked", ingredient, name, price , numOfFood);
		
	}

	public Pizza3(String ingredient) //pizza - "default" - sends it to food
	{
		super("baked", ingredient, "pizza" , 10, 20);
		
	}


}
