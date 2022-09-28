package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetPersonById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		/**
		 * Query q=entityManager.createQuery("select p from Person p WHERE id=?1");
		 * q.setParameter(1, 2); List<Person> al=q.getResultList(); for(Person per:al) {
		 * System.out.println("person id:"+per.getId()); System.out.println("person
		 * name:"+per.getName()); System.out.println("person gender:"+per.getGender());
		 * System.out.println("person pan id:"+per.getPan()); }
		 **/
		Pan pan = entityManager.find(Pan.class, 3);
		if (pan != null) {
			System.out.println("******pan info********");
			System.out.println("pan id:" + pan.getId());
			System.out.println("pan number:" + pan.getNumber());
			System.out.println("pan type:" + pan.getType());
			// System.out.println("person pan id:"+person.getPan());
            Person person=pan.getPerson();
			
			if (person != null) {
				System.out.println("******person info********");
				System.out.println("person id:" + person.getId());
				System.out.println("person name:" + person.getName());
				System.out.println("person gender:" + person.getGender());
			}

		}
	}

}
