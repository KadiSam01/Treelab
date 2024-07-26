package TreeLab;

import java.awt.*;

public class PineTree extends AbstractTree{
    private Polygon leaves;
    public PineTree(int xPos, int yPos) {
        super(xPos, yPos);
        this.leaves = new Polygon();
    }
    @Override
    public void drawLeaves(Graphics g) {
        g.setColor(this.getLeaves());
        g.fillPolygon(this.draw_polygon());
        g.setColor(this.getLeaves());
    }
    public Polygon draw_polygon( ){
        //if(leaves==null) {
            leaves.addPoint(this.getxPos() - 75, this.getyPos() + 25);
            leaves.addPoint(this.getxPos() + 25, this.getyPos() - 150);
            leaves.addPoint(this.getxPos() + 125, this.getyPos() + 25);
       // }
        return leaves;
    }
}
