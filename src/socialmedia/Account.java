package socialmedia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This class stores information of each Account in the social media platform. 
 * Accounts can be created or removed and their description field can be updated.
 * This class is a superclass of Posts and Comments classes. 
 * @author Aisha
 * @author Saida
 *
 */
@SuppressWarnings("serial")
public class Account implements Serializable {
    
	//declaring variables
    private int ID;
    private String handle;
    private String description;
    private static int lastAccountID = 0;
    private static ArrayList<Account> accounts = new ArrayList<>();
    private List<Post> postsList = new ArrayList<>();
    private List<Endorsement> accountEndorsementsList = new ArrayList<>();
    private List<Comment> accountCommentsList = new ArrayList<>();    

    /**
     * constructor for objects of class Account.
     * @param handle
     * @param description
     */
    public Account(String handle, String description) {
        this.handle = handle;
        this.description = description;
        this.ID = ++lastAccountID;
    }
    
    /**
     * one-arg constructor for objects of class Account.
     * @param handle
     */
    public Account(String handle) {
    	this.handle = handle;
    	this.ID = ++lastAccountID;
    }
    
    //setter for description
    public void setDescription(String description) {
    	this.description = description;
    }
    
    //setter for handle
    public void setHandle(String handle) {
    	this.handle = handle;
    }
     
    //getter for handle
    public String getHandle() {
        return handle;
    }
    
    //getter for the static list of accounts
    public static ArrayList<Account> getAccountsList() {
    	return accounts;
    }
    
    //getter for description
    public String getDescription() {
        return description;
    }
    
    //getter for the list of posts of each account 
    public List<Post> getEachPostList() {
    	return postsList;
    }
    
    //getter for the list of endorsements of each account 
    public List<Endorsement> getAccountEndorsementsList() {
    	return accountEndorsementsList;
    }
    
    //getter for the list of comments of each account
    public List<Comment> getAccountCommentList() {
    	return accountCommentsList;
    }
    
    /**
     * This method adds an account into the static accounts list.
     */
    public static void addAccount(Account account){
        accounts.add(account);
    }
    
    /**
     * This method adds an endorsement to the endorsement list of each account.
     */
    public void addAccountEndorsement(Endorsement endorsement) {
        accountEndorsementsList.add(endorsement);
    }
       
    /**
     * This method returns the ID of the Account.
     * @return ID
     */
    public int getID(){
        return ID;
    }
        
    /**
     * This method displays the Account.
     * @return toString of Account
     */
    public String toString() {
         return "Account[name = " + handle + ", description = " +
         description + ", ID = " + ID + "]";
    }
}