package com.assignment.file.upload.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

    String storeFile(MultipartFile multipartFile);
}
