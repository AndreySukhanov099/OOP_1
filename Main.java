package org.example;

import static org.example.Gender.*;

public class Main {
    public static void main(String[] args){
        Human human1 = new Human(1, "Андрей","Иванов", "Николаевич", MALE, "19.12.1960",null,null);
        Human human2 = new Human(2, "Ольга","Иванова", "Егоровна",FEMALE,"29.07.1963",null,null);
        Human human3 = new Human(3, "Денис","Иванов", "Андреевич",MALE, "30.11.1990", human2, human1);
        Human human4 = new Human(4, "Дарья","Иванова", "Андреевна",FEMALE,"8.02.2000", human2, human1);
        FamilyTree familyTree = new FamilyTree();
        familyTree.addHuman(human1);
        familyTree.addHuman(human2);
        familyTree.addHuman(human3);
        familyTree.addHuman(human4);
        System.out.println("Список людей:");
        System.out.println(familyTree.getInfo());
    }
}