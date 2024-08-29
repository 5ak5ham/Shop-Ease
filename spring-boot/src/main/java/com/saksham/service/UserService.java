package com.saksham.service;

import com.saksham.exception.UserException;
import com.saksham.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
