package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBikeCharcy {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.setName("bullet");
		bike.setPrice(25000.00);
		
		
		Charcy charcy=new Charcy();
		charcy.setType("bike type");
		charcy.setBike(bike);
		bike.setCharcy(charcy);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bike);
		entityManager.persist(charcy);
		entityTransaction.commit();
	}

}
