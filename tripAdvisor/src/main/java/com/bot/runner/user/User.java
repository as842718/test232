package com.bot.runner.user;

public class User {
	
	private String userID;
	private String password;
	private String reviewID;
	private String comment;
	

	public User(String userID, String password, String reviewID, String userComment) {
		
		this.userID=userID;
		this.password=password;
		this.reviewID=reviewID;
		this.comment=userComment;
		
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReviewID() {
		return reviewID;
	}
	public void setReviewID(String reviewID) {
		this.reviewID = reviewID;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", password=" + password + ", reviewID=" + reviewID + ", comment=" + comment
				+ "]";
	}
	
	
	

}
