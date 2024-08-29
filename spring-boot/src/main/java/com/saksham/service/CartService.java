package com.saksham.service;

import com.saksham.exception.ProductException;
import com.saksham.modal.Cart;
import com.saksham.modal.User;
import com.saksham.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
