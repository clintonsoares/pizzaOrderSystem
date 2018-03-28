package pizzaOrder;

import org.junit.Before;
import org.junit.Test;

public class Pizza_CustomerTest {
	
	Pizza p1,p2,p3;
	Pizza_Customer c1;

	@Before
	public void setUp() throws Exception {
		
		p1 = new Pizza ("Smokin Grilled Chicken    ","Non-Veg  ",250,3);
		p2 = new Pizza ("French Bread with capsicum","Veg      ",225,1);
		p3 = new Pizza ("Tuna And Sweet Corn       ","Veg      ",200,1);
		c1 = new Pizza_Customer("Clinton");
		c1.addPizza(new Pclass(p1));
		c1.addPizza(new Pclass(p2));
		c1.addPizza(new Pclass(p3));
		System.out.println(c1.bill());
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
