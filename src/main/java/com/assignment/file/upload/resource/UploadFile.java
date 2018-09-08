package com.assignment.file.upload.resource;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UploadFile {
    private String name;
    private String downloadUri;
    private String type;
    private long size;
}
