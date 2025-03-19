package com.ecom;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CurdClient {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		   Session ses = factory.openSession();
           Transaction tx = ses.beginTransaction();
           
             //insert
	        Product p = new Product();
	        p.setPname("Realme");
	        p.setPrice(30000);
	        ses.save(p);
	        tx.commit();
	        
	       
	}

}
