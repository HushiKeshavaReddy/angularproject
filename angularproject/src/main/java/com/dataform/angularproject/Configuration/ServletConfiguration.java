package com.dataform.angularproject.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;



public class ServletConfiguration implements WebApplicationInitializer
{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException 
	{
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();	
		applicationContext.register(AppConfiguration.class);
		DispatcherServlet servlet = new DispatcherServlet(applicationContext);
		Dynamic dynamic = servletContext.addServlet("dispatch",servlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
	}

}
