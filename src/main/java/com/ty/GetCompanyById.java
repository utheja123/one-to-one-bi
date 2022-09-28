package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetCompanyById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Gst gst=entityManager.find(Gst.class, 5);
		if(gst!=null)
		{
			System.out.println("******gst info******");
			System.out.println("gst id:"+gst.getId());
			System.out.println("gst number:"+gst.getNumber());
			System.out.println("gst status:"+gst.getStatus());
			Company company=gst.getCompany();
			if(company!=null)
			{
				System.out.println("******company*****");
				System.out.println("company id:"+company.getId());
				System.out.println("company name:"+company.getName());
				System.out.println("company address:"+company.getAddress());
			}
		}
		else
		{
			System.out.println("unable to find gst id");
		}
	}

}
