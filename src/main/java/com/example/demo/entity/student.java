package com.example.demo.entity;

public class student{
    private int id;
    private String name;
    private String email;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String Name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email=email;
    }

    public student(int id,String name,String email){
        
    }
}