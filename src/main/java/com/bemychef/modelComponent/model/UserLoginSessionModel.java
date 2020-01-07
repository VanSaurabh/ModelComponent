package com.bemychef.modelComponent.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bemychef_login_session")
public class UserLoginSessionModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UserModel userId;
	
	private String sessionid;
	
	@Column(name = "creation_time")
	private Timestamp creationTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public UserModel getUserId() {
		return userId;
	}

	public void setUserId(UserModel userId) {
		this.userId = userId;
	}

	public String getSessionid() {
		return sessionid;
	}

	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}

	public Timestamp getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}
	
	
}
