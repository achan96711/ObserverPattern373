package statusAlert;

public class Status {

	final String statement, name;
	
	
	public Status (String statement, String name) {
		this.statement = statement;
		this.name = name;
		
	}
	
	public String getStatus() {
		return statement;
	}
	
	public String getName() {
		return name;	
	}
	
}
