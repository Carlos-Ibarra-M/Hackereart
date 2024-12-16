package com.hackerearth.fullstack.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private int marks;
    private int attendance;
    private boolean promotion_status  = false;

    public Student() {
    }
    
    public Student(String name, int age, int marks, int attendance) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.attendance = attendance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
      return name;
    }

    public void setName(String name){
      this.name = name;
    }

    public int getAge(){
      return age;
    }

    public void setAge(int age){
      this.age = age;
    }

    public int getMarks(){
      return marks;
    }

    public void setMarks(int marks){
      this.marks = marks;
    }

    public int getAttendance(){
      return attendance;
    }

    public void setAttendance(int attendance){
      this.attendance = attendance;
    }

    public boolean getPromotion_status(){
      return promotion_status;
    }

    public void setPromotion_status(boolean promotion_status){
      this.promotion_status = promotion_status;
    }

}

