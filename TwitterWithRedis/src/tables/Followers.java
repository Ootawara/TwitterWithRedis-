package tables;

/**
 * Les utilisateurs qui suivent (abonnés au) user
 * 
 * @author emmanuel_plaisance
 *
 */
public class Followers {

    private Username username;
    private Following following;
    
    public Followers(Username username, Following following) {
        this.username = username;
        this.following = following;
    }
    public Username getUsername() {
        return username;
    }
    public void setUsername(Username username) {
        this.username = username;
    }
    public Following getFollowing() {
        return following;
    }
    public void setFollowing(Following following) {
        this.following = following;
    } 

}
