package com.example.springbootfileuploadrestapi.services;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	
	public String uploadFile(String path, MultipartFile file);
}
