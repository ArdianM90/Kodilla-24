package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor mentor1 = new Mentor("mentor 1");
        Mentor mentor2 = new Mentor("mentor 2");
        StudentQueue student1 = new StudentQueue("student 1", mentor1);
        StudentQueue student2 = new StudentQueue("student 2", mentor2);
        StudentQueue student3 = new StudentQueue("student 3", mentor2);

        //When
        student1.addTask("Task");
        student1.addTask("Task");
        student2.addTask("Task");
        student3.addTask("Task");
        student3.addTask("Task");

        //Then
        assertEquals(2, mentor1.getTasksToReviewCount());
        assertEquals(3, mentor2.getTasksToReviewCount());
    }

}