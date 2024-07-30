package com.tap;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="projects")
public class Projects {
	
	@Id
    @Column(name="id")
	private int id;
	
	@Column(name="pro_name")
	private String proname;
	

	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(name="emp_pro",
			 inverseJoinColumns = @JoinColumn(name="emp_id"),
             joinColumns  = @JoinColumn(name="pro_id")
			  )
       private List<Employee>	employee;
	
	
	public Projects() {
		// TODO Auto-generated constructor stub
	}


	public Projects(int id, String proname) {
		super();
		this.id = id;
		this.proname = proname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProname() {
		return proname;
	}


	public void setProname(String proname) {
		this.proname = proname;
	}
	
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
	public List<Employee> getEmployee() {
		return employee;
	}


	@Override
	public String toString() {
		return "Projects [id=" + id + ", proname=" + proname + "]";
	}
	
	

}
