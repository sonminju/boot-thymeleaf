package idu.cs.domin;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import idu.cs.entity.UserEntity;

public class Question { //domain object == dto, vo

	private Long id; 
	private String title;
	private User writer;
	private String contents;
	private LocalDateTime createTime;
	
	public Question() {} // 생성자를 추가한 경우 디폴트 생성자를 생성해야함
	
	public Question(String title, User writer, String contents) {
	super();
	this.title = title;
	this.writer = writer;
	this.contents = contents;
	this.createTime = LocalDateTime.now();
	
}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getWriter() {
		return writer;
	}

	public void setWriter(User writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}


	
	
}
