package gui.sin;

import javax.swing.*;
import java.awt.*;

public class GraphicPanel extends JPanel {
    int range=60;
    int grain=10;
    int freq=2;
    int shift=5;
    //int height=this.getHeight();
    //int width=this.getWidth();
    @Override
    protected void paintComponent(Graphics g) {
        int height=this.getHeight();
        int width=this.getWidth();
        g.setColor(Color.green);
        g.drawRect(0,0,100,50);
        //g.drawLine(0,0,200,100);

        g.drawLine(0,height/2,width,height/2);
        int center=height/2;
        int x1=0,y1=center,x2,y2;
        for(int i=0;i<=width;i+=grain){
            x2=i+shift;
            y2=(int) (range*Math.sin(Math.toRadians(x2*freq)+shift)+center);
            g.drawLine(x1,y1,x2,y2);
            x1=x2;
            y1=y2;
        }
    }
}
