package attendance;


public class Student implements Attendee {

	private String firstName;
	private String lastName;
	private boolean present;
	
	public Student(String firstname, String lastName) {
		this.firstName = firstname;
		this.lastName = lastName;
	}
	
	public boolean isPresent(){
		return present;
	}
	
	public void setPresent(boolean present) {
		this.present = present;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public boolean mathces(String first, String last) {
		return first.toLowerCase().equals(firstName.toLowerCase()) && last.toLowerCase().equals(lastName.toLowerCase());
	}
	public boolean matches(String last) {
		return last.toLowerCase().equals(lastName.toLowerCase());
	}
	public String getReportString() {
		
		String report = lastName;
		
		while(report.length() < 20) {
			report += " ";
		}
		report += firstName;
		while(report.length()<40) {
			report += " ";
		}
		if(present)
		{
			return report+"Present";
		}
		else
		{
			return report+"Absent";
		}
	
	}
}
