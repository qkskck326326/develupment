package com.develup.noramore.recrboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.develup.noramore.recrboard.model.service.RecrBoardService;

// 모집테이블 전체 조회
@Controller("recrBoardController")
public class RecrBoardController {
	@Autowired
	private RecrBoardService recrBoardServoce;
	
	@RequestMapping("rblist.do")
	public String selectRecrBoard() {
		
		
		return "recrBoard/RecrBoardList";
	}//


	
	
}// CLASS
