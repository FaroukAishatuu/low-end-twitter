package socialmedia;

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores information on each post of an individual Account in the social media platforms. 
 * Posts can be created, removed and have a caption up to 100 characters.
 * The class is a subclass of Account class.
 * @author Aisha
 * @author Saida
 *
 */
@SuppressWarnings("serial")
public class Post extends Account {
	
	//declaring variables
    private static int lastID = 0; 
	private String message;
	private int id;
    private static ArrayList<Post> posts = new ArrayList<>();
    private List<Endorsement> endorsementsList = new ArrayList<>();
    private List<Comment> commentsList = new ArrayList<>();
    
	/**
	 * constructor for objects of class Post.
	 * @param handle 
	 * @param message
	 */
	public Post(String handle, String message) {
		super(handle);
		this.id = ++lastID;
		this.message = message;
	}
	
	/**
	 * 2nd constructor for objects of class Post.
	 * @param handle
	 * @param id
	 */
	public Post(String handle, int id) {
		super(handle);
		this.id = id;
	}
		
	//setter for message
	public void setMessage(String postCaption) {
		this.message = postCaption;
	}
		
	//getter for message
	public String getMessage() {
		return message;
	}
	
	//getter for postID
	public int getPostID() {
		return id;
	}
	
	//getter for the list of endorsements of each post
	public List<Endorsement> getEachPostEndorsementList() {
		return endorsementsList; 
	}
	
	//getter for the list of comments of each post
	public List<Comment> getEachCommentList() {
		return commentsList;
	}
    
    //getter for the static list of posts
    public static ArrayList<Post> getPostsList() {
    	return posts;
    }

    /**
     * This method adds a post into the static posts list.
     */
    public static void addPost(Post post){
        posts.add(post);
    }
           
    /**
     * This method gets the lastID of Post.
     * @return lastID
     */
    public static int getLastID() {
    	return lastID;
    }
       
    /**
     * This method adds an endorsement to the endorsement list of every post object created.
     */
    public void addEndorsementtoList(Endorsement endorsement) {
        endorsementsList.add(endorsement);
    }
    
    /**
     * This method returns the number of endorsements for each post object created.
     * @return number of endorsements
     */
    public int getNumberOfEndorsements() {
        return endorsementsList.size();
    } 
       
    /**
     * This method adds a comment to the comment list of every post object created.
     */
    public void addCommentToList(Comment comment) {
        commentsList.add(comment);
    }
    
    /**
     * This method returns the number of comments for each post object created.
     * @return number of comments
     */
    public int getNumberOfComments() {
        return commentsList.size();
    } 
	
    /**
     * This method displays the Post.
     * @return toString of Post
     */
    public String toString() {
        return "Post[name = " + getHandle() + ", message = " +
        message + ", ID = " + id + "]";
   }


	
	
}




