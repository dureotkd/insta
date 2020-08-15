package com.insta.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insta.app.dao.MemberDao;
import com.insta.app.dto.Member;

@Service
public class MemberService {
	@Autowired
	MemberDao memberDao;

	public Member getMemberByLoginId(String loginId) {
		return memberDao.getMemberByLoginId(loginId);
	}
}
