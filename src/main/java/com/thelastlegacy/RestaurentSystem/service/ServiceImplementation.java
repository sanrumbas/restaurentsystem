package com.thelastlegacy.RestaurentSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thelastlegacy.RestaurentSystem.model.Waiter;

@Service
public class ServiceImplementation implements DefaultService {

	List<Waiter> waiterList=new ArrayList<>();
	@Override
	public Waiter addWaiter(Waiter waiter) {
		
		waiterList.add(waiter);
		return waiter;
	}

	@Override
	public List<Waiter> getAllWaiter() {
		return waiterList;
	}

	@Override
	public Waiter findByWaiterId(int id) {
		Waiter waiter=null;
		for(Waiter w:waiterList){
			if(id==w.getWaiterId()){
				waiter=w;
			}
		}
		return waiter;
	}
	

}
