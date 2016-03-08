package com.rain.test;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String firstName, lastName, job, gender;
    private int salary, age;
    
    
    
    static List<Person> javaProgrammers = new ArrayList<Person>() {  
        {  
          add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));  
          add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));  
          add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));  
          add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));  
          add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));  
          add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));  
          add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));  
          add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));  
          add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));  
          add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));  
        }  
      };  
        
      static List<Person> phpProgrammers = new ArrayList<Person>() {  
        {  
          add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));  
          add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));  
          add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));  
          add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));  
          add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));  
          add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));  
          add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));  
          add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));  
          add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));  
          add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));  
        }  
      };  
      
    public static void main(String[] args) {
        System.out.println("工资最低的 Java programmer:");  
        Person pers = javaProgrammers  
                  .stream()  
                  .min((p1, p2) -> (p1.getSalary() - p2.getSalary()))  
                  .get(); 
          
        System.out.printf("Name: %s %s; Salary: $%,d.", pers.getFirstName(), pers.getLastName(), pers.getSalary());  
          
        System.out.println("工资最高的 Java programmer:");  
        Person person = javaProgrammers  
                  .stream()  
                  .max((p1, p2) -> (p1.getSalary() - p2.getSalary()))  
                  .get();
          
        System.out.printf("Name: %s %s; Salary: $%,d.", person.getFirstName(), person.getLastName(), person.getSalary());  
        
        
        System.out.println("计算付给 Java programmers 的所有money:");  
        int totalSalary = javaProgrammers  
                  .parallelStream()  
                  .mapToInt(p -> p.getSalary())  
                  .sum();  
        System.out.println(totalSalary);
        
    }
    
    
    
    
    public Person(String firstName, String lastName, String job, String gender, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}