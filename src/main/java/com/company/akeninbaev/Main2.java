package com.company.akeninbaev;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class Main2 {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"firstName\":\"Alisher\",\"lastName\":\"Keninbaev\",\"birthday\":\"04-окт.-2002\"}";
        ObjectMapper om = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Student.class, new StudentDeserializor());
        om.registerModule(module);
        Student student = om.readValue(json, Student.class);
    }
}
