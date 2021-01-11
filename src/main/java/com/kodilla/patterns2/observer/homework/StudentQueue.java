package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentQueue implements QueueObservable {
    private final String studentName;
    private final MentorObserver mentor;
    private final List<String> tasks;

    public StudentQueue(String studentName, MentorObserver mentor) {
        this.studentName = studentName;
        this.mentor = mentor;
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyMentor();
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void notifyMentor() {
        mentor.update(this);
    }
}
