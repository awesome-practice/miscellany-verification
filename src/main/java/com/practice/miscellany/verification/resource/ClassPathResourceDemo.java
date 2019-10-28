package com.practice.miscellany.verification.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.net.URL;

public class ClassPathResourceDemo {
    public static void main(String[] args) throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("application.yaml");
        String path = classPathResource.getPath();
        URL url = classPathResource.getURL();
        String path1 = url.getPath();
        System.out.println("path = " + path);
        System.out.println("path1 = " + path1);

        String absolutePath = classPathResource.getFile().getAbsolutePath();
        System.out.println("absolutePath = " + absolutePath);

        /*
path = application.yaml
path1 = /D:/Practice/miscellany-verification/target/classes/application.yaml
absolutePath = D:\Practice\miscellany-verification\target\classes\application.yaml
        * */
    }
}