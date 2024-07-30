package com.tap;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Launch {
	
	public static void main(String[] args	) {
		
		
Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Projects.class);

		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		
		//using projects getting employeee
	   Projects gd=session.get(Projects.class, 1);
	   List<Employee> li=gd.getEmployee();		
	   System.out.println(gd);
       System.out.println(li);
	  
	  
	
		//ussing employee you get projects 
	    // Employee raj=session.get(Employee.class, 1);
	    // System.out.println(raj);
        // List<Projects>	li=raj.getProjects();
         
        // for(Object p:li) {
        //	 System.out.println(p);
        // }
		
		
		
         //inserting data into database
     	//Employee raj=new Employee(1, "raj");
     	//Employee kumar=new Employee(2, "kumar");
     	
     	
     	//Projects gd=new  Projects(1, "google_dox");
     	//Projects gs=new  Projects(2, "google_slides");
     	
   //List<Projects>  al=new	ArrayList<Projects>();
	//	al.add(gd);
	//	al.add(gs);
		
	//	raj.setProjects(al);
		//kumar.setProjects(al);
		
		
	//	session.save(raj);
	//	session.save(kumar);
		
		//session.save(gd);
		//session.save(gs);
		
		
		trans.commit();
	
	}
	

}