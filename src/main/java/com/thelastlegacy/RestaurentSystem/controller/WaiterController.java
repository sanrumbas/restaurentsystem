package com.thelastlegacy.RestaurentSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thelastlegacy.RestaurentSystem.model.Waiter;
import com.thelastlegacy.RestaurentSystem.service.ServiceImplementation;

@RestController

@RequestMapping(value="/waiter")
public class WaiterController {
	
	@Autowired
	ServiceImplementation service;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Waiter addWaiter(@RequestBody Waiter waiter)
	{
		Waiter wait=service.addWaiter(waiter);
		return wait;
	}
	
	@RequestMapping(value="/waiters",method=RequestMethod.GET)
	public ResponseEntity<List<Waiter>> getAllWaiter(){
		List<Waiter> wait=service.getAllWaiter();
		if(wait==null){
			return new ResponseEntity<List<Waiter>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Waiter>>(wait,HttpStatus.OK);
	}
	
	@RequestMapping(value="/waiters/findByWaiterId/{id}", method=RequestMethod.GET)
	public ResponseEntity<Waiter> findByWaiterId(@PathVariable int id){
		Waiter wait=service.findByWaiterId(id);
		if(wait==null){
			return new ResponseEntity<Waiter>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Waiter>(wait,HttpStatus.OK);
	}
		
	}
	
	

