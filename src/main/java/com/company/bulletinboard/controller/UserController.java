package com.company.bulletinboard.controller;

import com.company.bulletinboard.model.User;
import com.company.bulletinboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/")
	public String main() {
		return "redirect:/advertisements";
	}

	@GetMapping("/account")
	public String account() {
		return "account";
	}



	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@RequestParam("user_id") long id,
							   @RequestParam("first_name") String firstName,
							   @RequestParam("email") String email,
							   @RequestParam("password") String password) {
		User user = userRepository.findById(id);
		user.setFirstName(firstName);
		user.setEmail(email);
		user.setPassword(password);
		userRepository.save(user);
		return new ModelAndView("redirect:/advertisements");
	}

	@RequestMapping(value = "/account/{id}/", method = RequestMethod.GET)
	public String edit(@PathVariable long id,
					   Model model) {
		User user = userRepository.findById(id);
		model.addAttribute("user", user);
		return "account";
	}
}
