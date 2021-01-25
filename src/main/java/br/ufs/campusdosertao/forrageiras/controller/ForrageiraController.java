package br.ufs.campusdosertao.forrageiras.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.ufs.campusdosertao.forrageiras.entity.Forrageira;
import br.ufs.campusdosertao.forrageiras.repository.ForrageiraRepository;

@Controller
@RequestMapping("/forrageiras")
public class ForrageiraController {
	
	//OBS: BREAD (browse, read, edit, add, delete)
	
	private final ForrageiraRepository forrageiraRepository;
	private final String FORRAGEIRA_URI = "forrageira/";
	
	public ForrageiraController (ForrageiraRepository forrageiraRepository) {
		this.forrageiraRepository = forrageiraRepository;
	}
	
	@GetMapping("/")
	public ModelAndView index(@ModelAttribute Forrageira forrageira) {
		return new ModelAndView(FORRAGEIRA_URI+"form","forrageiras",forrageiras());
	}
	
	@PostMapping(params = "form")
	public ModelAndView add(@Valid Forrageira forrageira, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("forrageira/form");
			mv.addObject("formErrors", result.getAllErrors());
			mv.addObject("forrageiras", forrageiras());
			return mv;
		}
		forrageira = this.forrageiraRepository.save(forrageira);
		redirect.addFlashAttribute("globalMessage", "Forrageira cadastrada!");
		return new ModelAndView("redirect:/forrageiras/");
	}
	
	@GetMapping("/d/{id}")
	public ModelAndView delete(@PathVariable("id") Long id, RedirectAttributes redirect) {
		this.forrageiraRepository.deleteById(id);
		redirect.addFlashAttribute("globalMessage", "Forrageira removida!");
		return new ModelAndView("redirect:/forrageiras/");		
	}
	
	@GetMapping("/e/{id}")
	public ModelAndView edit(@PathVariable("id") Forrageira forrageira, RedirectAttributes redirect) {
		ModelAndView mv = new ModelAndView("forrageira/form");
		mv.addObject("forrageira", forrageira);
		mv.addObject("forrageiras", forrageiras());
		mv.addObject("isEdit", true);
		return mv;
	}
	
	public Iterable<Forrageira> forrageiras() {
		return this.forrageiraRepository.findAll();
	}
	
}
