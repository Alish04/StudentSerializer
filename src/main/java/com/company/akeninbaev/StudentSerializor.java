package com.company.akeninbaev;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class StudentSerializor extends StdSerializer <Student>{
    protected StudentSerializor() {
        super(Student.class);
    }

    @Override
    public void serialize(Student student, JsonGenerator gen, SerializerProvider p) throws IOException {
        gen.writeStartObject();
        gen.writeStringField("firstName", student.getFirstName());
        gen.writeStringField("lastName", student.getLastName());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        gen.writeStringField("birthday", student.getBirthday().format(formatter));
        gen.writeEndObject();
    }
}
