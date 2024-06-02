package com.example.springbootfileuploadrestapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.springbootfileuploadrestapi.playload.FileResponse;
import com.example.springbootfileuploadrestapi.services.FileService;

@RestController
@RequestMapping("/file")
public class FileController {
	@Autowired
	private FileService fileService;
	
	@Value("${project.image}")
	private String path;
	
	@PostMapping("/upload")
	public ResponseEntity<FileResponse> fileUpload(@RequestParam("image") MultipartFile image) {
		String filename = "";
		filename = this.fileService.uploadFile(path, image);		
		return new ResponseEntity<FileResponse>(new FileResponse(filename, "file uploaded"), HttpStatus.OK);
	}
}










