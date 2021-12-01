package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements MouseListener
{

    MyButton but1, but2;

    MainWindow(String title)
    {
        this.setTitle("aplikacja");
        this.setSize(600,400);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        centerFrame();
        this.setVisible(true);


    }

    private void centerFrame()
    {
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;
        setLocation(dx, dy);
    }

     void addButtons()
    {
        but1= new MyButton("ucieka");
        but2= new MyButton("canel");
        but1.setLocation(100,300);
        but2.setLocation(300, 300);

        this.add(but1);
        this.add(but2);
        but1.repaint();
        but2.repaint();



    }

    private void addMouse()
    {
        addMouseListener(this);



    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
