/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.hcdc.chemistStore.controller;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Vaibhav
 */
@Controller
public class MainController {
    
   @RequestMapping("/index")
	public String hello() {		
		return "index";
	}
	
}