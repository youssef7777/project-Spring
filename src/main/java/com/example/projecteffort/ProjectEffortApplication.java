package com.example.projecteffort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjectEffortApplication implements ApplicationRunner {
    /*
    @Autowired
    private ApplicationContext applicationContext;
    */

    private final ApplicationAvailability availability;

    private static final Logger LOG =  LoggerFactory.getLogger(ProjectEffortApplication.class);



    public static void main(String[] args) {
        SpringApplication.run(ProjectEffortApplication.class, args);
    }

    @Autowired
    public ProjectEffortApplication(ApplicationAvailability availability) {
        this.availability = availability;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*for(String beanName :  applicationContext.getBeanDefinitionNames()){
            LOG.info(beanName);

        }*/

        //ApplicationAvailability availability = applicationContext.getBean(ApplicationAvailability.class);
        LOG.info("Ready:{}, Live:{}", availability.getReadinessState(), availability.getLivenessState());
    }
}
