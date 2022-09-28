package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCompanyGstDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Company company=new Company();
		company.setName("priyamani");
		company.setAddress("bangalore");
		
		Gst gst=new Gst();
		gst.setNumber("B52454JSJ");
		gst.setStatus("available");
		gst.setCompany(company);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
		
	}

}
