package messageSender.model;

import java.util.*;

public class ProfilePage implements Profile {
	
	private List<Follower> followers = new ArrayList<>();
	
	
	public void friend(Follower f) {
		followers.add(f);
	}
	
	public void defriend(Follower f) {
		followers.remove(f);
	}
	
	public void notifyUpdate(Status s) {
		for(int i = 0; i < followers.size(); i++) {
			followers.get(i).update(s);
		}
	}
}
