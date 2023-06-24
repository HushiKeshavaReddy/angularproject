package com.dataform.angularproject.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="DataSourceForm")
public class DataSourceform implements Serializable
{
	@Id
	@GenericGenerator(name ="automatic",strategy ="increment")
	@GeneratedValue(generator ="automatic")
	@Column(name="alt_key")
	private int id;
	
	@Column(name ="db_name")
	private String dbname;
	
	@Column(name ="host")
	private String host;
	
	@Column(name="username")
	private String username;
	
	@Column(name ="password")
	private String password;
	
	@Column(name="dbtype")
	private String dbtype;
	
	@Column(name ="port")
	private String port;

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDbtype() {
		return dbtype;
	}

	public void setDbtype(String dbtype) {
		this.dbtype = dbtype;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
