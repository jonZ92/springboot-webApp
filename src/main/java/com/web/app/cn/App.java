package com.web.app.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class App {

    public static void main(String[] args) {
        //mvn install:install-file -Dfile=D:\common-mongodb-1.0.jar -DgroupId=com.cnsugar -DartifactId=common -Dversion=1.0 -Dpackaging=jar
        SpringApplication.run(App.class, args);
    }

}
