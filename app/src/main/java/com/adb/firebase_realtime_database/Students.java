package com.adb.firebase_realtime_database;

public class Students {

    String id;
    String name;
    String rollno;
    String email;
    String course;

    public Students() {
    }

    public Students(String id,String name, String rollno, String email, String course) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.email = email;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRollno() {
        return rollno;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }
}