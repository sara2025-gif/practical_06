
package com.example.StudentMongodb.Repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.StudentMongodb.Model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByYearOfEnrollment(int year);

    @Query(value = "{ '_id': ?0 }", fields = "{ 'department': 1 }")
    String findDepartmentByStudentId(String id);

    void deleteByYearOfEnrollment(int year);

   

}
