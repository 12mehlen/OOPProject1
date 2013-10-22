public abstract class Person(){ //Class is extended by Professor.java and Student.java. Should not be used without extension. 
	//Coded by Jeff Andolora, 10/22/13
	
	//Properties:
	private String name = "n/a"; 
	private String ssn = "000-00-0000";
	
	//Get/Set Methods
	public void setName(String aName){
		name = aName;
	}
	public void setSSN(String aSSN){
		ssn = aSSN;
	}
	public void getName(){
		return name;
	}
	public void getSSN(){
		return SSN;
	}
	
	//Other Methods:
		public String toString(){
		return "name: " + name + "\n" + 
				"ssn: " + ssn + "\n"
	}
	
	//Constructors would go here but are not needed for this class as it is Abstract
}
