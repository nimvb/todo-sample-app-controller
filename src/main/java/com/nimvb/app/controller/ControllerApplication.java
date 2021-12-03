package com.nimvb.app.controller;

import com.nimvb.app.database.Database;
import com.nimvb.app.database.document.Document;
import com.nimvb.app.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication(scanBasePackages = "com.nimvb.app.controller")
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com\\.nimvb\\.app\\.repository\\..*"))
@RequiredArgsConstructor
public class ControllerApplication implements ApplicationRunner {

    private final TodoRepository database;
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        int g = 0;
    }
}
