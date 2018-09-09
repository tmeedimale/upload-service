package com.assignment.file.upload.controller;

import com.assignment.file.upload.service.FileUploadService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FileUploadControllerTest {

    private static final String FILE_NAME="testFile";

   @Mock
    private FileUploadService fileUploadService;

    @InjectMocks
    private FileUploadController fileUploadController;

    @Test
    public void testUploadFile() throws Exception {

        when(fileUploadService.storeFile(isA(MultipartFile.class))).thenReturn(FILE_NAME);
        assertNotNull(fileUploadController.uploadFile(buildMultiPartFile()));
    }

    private MultipartFile buildMultiPartFile() throws Exception {
    return new MockMultipartFile("json", "", "application/json", "{\"json\": \"someValue\"}".getBytes());
    }
}