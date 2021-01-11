package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver {
    private final String name;
    private int tasksToReviewCount;

    public Mentor(String name) {
        this.name = name;
        this.tasksToReviewCount = 0;
    }

    @Override
    public void update(StudentQueue studentQueue) {
        int studentTasksCount = studentQueue.getTasks().size();
        String newTask = studentQueue.getTasks().get(studentTasksCount-1);
        System.out.println("New task in queue to review: "+newTask+"\n"+
                " (student total: "+studentTasksCount+" tasks");
        this.tasksToReviewCount++;
    }

    public String getName() {
        return name;
    }

    public int getTasksToReviewCount() {
        return tasksToReviewCount;
    }
}
