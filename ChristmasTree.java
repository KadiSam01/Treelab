package TreeLab;

import java.awt.*;

public class ChristmasTree extends PineTree{
    //a christmasstreee is a pinetree, i realize that the leaves look like a triangle
    private Ornament [] ornaments;

    public ChristmasTree(int xPos, int yPos) {
        super(xPos, yPos);
        ornaments = new Ornament[3]; //need to give each ornaments a position
    }

    @Override
    public void drawLeaves(Graphics g) {
     //   PineTree tree = new PineTree(this.getxPos(),this.getyPos());
        super.drawLeaves(g);
        this.getOrnaments(g);
       /* if(tree!=null){
            super.drawLeaves(g);
            this.getOrnaments(g);
        }*/
    }

    private void getOrnaments(Graphics g){
        for(int i = 0; i< ornaments.length;i++){
            ornaments[0] = new Ornament(this.getxPos()+10,60);
            ornaments[1] = new Ornament(this.getxPos()+50,this.getyPos()+50);
            ornaments[2] = new Ornament(this.getxPos()+25,this.getyPos()+60);
            ornaments[i].draw(g);
        }
    }
}
