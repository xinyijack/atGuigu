package com.cetc32.springboot;

import com.cetc32.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * spring-boot单元测试
 *
 * 可以在测试期间很方便的进行编码的自动注入的容器功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot01HelloworldQuickApplicationTests {

    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
