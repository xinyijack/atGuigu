package com.cetc32.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Copyright(C),2019-2020,CETC-32
 * FileName:Dog
 * Author:  xinyijie
 * Date:    2020/10/1211:02
 * Describtion:小狗的描述类
 * History:
 * <author>    <time>    <version>    <desc>
 */
//@Component
//@ConfigurationProperties(prefix = "dog")
public class Dog {
        private Integer age;
        private String name;

        @Override
        public String toString() {
                return "Dog{" +
                        "age=" + age +
                        ", name='" + name + '\'' +
                        '}';
        }

        public Integer getAge() {
                return age;
        }

        public void setAge(Integer age) {
                this.age = age;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }
}

