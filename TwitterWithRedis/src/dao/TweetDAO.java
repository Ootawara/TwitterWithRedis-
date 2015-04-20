
public interface class TweetDAO {
	
    public List<Tweet> getAllTweet();    
    public List<Tweet> getTweetByUser(Username user);
    public Student getTweet(int tweetId);
    public void createTweet(Tweet tweet);
    public void deleteTweet(Tweet tweet);

	
}
