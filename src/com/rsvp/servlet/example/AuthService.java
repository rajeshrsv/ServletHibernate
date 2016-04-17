package com.rsvp.servlet.example;

public interface AuthService {

	Boolean authCheck(User user);

	Boolean authForgotUserName(User user);

	Boolean authForgotPassword(User user);
}
