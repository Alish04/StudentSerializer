package com.company.akeninbaev;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main2 {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"firstName\":\"Alisher\",\"lastName\":\"Keninbaev\",\"birthday\":\"2002-04-10\"}";
        ObjectMapper m = new ObjectMapper();
        Student employee = m.readValue(json, Student.class);
    }
}
