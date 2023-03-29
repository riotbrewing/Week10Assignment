package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import dmacc.beans.Cast;
import dmacc.repository.CastRepo;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Mar 21, 2023
 */
@Controller
public class WebController {
	@Autowired
	CastRepo repo;
	
	@GetMapping( "/viewCast")
		public String viewAllCast(Model model)
		{
			model.addAttribute("cast", repo.findAll());
			return "results";
		}
	@GetMapping("/addCast")
		public String addNewCastMember(Model model)
		{
			Cast cast = new Cast();
			model.addAttribute("newCast", cast);
			return "addCastMember";
		}
	@GetMapping("/edit/{id}")
	public String showUpdateContact(@PathVariable("id") long id, Model model) {
		Cast cast = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + cast.toString());
		model.addAttribute("newCast", cast);
		return "addCastMember";
	}
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Cast cast = repo.findById(id).orElse(null);
	    repo.delete(cast);
	    return viewAllCast(model);
	}
	
	@PostMapping("/addCast")
	public String addNewCast(@ModelAttribute Cast cast, Model model)
	{	
		repo.save(cast);
		return viewAllCast(model);
	}
	
	@PostMapping("/update/{id}")
	public String reviseCast(Cast cast, Model model) {
		repo.save(cast);
		return viewAllCast(model);
	}
	
}
