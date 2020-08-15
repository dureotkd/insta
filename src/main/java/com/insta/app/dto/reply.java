package com.insta.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class reply extends Dto{
	private String body;
	private int articleId;
	private int memberId;
	private int displayStatus;
}
