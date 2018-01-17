package com.atguigu.atcrowdfunding.test;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.manager.dao.UserMapper;
import com.atguigu.atcrowdfunding.util.SqlSessionFactoryUtil;

public class UserMapperTest {
	
//	SqlSessionFactory sessionFactory;
//	
//	SqlSession session;
//	
//	@Before
//	public void init(){
//		 sessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
//		 System.out.println(sessionFactory);
//		 
//		 session = sessionFactory.openSession();
//	}
//	
//	
//	
//	@Test
//	public void queryUserloginTest(){
//		
//		UserMapper mapper = session.getMapper(UserMapper.class);
//		
//		HashMap<String, Object> map = new HashMap<String,Object>();
//		map.put("loginacct", "zhuima");
//		map.put("userpswd", "123");
//		User user = mapper.queryUserlogin(map);
//		
//		System.out.println(user);
//	}
	
	public static void main(String[] args) {
		SqlSessionFactory sqlSessionFactory2 = SqlSessionFactoryUtil
				.getSqlSessionFactory();
		System.out.println(sqlSessionFactory2);
	}

}
