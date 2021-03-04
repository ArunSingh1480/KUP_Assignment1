package com.knoldus;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Part-1");
        StudentsWithNoSubjects obj = new StudentsWithNoSubjects();
        System.out.println(obj.Condition());
        System.out.println("Part-2");
        SubjectsInUniqueRoomId obj1 = new SubjectsInUniqueRoomId();
        System.out.println(obj1.Condition2());
        System.out.println("Part-3");
        RoomsWithStudents obj2 = new RoomsWithStudents();
        obj2.Condition3();

    }
}
