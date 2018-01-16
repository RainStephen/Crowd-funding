package com.atguigu.atcrowdfunding.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class MyApplicationListener implements ServletContextListener {

    
    public MyApplicationListener() {
       
    }

	
    public void contextDestroyed(ServletContextEvent arg0)  { }

	//在服务启动时，创建application对象是执行这个方法，
    public void contextInitialized(ServletContextEvent arg0)  {
    	//获取上下文路径放入到域中
    	ServletContext context = arg0.getServletContext();
    	
        context.setAttribute("APP_PATH", context.getContextPath());
    }
	
}
