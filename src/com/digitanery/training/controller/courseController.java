package com.digitanery.training.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Azzam Abu Msameh
 *
 */
@RestController
@ControllerAdvice
public class courseController {
	
	public void print() {
		
		System.out.println("Azzam Jamal Mousa Abu Msameh Form Controller !!!!!!");
	}

}
