package com.hanbit.hp.admin.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StoreDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public List selectList() {
		return sqlSession.selectList("admin.store.selectList");
	}
	
	public int insert(String storeId, String storeName,
			String storeImg, String categoryId, String locationId) {
		
		Map param = new HashMap();
		param.put("storeId", storeId);
		param.put("storeName", storeName);
		param.put("storeImg", storeImg);
		param.put("categoryId", categoryId);
		param.put("locationId", locationId);
		
		return sqlSession.insert("admin.store.insert", param);
	}
	
}







