package com.korea.k117.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;


import com.korea.k117.domian.SchoolVo;

@Mapper
@Component
public interface SchoolDAO {
	public List<SchoolVo> selectSchool() throws DataAccessException;
	public void insertSchool(SchoolVo vo) throws DataAccessException;
	public void deleteSchool(SchoolVo vo) throws DataAccessException;
	public List<SchoolVo> search(SchoolVo vo) throws DataAccessException;
}
