package com.saksham.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.saksham.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
