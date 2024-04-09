package com.develup.noramore.memadd.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.develup.noramore.memadd.model.service.MemAddService;
import com.develup.noramore.memadd.model.vo.MemAdd;
import com.develup.noramore.recrboard.model.service.RecrBoardService;
import com.develup.noramore.recrboard.model.vo.RecrBoard;


@Controller
public class MemAddController {

	
	@Autowired
	private MemAddService memAddService;
	
	@Autowired
	private RecrBoardService recrBoardService;
	
	
	//등급페이지로 이동
	@RequestMapping(value = "grade.do", method = { RequestMethod.GET, RequestMethod.POST })
	// RequestMethod.GET : get방식으로 전송오면 받음, RequestMethod.POST : post방식으로 전송오면 받음
	public String gradePage(@RequestParam("memberID") String memberid, Model model) {
		System.out.println("memberid : " + memberid);
		
		MemAdd memAdd = memAddService.selectMemAdd(memberid);
		
		System.out.println("memAdd : " + memAdd);
		if (memAdd != null) { 
			model.addAttribute("memAdd", memAdd); // 꺼낼 때는 여기서 저장한 이름으로 꺼냄
			return "member/gradePage";
		} else {
			return "redirect:home.do";
		}
	}


//	//활동기록 페이지로 이동
//	@RequestMapping(value = "selectRecrBoadMemberId.do", method = { RequestMethod.GET, RequestMethod.POST })
//	// RequestMethod.GET : get방식으로 전송오면 받음, RequestMethod.POST : post방식으로 전송오면 받음
//	public String articleListPage(@RequestParam("memberID") String memberid, Model model) {
//		System.out.println("memberid : " + memberid);
//		
//		ArrayList<RecrBoard> recrBoardList = recrBoardService.selectRecrBoardId(memberid);
//		
//		System.out.println("list : " + recrBoardList);
//		if (recrBoardList != null) { 
//			model.addAttribute("list", recrBoardList); // 꺼낼 때는 여기서 저장한 이름으로 꺼냄
//			return "member/myArticlePage";
//		} else {
//			return "redirect:home.do";
//		}
//	}








//	@RequestMapping(value = "gradeImage.do", method = RequestMethod.POST)
//	public void dupCheckId(@RequestParam("memberid") String memberid, HttpServletResponse response) throws IOException {
//
//		
//		System.out.println("memberid!!!1 : memberid ");
//		
//		String returnStr = null;
//		MemAdd memAdd = memAddService.selectMemAdd(memberid);
//		int actCount = memAdd.getArticleCount();
//		System.out.println("actCount : " + actCount);
//		
//		if(memberid.length() > 0) {
//			returnStr = "null";
//			
//		}else {
//			if (actCount > 0 && actCount < 31) {
//				returnStr = "sprout";
//			} else if(actCount > 30 && actCount < 51) {
//				returnStr = "grass";
//			}else if(actCount > 50 && actCount < 71) {
//				returnStr = "flower";
//			}else if(actCount > 70 && actCount < 91) {
//				returnStr = "tree";
//			}else {
//				returnStr = "forest";
//			}
			
			
//		}
//		// response 를 이용해서 클라이언트와 출력스트림을 열어서 문자열값 내보냄
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.append(returnStr);
//		out.flush();
//		out.close();
//	}
//




	
}