package com.company;

import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel
{


    Circle()
    {
        this.setSize(40,40);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.cyan);
        g.fillOval(0,0,40,40);


    }


}
