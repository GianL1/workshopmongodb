package com.gyanp.workshopmongodb.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CommentDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String Id;
	private String text;
	private Date date;
	private AuthorDTO author;	

	public CommentDTO() {
		// TODO Auto-generated constructor stub
	}

	public CommentDTO(String text, Date date, AuthorDTO author) {
		super();
		this.text = text;
		this.date = date;
		this.author = author;
	}
	
	

}
