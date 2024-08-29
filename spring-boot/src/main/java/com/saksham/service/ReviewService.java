package com.saksham.service;

import java.util.List;

import com.saksham.exception.ProductException;
import com.saksham.modal.Review;
import com.saksham.modal.User;
import com.saksham.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
