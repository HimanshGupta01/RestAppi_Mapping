package com.mapping.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_manager")
public class Manager {
	
	@Id
	private String managerId;
	private String managerName;
	
	@OneToMany(mappedBy="manager")
	List<Employee> emp = new ArrayList<>();

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String managerId, String managerName, List<Employee> emp) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.emp = emp;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	

}
