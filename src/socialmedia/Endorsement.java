package socialmedia;

import java.util.ArrayList;

/**
 * This class stores information on each Endorsement in the social media platform. 
 * Endorsements automatically replicate the endorsed message. The endorsed message cannot be endorsed again.
 * This class is a subclass of Post class.
 * @author Aisha
 * @author Saida
 *	
 */
@SuppressWarnings("serial")
public class Endorsement extends Post {

	//declaring variables
	private String endorsedMessage;
	private int endorsementID;
	private static int lastEndorsementID = Post.getLastID();
	private static ArrayList<Endorsement> endorsements = new ArrayList<>(); 
	
	/** 
	 * constructor for objects of class Endorsement.
	 * @param handle
	 * @param id
	 */
	public Endorsement(String handle, int id) {
		super(handle, id);
		this.endorsementID = ++lastEndorsementID;
		this.endorsedMessage = getMessage();
	}
	
	//setter for endorsedMessage
	public void setEndorsedMessage(String endorsedMessage) {
		this.endorsedMessage = endorsedMessage;
	}
	
	//getter for the static list of endorsements
	public static ArrayList<Endorsement> getEndorsementsList() {
		return endorsements;
	}
		
	//getter for endorsementID
	public int getEndorsementID() {
		return endorsementID;
	}
	
	//getter for lastEndorsementID()
	public static int getLastEndorsementID() {
		return lastEndorsementID;
	}
	
    /**
     * This method adds an endorsement to the static list of endorsements.
     */
    public static void addEndorsement(Endorsement endorsement){
        endorsements.add(endorsement);
    }
    
	/**
	 * This method displays the Endorsement.
	 */
	public String toString() {
		return "EP@ " + getHandle() + ": " + endorsedMessage;
	}
	
}
