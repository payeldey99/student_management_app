package com.student.student_management_app.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
@Data
public class Student {

    @Id
    private String _id;
    private String studentname;
    private String studentaddress;
    private String mobile;
}