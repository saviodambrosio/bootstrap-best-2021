package org.generation.italy.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String index(Model model) {
		model.addAttribute("name", "Savio");
		return "index";
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
		model.addAttribute("title", "Movies");
		model.addAttribute("list", Arrays.asList("My Salinger Year", "Palmer", "Blu Bayou", "Cruella", "Percy VS Goliath"));
		return "list";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute("title", "Songs");
		model.addAttribute("list", Arrays.asList("2010 — Earl Sweatshirt", "Keep An Eye on Dan — ABBA","Like I Used To — Sharon Van Etten & Angel Olsen"));
		return "list";
	}
}
