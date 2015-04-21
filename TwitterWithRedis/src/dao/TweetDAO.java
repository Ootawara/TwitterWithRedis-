package dao;

import beans.Tweet;
import beans.User;

import java.util.List;

public interface TweetDAO {
	
    public List<Tweet> getAllTweet();
    public List<Tweet> getTweetByUser(User user);
    public Tweet getTweet(int tweetId);
    public void createTweet(Tweet tweet);
    public void deleteTweet(Tweet tweet);

}
