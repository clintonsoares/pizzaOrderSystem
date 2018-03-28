package pizzaOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;






public class Pizza_Customer {
	
	String cust_name;
	ArrayList<Pclass>_pizzas = new ArrayList<Pclass>();
	
	public Pizza_Customer (String name)
	{
		cust_name = name;
	};
	
	 public void addPizza(Pclass arg) {
	     _pizzas.add(arg);
	   }
	
	 public String getName ()
	 {
		 return cust_name;
	 };
	 
	 public String bill()
	 {
		 double totalAmount = 0;
		 double gst = 0.08;
		 double gst_amt;
		 double fin_amt;
		 Enumeration<Pclass> pizzas = Collections.enumeration(_pizzas);
		 System.out.println();
			System.out.println("--------------------------------------Smoking Joe's Pizza Palace--------------------------------------");
			System.out.println();
			System.out.println("	Pizza Item	" + " 		Type " +  "     	Price	"+"	Quantity	"+ "Total Price	");
			System.out.println("......................................................................................................");
		 String result = "\n\tCustomer Name: " + getName() + "\n\n";
		
		 while(pizzas.hasMoreElements())
		 {
			 double thisAmount = 0;
			 Pclass each = (Pclass) pizzas.nextElement();
			 thisAmount = each.getPizza().getPizza_amt() * each.getPizza().getQuantity();
			 result += "\t" + each.getPizza().getPizza_name()+ "\t" + each.getPizza().getPizza_type() + "\t" + each.getPizza().getPizza_amt() + "\t\t" + each.getPizza().getQuantity() + "\t\t" + 
					 String.valueOf(thisAmount) + "\n";
			  totalAmount += thisAmount;	 
		 }
		 result+="......................................................................................................";
		 result +=  "\n\tTotal Amount :" + String.valueOf(totalAmount) + "\n";
		 result+="......................................................................................................";
		 result +="\n\tGST is 8 % of total amount";
		 gst_amt = totalAmount * gst;
		 result +="\n\tGST = "+ gst_amt;
		 fin_amt = totalAmount + gst_amt;
		 result+="\n......................................................................................................";
		 result +=  "\n\n\tFinal Amount :" + String.valueOf(fin_amt) + "\n";
		 result+="------------------------------------------------------------------------------------------------------";
		 return result;
	 }
	  
}
