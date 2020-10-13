package com.cetc32.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.hibernate.validator.constraints.Email;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Copyright(C),2019-2020,CETC-32
 * FileName:Person
 * Author:  xinyijie
 * Date:    2020/10/1210:45
 * Describtion:人的属性描述
 * 将配置文件的每一个属性值，映射到这个组件中
 * @configurationProperties: 告诉SpringBoot将本类中的所有属性和配置文件相关的配置进行绑定；
 *      prefix = “person";配置文件
 *
 *      只有这个组件是容器中的组件，才能使用容器提供的@configurationProperties功能。
 * History:
 * <author>    <time>    <version>    <desc>
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    //@Value("${person.last-name}")
    @Email
    private String lastName;
    //@Value("#{11*2}")
    private Integer age;
    //@Value("true")
    private Boolean boss;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
