package com.atguigu.atcrowdfunding.test;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.manager.dao.UserMapper;
import com.atguigu.atcrowdfunding.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserMapperTest {
	


	
	public static void main(String[] args) {
		SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil
				.getSqlSessionFactory();
		System.out.println("sqlSessionFactory = " + sqlSessionFactory);
		SqlSession session = sqlSessionFactory.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);
		for (int i = 0; i <100 ; i++) {
			User user = new User();
			user.setId(100+i);
			user.setLoginacct("user"+i);
			user.setUsername("TEST"+i);
			user.setUserpswd("123");
			user.setCreatetime("2018-01-18 04:19");
			user.setEmail("test"+i+"@sina.com");
			mapper.insert(user);
		}
		session.close();

	}

}
