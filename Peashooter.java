import java.awt.event.ActionEvent;
import javax.swing.*;
// created by Bill Ngoc Hoa

public class Peashooter extends Plant { //a kind of Plant

    public Timer shootTimer;


    public Peashooter(GamePanel parent,int x,int y) {
        super(parent,x,y);
        shootTimer = new Timer(2000,(ActionEvent e) -> {
            //System.out.println("SHOOT");
            if(gp.laneZombies.get(y).size() > 0) {
                gp.lanePeas.get(y).add(new Pea(gp, y, 103 + this.x * 100)); //shoot
            }
        });
        shootTimer.start();
    }

    @Override
    public void stop(){     //override Plant
        shootTimer.stop();
    }

}