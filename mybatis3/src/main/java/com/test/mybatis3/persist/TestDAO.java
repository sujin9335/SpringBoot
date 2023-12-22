package com.test.mybatis3.persist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.mybatis3.domain.TestDTO;
import com.test.mybatis3.mapper.TestMapper;

@Repository
public class TestDAO {

	//기존 방식 > SqlSessionTemplate
	//현재 방식 > 인터페이스
	@Autowired
	private TestMapper mapper;
	
	public List<TestDTO> list() {
		return mapper.list();
	}

}
