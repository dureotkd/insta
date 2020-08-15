package com.insta.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.insta.app.dto.Member;
import com.insta.app.service.MemberService;

@Controller
public class HomeController {
	@Autowired
	MemberService memberService;
	// 안된 이유  jsp를 지원안함.. 지원해줘야댐! pom.xml에서
	@RequestMapping("/home/main")
	public String showHome(){
		return "home/main";
	}
	
	@RequestMapping("/home/doLogin")
	@ResponseBody
	public String doLogin(String loginId, String loginPwReal, String redirectUri, Model model, HttpSession session ) {
		String loginPw = loginPwReal;
		
		Member member = memberService.getMemberByLoginId(loginId);
		
		if (member==null) {
			model.addAttribute("historyBack",true);
			model.addAttribute("alertMsg","존재하지 않는 회원입니다.");
			return "common/redirect";	
		}
		
		session.setAttribute("loginedMemberId",member.getId());
		if (redirectUri == null || redirectUri.length() == 0) {
			redirectUri = "/usr/home/main";
		}
		
		model.addAttribute("redirectUri",redirectUri);
		model.addAttribute("alertMsg",String.format("%s님 반갑습니다. ^^ ",member.getName()));
		
		
		return "common/redirect";
	}
	
	
	// 사랑의 작대기
	@RequestMapping("/usr/home/main2")
	// 브라우저 화면으로 return 값을 보내줌.
	@ResponseBody
	public String showHome1() {
		return "안녕";
	}
}
