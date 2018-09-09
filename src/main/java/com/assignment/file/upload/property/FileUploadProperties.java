package com.assignment.file.upload.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix="file")
public class FileUploadProperties {

    private String uploadDir;


}
