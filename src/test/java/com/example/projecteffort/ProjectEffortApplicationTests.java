package com.example.projecteffort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectEffortApplicationTests {

    @Autowired
    private ProjectEffortApplication app;
    @Test
    void ShouldBeNotNull() {
        Assertions.assertNotNull(app);
    }

}
