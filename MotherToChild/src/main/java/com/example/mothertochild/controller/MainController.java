package com.example.mothertochild.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mothertochild.dto.ResponseDto;
import com.example.mothertochild.model.Mother;
import com.example.mothertochild.service.ChildService;
import com.example.mothertochild.service.MotherService;

@Controller
public class MainController 
{
	@Autowired
	MotherService motherservice;
	
	@Autowired
	ChildService childservice;
	
	@GetMapping("/allMother")
	@ResponseBody
	public ResponseDto findAllMother()
	{
		return motherservice.getAllMother();
	}
	
	@GetMapping("/allChild")
	@ResponseBody
	public ResponseDto findAllChild()
	{
		return childservice.findAllChild();
	}
	
	@PutMapping("/edtMother")
	@ResponseBody
	public ResponseDto edtMother(@RequestParam("mother_id") long mId, @RequestParam("child_id") long...cId)
	{
		return motherservice.editMother(mId, cId);
	}
}
