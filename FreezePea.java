import java.awt.*;

public class FreezePea extends Pea { // FreezePea is a kìd of Pea

    public FreezePea(Panel parent, int lane, int startX) { // constructor
        super(parent, lane, startX);
    }

    @Override
    public void advance() {
        Rectangle pRect = new Rectangle(posX, 130 + myLane * 120, 28, 28);
        for (int i = 0; i < p.ZombiesLane.get(myLane).size(); i++) {
            Zombie z = p.ZombiesLane.get(myLane).get(i);
            Rectangle zRect = new Rectangle(z.posX, 109 + myLane * 120, 400, 120);
            if (pRect.intersects(zRect)) {
                z.health -= 300;
                z.slow();
                boolean exit = false;
                if (z.health < 0) {
                    System.out.println("ZOMBIE DIE");
                    Panel.setProgress(10);
                    p.ZombiesLane.get(myLane).remove(i);
                    exit = true;
                }
                p.PeasLane.get(myLane).remove(this);
                if (exit)
                    break;
            }
        }

        posX += 15;
    }

}