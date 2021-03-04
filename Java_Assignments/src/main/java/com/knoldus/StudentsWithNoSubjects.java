package com.knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsWithNoSubjects {
    public String Condition() {
        List<Student> s = Data_All.StudentList().stream().filter(obj -> obj.getSubject().isEmpty()).collect(Collectors.toList());

        List<String> Student_names = new ArrayList<String>();

        for (Student t : s) {

            Student_names.add(t.getName());

        }
        return " The students associated with a room that have no subjects =" + Student_names;
    }

}
