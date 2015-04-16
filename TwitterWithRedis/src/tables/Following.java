package tables;

/**
 * L'utilisateur suit les followers (est abonné)
 * 
 * @author emmanuel_plaisance
 * 
 */
public class Following {

    private Username username;
    private Followers followers;
    
    public Following(Username username, Followers followers) {
        this.username = username;
        this.followers = followers;
    }
    
    public Username getUsername() {
        return username;
    }
    public void setUsername(Username username) {
        this.username = username;
    }
    public Followers getFollowers() {
        return followers;
    }
    public void setFollowers(Followers followers) {
        this.followers = followers;
    }
}
