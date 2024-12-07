
package com.example.StudentMongodb.Model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Document(collection="students")
@Data
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String  department;
    private int yearOfEnrollment;

}
