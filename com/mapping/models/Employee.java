package com.mapping.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_emp")
public class Employee {
	
	@Id
	private String EmpId;
	private String empName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Manager manager;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String empName, Manager manager) {
		super();
		EmpId = empId;
		this.empName = empName;
		this.manager = manager;
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	
}
