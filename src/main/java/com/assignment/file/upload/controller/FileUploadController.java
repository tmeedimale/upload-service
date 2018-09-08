package com.assignment.file.upload.controller;

import com.assignment.file.upload.resource.UploadFile;
import com.assignment.file.upload.service.FileUploadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Slf4j
@RestController
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/upload/file")
    public ResponseEntity<UploadFile> uploadFile(@RequestParam("userFile") MultipartFile file) {

        String fileName = fileUploadService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

       UploadFile uploadFile= new UploadFile(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        return new ResponseEntity<>(uploadFile, HttpStatus.OK);

    }


}
