package com.dataform.angularproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataform.angularproject.Dto.DataSourceDto;
import com.dataform.angularproject.Entity.DataSourceform;
import com.dataform.angularproject.repository.datasourceRepository;

@Service
public class datasourceService 
{
	@Autowired
	datasourceRepository datarepository;
	
	public void savedatasourceDetails(DataSourceform datasource)
	{
		datarepository.savedatasourcedetails(datasource);
	}
	
	public  List<DataSourceform> getAll()
	{
		
		return null;
	}
	
	public void UpdateAndPasswordById(DataSourceDto dto)
	{
		datarepository.UpdateAndPasswordById(dto);
	}
}
