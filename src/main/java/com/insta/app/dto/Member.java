package com.insta.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member extends Dto {
	private String name;
	private String nickName;
	private String email;
	private String loginId;
	private String loginPw;
	private int authStatus;
}
