package socialmedia;
import java.util.ArrayList;
import java.util.List;

/**
 * This class stores information on each Endorsement in the social media platform. 
 * Endorsements automatically replicate the endorsed message. The endorsed message cannot be endorsed again.
 * This class is a subclass of Post class.
 * @author Aisha
 * @author Saida
 */
@SuppressWarnings("serial")
public class Comment extends Post {
	
	//declaring variables
	private static ArrayList<Comment> comments = new ArrayList<>();
	private String comment;
	private int commentID;
	private static int lastCommentID = Endorsement.getLastEndorsementID();
	private List <Comment> commentsCommentsList = new ArrayList<>();
	
	/**
	 * a constructor for objects in class Comment.
	 * @param handle
	 * @param id
	 * @param message
	 */
	public Comment(String handle, int id, String message) {
		super(handle, id);
		this.comment = message;
		this.commentID = ++lastCommentID;
	}
	
	//getter for the static list of comments
	public static ArrayList<Comment> getCommentsList() {
		return comments;
	}
	
	//getter for comment
	public String getComment() {
		return comment;
	}
	
	//getter for commentID
	public int getCommentID() {
		return commentID;
	}
	
	//getter for the list of replies of each comment.
	public List<Comment> getCommentsCommentsList() {
		return commentsCommentsList;
	}
	
	/**
	 * This method adds a comment to the static list of comments.
	 */
	public static void addComment(Comment comment) {
		comments.add(comment);
	}
		
	/**
	 * This method displays the Comment. 
	 */
	public String toString() {
		return "@Comment " + getHandle() + ": " + comment; 
	}
	
	
}
