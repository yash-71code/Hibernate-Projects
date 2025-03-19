package com.gym;

public class UserImplemention implements IUser {
	private User users[];
	UserImplemention(){
		users = new User[5];
	}

	@Override
	public String register(User user, int index) {
		System.out.println("user info is:"+user);
		users[index] = user;
		return "Thank You Your Details are With Us !";
	}

	@Override
	public boolean login(String username, String password) {
		System.out.println("user username and password is:"+username+" "+password);
		for(User user:users)
		{
			if(user!=null)
			{
				if(user.getUserName().equals(username) && user.getPassword().equals(password))
				{
					return true;
				}
			}
		}
		return false;
	}

	

}
