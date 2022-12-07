package com.marwen.democicd;

import com.marwen.democicd.controllers.HealthController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class DemoCiCdApplicationTests {

    @Autowired
    HealthController healthController;

    @Test
    void contextLoads() {
        assertThat(healthController).isNotNull();
    }

}
