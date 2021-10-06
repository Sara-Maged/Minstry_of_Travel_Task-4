
public class Officer {
    
	
	public void postOfficer(Passenger user) {
		System.out.println(user.getPassengereName() + " Reached the Post Officer");
		System.out.println("Data Seen");
		System.out.println("Passenger Name: " + user.getPassengereName() + ",\n" + 
				"PCR Status: " + user.getPcrStatus() + ",\n" + 
				"Special Conditions if Any: " + user.getspecialConditions() + "\n");
		
		if(user.hasFever) healthOfficer(user);
		else immigrationOfficer(user);
	}

	
	public void immigrationOfficer(Passenger user) {
		System.out.println(user.getPassengereName() +" Reached the Immigration Officer");
		System.out.println("Data Seen");
		System.out.println("Passenger Name: " + user.getPassengereName() + ",\n" +
				"PCR Status: " + user.getPcrStatus() + ",\n" +
				"Special Conditions if Any: " + user.getspecialConditions() + ",\n" +
				"Places Visited in the past 14 Days: " + user.getPlacesVisted());
	}
	
	
	public void healthOfficer(Passenger user) {
		System.out.println(user.getPassengereName() +" Reached the Health Officer");
		System.out.println("Data Seen");
		System.out.println("Passenger Name: " + user.getPassengereName() + ",\n" +
				"PCR Status: " + user.getPcrStatus() + "," +
				"Special Conditions if Any: " + user.getspecialConditions() + ",\n" +
				"Places Visited in the past 14 Days: " + user.getPlacesVisted() + ",\n" +
				"Has Fever: " + user.getHasFever() + ",\n" +
				"Has Cough: " +user.getHasCough() + ",\n" +
				"List of Allergies if Any: " + user.getListedAllergies() + "\n");
		
		pcrOfficer(user);
	}
	
	
	public void pcrOfficer(Passenger user) {
		System.out.println("Passenger Name: " + user.getPassengereName() +" Reached the PCR Conductor");
		System.out.println("Data Seen");
		System.out.println(user.getPassengereName() + ",\n" +
				"Has Fever: " + user.getHasFever() + ",\n" +
				"Has Fever: " + user.getHasCough() + "\n");
		
		immigrationOfficer(user);
	}
}
