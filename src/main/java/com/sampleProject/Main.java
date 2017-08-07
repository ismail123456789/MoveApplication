package com.sampleProject;

import com.sampleProject.model.Student;

/**
 * @author GPayments IT
 */
public class Main {
  public static void main(String[] args) {
    Student student = new Student();
    student.setId(1);
    student.setFirstName("Ali");
    student.setLastName("Ahmadi");
    student.setDescription("Developer");
    System.out.println(student);
  }
}
