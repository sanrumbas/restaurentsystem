package com.thelastlegacy.RestaurentSystem.service;

import java.util.List;

import com.thelastlegacy.RestaurentSystem.model.Waiter;

public interface DefaultService {
	
	Waiter addWaiter(Waiter waiter);
	List<Waiter> getAllWaiter();
	Waiter findByWaiterId(int id);

	
	

}
