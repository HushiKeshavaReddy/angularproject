package com.dataform.angularproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataform.angularproject.Dto.DataSourceDto;
import com.dataform.angularproject.Entity.DataSourceform;
import com.dataform.angularproject.Services.datasourceService;

@RestController
public class datasourceController 
{
	@Autowired
    datasourceService dataservice;
	
	@PostMapping(value ="/savedatainformation")
	public void savedatasourcedetails(@RequestBody DataSourceform datasource)
	{
		dataservice.savedatasourceDetails(datasource);
	}
	
	@GetMapping(value ="/getdatasourcedetails")
	public @ResponseBody List<DataSourceform> getAll()
	{
		return dataservice.getAll();
	}
	
	@PostMapping(value="")
	public void UpdateAndPasswordById(DataSourceDto dto)
	{
		dataservice.UpdateAndPasswordById(dto);
	}
}
