// Author: Mitchell Skinner
// Date: 08/22/2013
// Professor

public class Professor extends Person{
	private String title = "NA";
	private String department = "NA";

// Sets

	public void setTitle(String aTitle){
		this.title = aTitle;
	}
	public void setDepartment(String aDepartment){
		this.department = aDepartment;
	}

// Gets

	public void getTitle(String aTitle){
		return this.title = aTitle;
	}
	public void getDepartment(String aDepartment){
		return this.department = aDepartment;
	}

// Constructors

	public Professor(){
		//Empty constructor
	}

	public Professor(String aTitle, String aDepartment){
		this();
		this.title = aTitle;
		this.department = aDepartment;
	}

	public Professor(String aTitle){
		this(aTitle, "NA");
	}

	public Professor(String aDepartment){
		this("NA", aDepartment);
	}

// Methods
	
	public String toString(){
		String aString = ""
		aString = "Title: " + this.title + "\n";
		aString = aString + "Department: " + this.department + "\n";
		return aString;
	}
}

//title: String
//department: String
//toString()

