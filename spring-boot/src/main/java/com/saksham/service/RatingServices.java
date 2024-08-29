package com.saksham.service;

import java.util.List;

import com.saksham.exception.ProductException;
import com.saksham.modal.Rating;
import com.saksham.modal.User;
import com.saksham.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
