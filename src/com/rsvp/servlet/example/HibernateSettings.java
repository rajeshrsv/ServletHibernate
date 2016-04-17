package com.rsvp.servlet.example;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateSettings {

	public static final SessionFactory SESSION_FACTORY;

	static {
		try {
			SESSION_FACTORY = new AnnotationConfiguration().configure().buildSessionFactory();
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static Session getSession() throws HibernateException {
		return SESSION_FACTORY.openSession();
	}

}
