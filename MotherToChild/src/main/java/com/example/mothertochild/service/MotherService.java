package com.example.mothertochild.service;

import com.example.mothertochild.dto.ResponseDto;

public interface MotherService 
{
	ResponseDto getAllMother();
	
	ResponseDto editMother(long mId, long...cId);
}
