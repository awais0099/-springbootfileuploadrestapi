package com.example.springbootfileuploadrestapi.playload;

public class FileResponse {
	String fileName;
	String message;
	
	public FileResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileResponse(String fileName, String message) {
		super();
		this.fileName = fileName;
		this.message = message;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "FileResponse [fileName=" + fileName + ", message=" + message + "]";
	}
}
