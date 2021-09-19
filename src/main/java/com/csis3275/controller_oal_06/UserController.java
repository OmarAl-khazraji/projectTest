package com.csis3275.controller_oal_06;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.csis3275.model_oal_06.user_oal_06;

public class UserController {
	
	@Controller
	public class UserController_rkv_86 {

		@RequestMapping("/")
		public String userRegistrationForm(ModelMap model) {
			model.addAttribute("newUser", new user_oal_06());
			return "registrationForm";
		}

		@PostMapping("/register")
		public String registerUser(@Valid @ModelAttribute("newUser") user_oal_06 registerdUser, BindingResult result,
				ModelMap model) {

			model.addAttribute("newUser", registerdUser);
			
			//If the form had validation errors
			if (result.hasErrors()) {
				return "registrationForm";
			} else {
				return "congratulationsForm";
			}
	}
	}
}
