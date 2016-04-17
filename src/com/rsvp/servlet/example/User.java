package com.rsvp.servlet.example;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue // (strategy = GenerationType.TABLE)
	private long userID;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_PWD")
	private String authPwd;

	@ManyToOne
	@JoinColumn(name="addressID")
	private Address address;

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAuthPwd() {
		return authPwd;
	}

	public void setAuthPwd(String authPwd) {
		this.authPwd = authPwd;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
