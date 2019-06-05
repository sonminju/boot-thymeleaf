package idu.cs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import idu.cs.domin.User;

@Entity
@Table(name = "user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@OrderBy
	private Long id; // database에서 sequence number, primary key 역할
	@Column(nullable=false, length=20, unique=true) // null 하용 안함, 유일키
	private String userId;
	@Column(nullable=false)
	private String userPw;
	private String name;
	private String company;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}	
	
	public String toString() {
		return "id : " + userId + ", name : " + name + ", company : " + company;
	}
	
	public User buildDomain() {
		User user = new User();
		user.setUserId(userId);
		user.setUserPw(userPw);
		user.setName(name);
		user.setCompany(company);
		return user;
	}
	
	public void buildEntity(User user) {
		userId = user.getUserId();
		userPw = user.getUserPw();
		name = user.getName();
		company = user.getCompany();
	}
}