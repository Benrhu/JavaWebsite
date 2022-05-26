package es.Benrhu.website;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import es.Benrhu.website.models.Project;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "redirect:home";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		Project[] projects = new Project[3];

		projects[0] = new Project();
		projects[0].setName("Ovenex");
		projects[0].setSummary("Oven Java Sofware");
		projects[0].setImgSrc("img/Ovenex.jpg");
		projects[0].setUrl("https://github.com/Benrhu");
		
		projects[1] = new Project();
		projects[1].setName("e-Learning Forum");
		projects[1].setSummary("Forum in Java");
		projects[1].setImgSrc("img/elearning.jpg");
		projects[1].setUrl("a");
		
		projects[2] = new Project();
		projects[2].setName("blogJS");
		projects[2].setSummary("A simpleBlog developed in JavaScript");
		projects[2].setImgSrc("img/blogjs.png");
		projects[2].setUrl("https://github.com/Benrhu");

		model.addAttribute("projects", projects);
		return "home";
	}

	@GetMapping("/impressum")
	public String impressum() {
		return "impressum";
	}
}
