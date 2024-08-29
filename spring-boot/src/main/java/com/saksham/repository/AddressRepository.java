package com.saksham.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saksham.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
