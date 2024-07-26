package TreeLab;

import java.awt.*;

public class Ornament {
    private int xPos, yPos;
    private Color color;
    public Ornament(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
        int red = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        this.color = new Color(red,green,blue);
    }

  /* public static int random(Ornament tree){
        int random_x = (int)(Math.random() * 500);
        int random_y = (int)(Math.random() * 500);
        return random_x + random_y;
    }*/
   public void draw(Graphics g){
        g.setColor(this.color);
        g.fillOval(this.xPos,this.yPos,25,25);
    }
}
