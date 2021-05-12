package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name,int hitPoints, int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> apprearingList=new ArrayList<String>();
        apprearingList.add(0,name);
        apprearingList.add(1,""+hitPoints);
        apprearingList.add(2,""+strength);

        return apprearingList;
    }

    @Override
    public void read(List<String> list) {
        if((list!=null)&&(list.size()>0) ){
            this.name=list.get(0);
            this.hitPoints=Integer.parseInt(list.get(1));
            this.strength=Integer.parseInt(list.get(2));
        }
    }
    @Override
    public String toString() {
        return "Monster{name='"+this.name +"'"+ " , "+ "hitpoints=" + this.hitPoints+" , "+ "strength="+ this.strength+"}";
    }

}