package org.example;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> humanList;

    public FamilyTree(){
        humanList = new ArrayList<>();
    }
    public void addHuman(Human human){
        humanList.add(human);
    }
    public Human getHumanByfirstName(String firstName){
        for (Human human: humanList){
            if(human.getFirstName().equals(firstName)){
                return human;
            }

        }
        return null;
    }

    public List<Human> getHumanList() {

        return humanList;
    }
    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Human human: humanList){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}

