import java.awt.event.ActionEvent;
import javax.swing.*;

public class FreezePeashooter extends Plant {

    public Timer shootTimer;

    public FreezePeashooter(Panel parent, int x, int y) {
        super(parent, x, y);
        shootTimer = new Timer(2000, (ActionEvent e) -> {
            // System.out.println("SHOOT");
            if (p.ZombiesLane.get(y).size() > 0) {
                p.PeasLane.get(y).add(new FreezePea(p, y, 103 + this.x * 100));
            }
        });
        shootTimer.start();
    }

    @Override
    public void stop() { // override from Plant
        shootTimer.stop();
    }

}