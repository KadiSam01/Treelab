package TreeLab;

import java.awt.*;

public abstract class AbstractTree {
    private Color trunk, leaves;
    private int xPos,yPos;

    public AbstractTree(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
        this.trunk = new Color(139,69,19);
        this.leaves =  Color.GREEN;
    }

    public int getxPos() {
        return this.xPos;
    }
    public int getyPos(){
        return this.yPos;
    }
    public Color getTrunk(){
        return this.trunk;
    }
    public Color getLeaves(){
        return this.leaves;
    }
    public void drawTree(Graphics g){
        this.drawTrunk(g);
        this.drawLeaves(g);
    }
    public void drawTrunk(Graphics g){
        if(this.trunk!=null){
            g.setColor(this.getTrunk());
            g.fillRect(this.getxPos(),this.getyPos(),50,100);
        }
    }
    public abstract void drawLeaves(Graphics g);
}
