package TreeLab;

import java.awt.*;

public class OakTree extends AbstractTree{
    private Ornament[] ornaments;
    public OakTree(int xPos, int yPos) {
        super(xPos, yPos);
       this.ornaments = new Ornament[3];
    }
    @Override
    public void drawLeaves(Graphics g) {
        g.setColor(this.getTrunk());
        g.setColor(this.getLeaves());
        g.fillOval(this.getxPos()-50,this.getyPos()-100,150,150);
        for(Ornament ornament: ornaments){
            if(ornament!=null){
                ornament.draw(g);
            }
        }
    }
}
