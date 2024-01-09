package com.example.mothertochild.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mothertochild.dto.ResponseDto;
import com.example.mothertochild.model.Child;
import com.example.mothertochild.model.Mother;
import com.example.mothertochild.repository.ChildRepo;
import com.example.mothertochild.repository.MotherRepo;

@Service
public class MotherServiceImpl implements MotherService
{
	@Autowired
	MotherRepo motherRepo;
	
	@Autowired
	ChildRepo childRepo;
	
	ResponseDto response = new ResponseDto();
	
	private void setResponseData(int status, String message, Object data)
	{
		response.setStatus(status);
		response.setMessage(message);
		response.setData(data);
	}

	@Override
	public ResponseDto getAllMother() {
		// TODO Auto-generated method stub
		setResponseData(200, "All Mothers", motherRepo.findAll());
		return response;
	}

	@Override
	public ResponseDto editMother(long mId, long... cId) {
		// TODO Auto-generated method stub
		Mother mother = motherRepo.findById(mId).get();
		List<Child> childs = new ArrayList<>();
		for(long i:cId)
		{
			Child child = childRepo.findById(i).get();
			childs.add(child);
			child.setMother(mother);
		}
		mother.setChilds(childs);
		setResponseData(200, "Mother Edited", motherRepo.save(mother));
		return response;
	}
}
