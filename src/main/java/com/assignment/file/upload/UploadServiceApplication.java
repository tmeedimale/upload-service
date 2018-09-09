package com.assignment.file.upload;

import com.assignment.file.upload.property.FileUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigurationProperties({FileUploadProperties.class})
@EnableEurekaClient
public class UploadServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UploadServiceApplication.class, args);
    }
}
