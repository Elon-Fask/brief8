package org.brief8.dao;

import org.brief8.models.User;

public interface LoginDao {

	public abstract void login(User user);
	public abstract void singup(User user);
	
	
}
