import java.lang.reflect.InvocationTargetException;

public class App {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		Passenger user = new Passenger
				(1, "Sara", "Germany", null, null, true, false, false);
		
		Officer of = new Officer();
		of.postOfficer(user);
		


	}

}
