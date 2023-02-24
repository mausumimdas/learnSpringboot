package com.in28Minutes.todoApp;

import java.time.LocalDate;

public class ToDo {
    private int ID;
    private String userName;
    private String toDoName;
    private LocalDate targetDate;

    private boolean IsCompleted;


    @Override
    public String toString() {
        return "ToDo{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", toDoName='" + toDoName + '\'' +
                ", targetDate=" + targetDate +
                ", IsCompleted=" + IsCompleted +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToDoName() {
        return toDoName;
    }

    public void setToDoName(String toDoName) {
        this.toDoName = toDoName;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isCompleted() {
        return IsCompleted;
    }

    public void setCompleted(boolean completed) {
        IsCompleted = completed;
    }


    public ToDo(int ID, String userName, String toDoName, LocalDate targetDate, boolean isCompleted) {
        this.ID = ID;
        this.userName = userName;
        this.toDoName = toDoName;
        this.targetDate = targetDate;
        IsCompleted = isCompleted;
    }
}
