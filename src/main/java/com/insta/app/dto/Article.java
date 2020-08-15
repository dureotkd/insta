package com.insta.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Article extends Dto {
	private String title;
	private String body;
	private int memberId;
}
