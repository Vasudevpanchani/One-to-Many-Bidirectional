package com.example.mothertochild.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mothertochild.dto.ResponseDto;
import com.example.mothertochild.repository.ChildRepo;

@Service
public class ChildServiceImpl implements ChildService
{
	@Autowired
	ChildRepo childrepo;
	
	ResponseDto response = new ResponseDto();
	
	private void setResponseData(int status, String message, Object data)
	{
		response.setStatus(status);
		response.setMessage(message);
		response.setData(data);
	}

	@Override
	public ResponseDto findAllChild() {
		// TODO Auto-generated method stub
		setResponseData(200, "All Childs", childrepo.findAll());
		return response;
	}
}
