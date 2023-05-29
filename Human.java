package org.example;

public class Human {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Gender gender;
    private String dateOfBirth;
    private Human mother;
    private Human father;
    
    
    

    Human(int id, String firstName, String lastName, String patronymic,Gender gender, String dateOfBirth,Human mother,Human father){
        this.id = id;
        this.firstName = firstName;
        this.lastName =lastName;
        this.patronymic = patronymic;
        this.gender= gender;
        this.dateOfBirth = dateOfBirth;
        this.father = father;
        this.mother = mother;
       
    }
   
    public String toString(){
        return   " id- " + id + " ФИО-" + lastName + " " + firstName + " " + patronymic + " " + "пол " + gender + " дата рождения- " + dateOfBirth + "\n" +"родители: Отец- " + father + "\n" + " Мать- " + mother;
    }
  
}
