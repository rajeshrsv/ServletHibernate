package com.rsvp.servlet.example;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class AuthDAO implements AuthService {

	@Override
	public Boolean authCheck(User user) {

		Session session = HibernateSettings.getSession();
		Criteria cr = session.createCriteria(User.class);
		return cr.list().isEmpty() ? false : true;
	}

	@Override
	public Boolean authForgotUserName(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean authForgotPassword(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
