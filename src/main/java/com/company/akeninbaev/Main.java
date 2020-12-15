package com.company.akeninbaev;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Student student =new Student("Alisher", "Keninbaev", LocalDate.of(2002,10,04));
        ObjectMapper om = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(Student.class, new StudentSerializor());
        om.registerModule(module);
        System.out.println(om.writeValueAsString(student));
    }
}
