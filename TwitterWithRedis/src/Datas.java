import tables.Historique;
import tables.Tweet;
import tables.Username;

public class Datas {

    // User
    public static Username user1 = new Username("nameUser1");
    public static Username user2 = new Username("nameUser2");
    public static Username user3 = new Username("nameUser3");

    // Tweets
    public static Tweet tweet1 = new Tweet(1, user1, "body of tweet 1, posted by user 1");
    public static Tweet tweet2 = new Tweet(2, user1, "body of tweet 2, posted by user 1");
    public static Tweet tweet3 = new Tweet(3, user2, "body of tweet 3, posted by user 2");
    public static Tweet tweet4 = new Tweet(4, user3, "body of tweet 4, posted by user 3");
    
    // Historique (des tweets posté par des utilisateurs)
    //public static Historique histo = new Historique();
    
    
    
    
}
