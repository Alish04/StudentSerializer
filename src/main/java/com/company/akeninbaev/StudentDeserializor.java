package com.company.akeninbaev;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentDeserializor extends StdDeserializer<Student> {
    public StudentDeserializor() {
        super(Student.class);
    }

    @Override
    public Student deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        JsonNode root= parser.getCodec().readTree(parser);
        String firstName = root.get("firstName").asText();
        String lastName = root.get("lastName").asText();
        String birthday = root.get("birthday").asText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate bday = LocalDate.parse(birthday,formatter);
        return new Student(firstName, lastName, bday);
    }
}
