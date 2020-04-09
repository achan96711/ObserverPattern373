package statusAlert;

public class UserFeed {

public static void main(String args[]) {
	Friend George = new Friend();
	Friend Sarah = new Friend();
	
	ProfilePage Tom = new ProfilePage();
	
    Tom.friend(Sarah);
    Tom.friend(George);
    
    Tom.notifyUpdate( new Status ("Had fun at the beach today!", "Tom"));
    
    Tom.defriend(George);
    
    Tom.notifyUpdate( new Status ("Got into a fight with George and now I am sad.", "Tom"));
    
}	
	
	
}
