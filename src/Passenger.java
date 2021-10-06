
public class Passenger {
	int id;
	private String name, placesVisited, specialConditions, ListedAllergies;
	boolean hasFever, hasCough, pcrStatus;
	
	public Passenger(int id, String name, String placesVisited, 
			String specialConditions, String ListedAllergies, 
			boolean hasFever, boolean hasCough, boolean pcrStatus) {

		this.id = id;
        this.name = name;
        this.placesVisited = placesVisited;
        this.specialConditions = specialConditions;
        this.ListedAllergies = ListedAllergies;
        this.hasFever = hasFever;
        this.hasCough = hasCough;
        this.pcrStatus = pcrStatus;
    }
	
	// Setters & Getters
	
	//ID
	
	public void setPassengerId(int id) {
		this.id = id; 
	}
 
	public int getPassengereId() {
		return this.id;
	}
	
	//Name
	
	public void setPassengerName(String pName) {
		this.name = pName; 
	}
 
	public String getPassengereName() {
		return this.name;
	}
	
	//Places Visited
	
	public void setPlacesVisted(String pVisited) {
		this.placesVisited = pVisited; 
	}
	 
	public String getPlacesVisted() {
		return this.placesVisited;
	}
	
	//Special Conditions
	
	public void setspecialConditions(String sConditions) {
		this.specialConditions = sConditions; 
	}
		 
	public String getspecialConditions() {
		return this.specialConditions;
	}
		
	//Listed Allergies
		
	public void setListedAllergies(String lAllergies) {
		this.ListedAllergies = lAllergies; 
	}
		 
	public String getListedAllergies() {
		return this.ListedAllergies;
	}
	
	//Has Fever
	
	public void setHasFever(boolean hFever) {
		this.hasFever = hFever; 
	}
		 
	public boolean getHasFever() {
		return this.hasFever;
	}
	
	//Has Cough
	
	public void setHasCough(boolean hCough) {
		this.hasCough = hCough; 
	}
		 
	public boolean getHasCough() {
		return this.hasCough;
	}
	
	//PCR Status
	
	public void setPcrStatus(boolean pcrStatus) {
		this.pcrStatus = pcrStatus; 
	}
		 
	public boolean getPcrStatus() {
		return this.pcrStatus;
	}
	
	
}
