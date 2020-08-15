package com.insta.app.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dto {
	private int id;
	private String regDate;
	private String updateDate;
	private Map<String, Object> extra;
}
