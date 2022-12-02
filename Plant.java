package Project_Plant_Vs_Zombies;

public abstract class Plant {

    public int health = 200;

    public int x;
    public int y;

    public Panel p;


    public Plant(Panel parent,int x,int y){
        this.x = x;
        this.y = y;
        p = parent;
    }

    public void stop(){}

}
