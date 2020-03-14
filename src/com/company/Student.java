package com.company;

class Student<T extends Number> implements Learner <T> {
    private T age;
    private T yearOfStudy;

    public Student(T age, T yearOfStudy) {
        this.age = age;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public T getAge() {
        return age;
    }

    @Override
    public T getYearOfStudy() {
        return yearOfStudy;
    }
}

