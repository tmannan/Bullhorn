package model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Bhuser implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long bhuserid;
	private Date joindate;
	private String motto;
	private String useremail;
	private String username;
	private String userpassword;
	private List <Bhpost> bphosts;
	
	public Bhuser() {
	}
	
	public long getBhuserid() {
		return bhuserid;
	}
	public void setBhuserid(long bhuserid) {
		this.bhuserid = bhuserid;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public String getMotto() {
		return motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public List <Bhpost> getBphosts() {
		return bphosts;
	}

	public void setBphosts(List <Bhpost> bphosts) {
		this.bphosts = bphosts;
	}

	
}
