package com.dataform.angularproject.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dataform.angularproject.Configuration.AES;
import com.dataform.angularproject.Configuration.AppConstants;
import com.dataform.angularproject.Dto.DataSourceDto;
import com.dataform.angularproject.Entity.DataSourceform;

@Repository
public class datasourceRepository 
{
	@Autowired
	SessionFactory sessionfactory;
	
	public void savedatasourcedetails(DataSourceform datasource)
	{
		Session session = sessionfactory.openSession();
		
		Transaction transaction= session.beginTransaction();
		
		     String encrypt= AES.encrypt(datasource.getPassword(),AppConstants.SECRETKEY);
		      
		     datasource.setPassword(encrypt);
		session.save(datasource);
		
		transaction.commit();
	}
	
	public  List<DataSourceform> getAll()
	{
		Session session = sessionfactory.openSession();
		
		Query query = session.createQuery("from DataSourceform");
		
	    return query.getResultList();
	    
	    
	}
	
	public void UpdateAndPasswordById(DataSourceDto dto)
	{
		Session session = sessionfactory.openSession();
		
		
	}
}
