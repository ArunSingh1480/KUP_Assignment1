package com.knoldus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Data_All {

    static Student student1 = new Student("Arun", 9001, Optional.of(Arrays.asList("Software Testing", "Computer Graphics")));
    static Student student2 = new Student("Divya", 9002, Optional.of(Arrays.asList("Compiler Design", "Software Engineering", "Computational Maths")));
    static Student student3 = new Student("Akash", 9003, Optional.of(Arrays.asList("Docker", "NPM", "Html")));
    static Student student4 = new Student("Shreya", 9004, Optional.of(Arrays.asList("Node Js", "Linux")));
    static Student student5 = new Student("Ankita", 9005, Optional.of(Arrays.asList("C#", "Docker", "Java", "C++")));
    static Student student6 = new Student("Manish", 9006, Optional.ofNullable(null));
    static Student student7 = new Student("Amit", 9007, Optional.ofNullable(null));


    public static List<Student> StudentList() {

        List<Student> st = new ArrayList<Student>();
        st.add(student1);
        st.add(student2);
        st.add(student3);
        st.add(student4);
        st.add(student5);
        st.add(student6);
        st.add(student7);

        return st;
    }


    public static List<ClassRoom> ClassList() {

        ClassRoom c1 = new ClassRoom("xyz", Optional.of(Arrays.asList(student1, student2)));
        ClassRoom c2 = new ClassRoom("xuv", Optional.of(Arrays.asList(student3, student4)));
        ClassRoom c3 = new ClassRoom("cde", Optional.of(Arrays.asList(student5, student6)));
        ClassRoom c4 = new ClassRoom("lmn", Optional.ofNullable(null));

        List<ClassRoom> cls = new ArrayList<ClassRoom>();
        cls.add(c1);
        cls.add(c2);
        cls.add(c3);
        cls.add(c4);
        return cls;
    }
}
