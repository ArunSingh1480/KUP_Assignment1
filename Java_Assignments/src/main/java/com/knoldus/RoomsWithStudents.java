package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;

public class RoomsWithStudents {
    public void Condition3() {
        List<ClassRoom> res = Data_All.ClassList().stream().filter(obj -> obj.getStudentList().isPresent()).collect(Collectors.toList());
        res.forEach(obj -> System.out.println("Room" + obj.getRoomId() + " --->  Hello Students"));
    }
}
