package model;

import java.io.Serializable;
import java.util.Date;

public class Bhpost implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long postid;
	private Date postdate;
	private String posttext;
	private long bhuserid;
	public long getPostid() {
		return postid;
	}
	public void setPostid(long postid) {
		this.postid = postid;
	}
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	public String getPosttext() {
		return posttext;
	}
	public void setPosttext(String posttext) {
		this.posttext = posttext;
	}
	public long getBhuserid() {
		return bhuserid;
	}
	public void setBhuserid(long bhuserid) {
		this.bhuserid = bhuserid;
	}
	public Bhuser getBhuser() {
		return customTools.DbUser.getUser(this.bhuserid);
	}

}
