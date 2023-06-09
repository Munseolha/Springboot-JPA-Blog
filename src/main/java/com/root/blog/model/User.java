package com.root.blog.model;

import java.sql.Timestamp;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


// ORM -> Java(다른 언어) Object -> 테이블로 매핑해주는 기술이다.
@Entity // User 클래스가 MySQL에 테이블이 생성이 된다.
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; // 시퀀스, auto_increment
	
	@Column(nullable = false, length = 30)
	private String username; //아이디
	
	@Column(nullable=false, length = 100)
	private String password; 
	
	@Column(nullable=false, length = 50)
	private String email; // myEmail, my_email
	
	@ColumnDefault("'user'") //"" 안에 ''를 또 써줘야핞다.
	private String role; //Enum을 쓰는 게 좋다. (도메인을 만들 수 있음)
	
	@CreationTimestamp // 시간이 자동으로 입력된다.
	private Timestamp createDate;
}
