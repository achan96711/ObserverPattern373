package statusAlert;

public class Friend implements Follower {
 private String name;
 
 Friend(String s){
	 name = s;
 };
 
 public void setName(String s) {
	 name = s;
 }
 
 public String getName() {
	 return this.name;
 }
 
	public void update(Status s) {
	 System.out.println("Sent to " + this.getName() + ": " + s.getStatus());
 }
	
}
