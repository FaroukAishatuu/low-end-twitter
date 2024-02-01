import socialmedia.AccountIDNotRecognisedException;
import socialmedia.SocialMedia;
import socialmedia.BadSocialMedia;
import socialmedia.Comment;
import socialmedia.Endorsement;
import socialmedia.HandleNotRecognisedException;
import socialmedia.IllegalHandleException;
import socialmedia.InvalidHandleException;
import socialmedia.InvalidPostException;
import socialmedia.NotActionablePostException;
import socialmedia.Post;
import socialmedia.PostIDNotRecognisedException;
import socialmedia.SocialMediaPlatform;

import java.io.IOException;

import socialmedia.Account;

/**
 * A short program to illustrate an app testing some minimal functionality of a
 * concrete implementation of the SocialMediaPlatform interface -- note you will
 * want to increase these checks, and run it on your SocialMedia class (not the
 * BadSocialMedia class).
 *
 * 
 * @author Diogo Pacheco
 * @version 1.0
 */
public class SocialMediaPlatformTestApp {

	/**
	 * Test method.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		System.out.println("The system compiled and started the execution...");
		
		SocialMediaPlatform platform = new SocialMedia();	
		
		
		try {
			platform.createAccount("elfi", "sexiest woman alive");		
			platform.createAccount("saida");
		} catch (IllegalHandleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidHandleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			platform.createPost("elfi", "i stan ilham aliyev");
			platform.createPost("elfi", "computer science is stupid");
			platform.createPost("saida", "fuck");
		} catch (HandleNotRecognisedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			platform.commentPost("saida", 1, "raziyam");
		} catch (HandleNotRecognisedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PostIDNotRecognisedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotActionablePostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			platform.endorsePost("saida", 1);
		} catch (HandleNotRecognisedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PostIDNotRecognisedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotActionablePostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			System.out.println(platform.showAccount("elfi"));
		} catch (HandleNotRecognisedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		try {
			System.out.println(platform.showIndividualPost(1));
		} catch (PostIDNotRecognisedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assert (platform.getNumberOfAccounts() == 0) : "Innitial SocialMediaPlatform not empty as required.";
		assert (platform.getTotalOriginalPosts() == 0) : "Innitial SocialMediaPlatform not empty as required.";
		assert (platform.getTotalCommentPosts() == 0) : "Innitial SocialMediaPlatform not empty as required.";
		assert (platform.getTotalEndorsmentPosts() == 0) : "Innitial SocialMediaPlatform not empty as required.";

		Integer id;
		try {
			id = platform.createAccount("saida");
			assert (platform.getNumberOfAccounts() == 1) : "number of accounts registered in the system does not match";

			platform.removeAccount(id);
			assert (platform.getNumberOfAccounts() == 0) : "number of accounts registered in the system does not match";

		} catch (IllegalHandleException e) {
			assert (false) : "IllegalHandleException thrown incorrectly";
		} catch (InvalidHandleException e) {
			assert (false) : "InvalidHandleException thrown incorrectly";
		} catch (AccountIDNotRecognisedException e) {
			assert (false) : "AccountIDNotRecognizedException thrown incorrectly";
		}
		

	}

}
