package fr.hummaction.inventaire.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.hummaction.inventaire.entity.Aliment;
import fr.hummaction.inventaire.service.AlimentService;

@Controller
@RequestMapping("/aliments")
public class AlimentController {
	
	private AlimentService alimentService;
	
	public AlimentController(AlimentService theAlimentService) {
		alimentService = theAlimentService;
	}
	
	@GetMapping("/list")
	public String showListAlimentsPage(Model theModel) {
		List<Aliment> theAliments = alimentService.findAll();
		theModel.addAttribute("aliments", theAliments);
		return "aliments/list-aliments";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Aliment theAliment = new Aliment();
		theModel.addAttribute("aliment", theAliment);
		return "aliments/aliment-form";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("alimentId") int theId, Model theModel) {
		Aliment theAliment = alimentService.findById(theId);
		theModel.addAttribute("aliment", theAliment);
		return "aliments/aliment-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("alimentId") int theId) {
		alimentService.deleteById(theId);
		return "redirect:/aliments/list";
	}
	
	@PostMapping("/save")
	public String saveAliment(@ModelAttribute("aliment") Aliment theAliment) {
		alimentService.save(theAliment);
		return "redirect:/aliments/list";
	}

}
