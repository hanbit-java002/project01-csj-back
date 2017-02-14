package com.hanbit.hp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.hp.dao.pickDAO;

@Service
public class PickService {

	@Autowired
	private pickDAO pickDAO;
	
	public List<Map<String, Object>> getPicks(int count){
		return pickDAO.selectPick(count);
	}
}
