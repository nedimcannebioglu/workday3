package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setUserNumber("1312");
        user1.setId(1);

        Instructor instructor1 = new Instructor();
        instructor1.setGraduation("boğaziçi üniversitesi");

        Student student1 = new Student();
        student1.setUniversity("boğazici universitesi");

        UserManager userManager= new UserManager();
        userManager.show(user1);
        userManager.show(instructor1);
        userManager.show(student1);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);

        InstructorManager instructorManager=new InstructorManager();
        instructorManager.add(instructor1);

        User[] users ={user1,instructor1,student1};
        userManager.showMultiple(users);

    }
}
