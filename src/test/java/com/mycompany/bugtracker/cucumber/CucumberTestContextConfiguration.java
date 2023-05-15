package com.mycompany.bugtracker.cucumber;

import com.mycompany.bugtracker.BugTrackerJhipsterApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = BugTrackerJhipsterApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
