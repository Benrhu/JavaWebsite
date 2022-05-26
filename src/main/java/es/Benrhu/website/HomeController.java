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
		Project[] projects = new Project[5];

		projects[0] = new Project();
		projects[0].setName("Ovenex");
		projects[0].setSummary("Oven Java Sofware");
		projects[0].setImgSrc("img/ovenex.png");
		projects[0].setUrl("https://github.com/Benrhu");
		
		projects[1] = new Project();
		projects[1].setName("e-Learning Forum");
		projects[1].setSummary("Forum in Java");
		projects[1].setImgSrc("img/forum.png");
		projects[1].setUrl("a");
		
		projects[2] = new Project();
		projects[2].setName("Hola Hola");
		projects[2].setSummary("Language");
		projects[2].setImgSrc("img/hola.png");
		projects[2].setUrl("https://github.com/Benrhu");
		
		projects[3] = new Project();
		projects[3].setName("FreudBot");
		projects[3].setSummary("Unity, game, C#, mobile, localization, test automation, gameplay");
		projects[3].setImgSrc("img/freudbot.png");
		projects[3].setUrl("a");

		projects[4] = new Project();
		projects[4].setName("EMERGENCY HQ");
		projects[4].setSummary("Unity, game, C#, online, frontend, mobile, UI, billing");
		projects[4].setImgSrc("img/emhq.png");
		projects[4].setUrl("https://apps.apple.com/us/app/emergency-hq/id859148736");

		Collections.reverse(Arrays.asList(projects)); 

		model.addAttribute("projects", projects);
		return "home";
	}

	@GetMapping("/impressum")
	public String impressum() {
		return "impressum";
	}
}
