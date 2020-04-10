package statusAlert;

public class UserMessages {
	public static void main(String args[]) {
		Friend George = new Friend("George");
		Friend Sarah = new Friend("Sarah");
		
		ProfilePage Tom = new ProfilePage();
		
	    Tom.friend(Sarah);
	    Tom.friend(George);
	    
	    Tom.notifyUpdate( new Status ("Had fun at the beach today!"));
	    
	    Tom.defriend(George);
	    
	    Tom.notifyUpdate( new Status ("Got into a fight with George and now I am sad."));
	    
	}	
}
