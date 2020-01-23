package com.korea.k117.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.k117.domian.SchoolVo;
import com.korea.k117.mapper.SchoolDAO;

@Service
public class SchoolService {
	@Autowired
	private SchoolDAO dao;
	
	public List<SchoolVo> getSelectSchool(){
		return dao.selectSchool();
	}
	public void insertSchool(SchoolVo vo){
		dao.insertSchool(vo);
	}
	public void deleteSchool(SchoolVo vo) {
		dao.deleteSchool(vo);
	}
	public List<SchoolVo> search(SchoolVo vo){
		return dao.search(vo);
	}
}
