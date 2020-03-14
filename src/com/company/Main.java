package com.company;

public class Main {

    public static void main(String[] args) {
        Student <Integer> student1 = new Student(18, 1);
        Student <Integer> student2 = new Student( 20, 3);
        System.out.println("Возраст студента: "+student1.getAge()+" "+"Год обучения: "+student1.getYearOfStudy());
        System.out.println("Возраст студента: "+student2.getAge()+" "+"Год обучения: "+student2.getYearOfStudy());

    }
}
