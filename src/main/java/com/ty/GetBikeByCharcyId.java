package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetBikeByCharcyId {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Charcy charcy=entityManager.find(Charcy.class, 1);
		if(charcy!=null)
		{
			System.out.println("charcy id:"+charcy.getId());
			System.out.println("charcy type:"+charcy.getType());
			
			Bike bike=charcy.getBike();
			if(bike!=null)
			{
				System.out.println("bike id is:"+bike.getId());
				System.out.println("bike name is:"+bike.getName());
				System.out.println("bike price is:"+bike.getPrice());
			}
		}
		else
		{
			System.out.println("bike id is not available");
		}
	}

}
