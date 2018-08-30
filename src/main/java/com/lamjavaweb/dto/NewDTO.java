package com.lamjavaweb.dto;

import java.io.Serializable;

public class NewDTO implements Serializable {

	private static final long serialVersionUID = 3047062761785239087L;

	private Long id;
	private String title;
	private String shortDescription;
	private String content;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getId() {
		return id;
	}
}
