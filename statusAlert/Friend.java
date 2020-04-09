package statusAlert;

public class Friend implements Follower {
 
	public void update(Status s) {
	 System.out.println(s.getName() + ": " + s.getStatus());
 }
	
}
