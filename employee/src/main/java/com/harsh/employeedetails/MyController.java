package com.harsh.employeedetails;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@Autowired
	EmployeeRepo repo;
	@RequestMapping("/")
	public String homeMethod()
	{
		return "index";
	}
	@RequestMapping("addEmp")
	public String addEmpMethod(@ModelAttribute Employee a )
	{
		repo.save(a);
		return "result";
	}
	@RequestMapping("getByID")
	public String getByIDMethod(@RequestParam("uid") int uid, Model m)
	{
		m.addAttribute("results", repo.findById(uid));
		return "show";
	}
	@RequestMapping("getByUname")
	public String getByUnameMethod(@RequestParam("uname") String uname,Model m)
	{
		ArrayList<Employee> e=repo.findAllByUname(uname);
		m.addAttribute("results", e);
		return "show";
	}
	@RequestMapping("getAllEmps")
	public String getAllEmpsMethod(Model m)
	{
		m.addAttribute("results", repo.findAll());
		return "show";
	}
	@RequestMapping("updateByuid")
	public String updateNameMethod(@RequestParam("uid") int uid, @RequestParam("newuname")String newuname,Model m)
	{
		 repo.updateUnameByUid(newuname, uid);
		m.addAttribute("results" , "updated Successfully");
		return "show";
	}
}
