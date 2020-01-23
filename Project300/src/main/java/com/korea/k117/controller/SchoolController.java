package com.korea.k117.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.korea.k117.domian.SchoolVo;
import com.korea.k117.service.SchoolService;

@Controller
public class SchoolController {
	 @Autowired
	 private SchoolService schoolService;
	  
	   @RequestMapping("/select.do")
	   public  String  select(SchoolVo vo, Model model) throws Exception {
	       model.addAttribute ("list", schoolService.getSelectSchool());
	       return "select";
	   }
	   @RequestMapping("/form.do")
	   public  String  form() {	  
	       return "form";
	   }
	   @GetMapping("/insert.do")
	   public  String  insertGet(SchoolVo vo) throws Exception {
	       return "insert";
	   }
	   @PostMapping("/insert.do")
	   public  String  insertPost(SchoolVo vo) throws Exception {
		   schoolService.insertSchool(vo);
	       return "redirect:select.do";
	   }
	   @RequestMapping("/delete.do")
	   public  String  delete(SchoolVo vo) throws Exception {
		   schoolService.deleteSchool(vo);
	       return "redirect:select.do";
	   }
	   @RequestMapping("/search.do")
	   public  String  search(SchoolVo vo,Model model) throws Exception {
		   List<SchoolVo> list = schoolService.search(vo);
		   System.out.println("-->"+list.toString());
		   model.addAttribute ("list",list); 
	       return "select";
	   }
}
