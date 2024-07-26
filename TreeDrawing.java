package TreeLab;

import javax.swing.*;
import java.awt.*;
 
public class TreeDrawing {
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	 //Create and set up the window.
                JFrame frame = new JFrame("Tree Drawing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBounds(50, 50, 800, 600);
                JPanel panel = new TreePanel();
                frame.setContentPane(panel);
                frame.setVisible(true);
            }
        });
    }
}

class TreePanel extends JPanel{
	private AbstractTree[] trees;
	//Declare your Tree[] field here
	
	public TreePanel() {
        trees = new AbstractTree[3];
        trees[0] = new OakTree(600,200);
        trees[1] = new PineTree(400,200);
        trees[2] = new ChristmasTree(900,200);
        //Initialize your Tree[] to have an OakTree, PineTree, and ChristmasTree
	}
	
	@Override
	public void paint(Graphics g) {
        super.paint(g);
        for(AbstractTree tree: trees){
            if(tree!=null){
                tree.drawTree(g);
            }
        }
	}
	
}