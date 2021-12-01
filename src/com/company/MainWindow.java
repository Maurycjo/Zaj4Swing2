package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements MouseListener, ActionListener
{

    MyButton  but2;
    MyButton but1;

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

     void start()
    {

        but1= new MyButton();
        but1.setBackground(Color.red);
        but1.setLocation(200,100);
        but1.setSize(100, 40);
        but1.setVisible(true);
        this.add(but1);
        //but1.addMouseListener(this);


        but2= new MyButton("canel");
        but2.setLocation(10, 320);
        but2.setSize(560,40);

        //but1.setPreferredSize(new Dimension(100, 40));

        this.add(but2);
        this.getContentPane().add(but1);

        JButton hitBoxR, hitBoxL, hitBoxD;
        hitBoxR= new HitBox();
        hitBoxL= new HitBox();
        hitBoxD= new HitBox();

        hitBoxL.setSize(3,40);
        hitBoxR.setSize(3,40);
        hitBoxD.setSize(100,3);

        but1.add(BorderLayout.EAST, hitBoxR);
        but1.add(BorderLayout.WEST, hitBoxL);
        but1.add(BorderLayout.SOUTH, hitBoxL);



        hitBoxL.addMouseListener(this);
        hitBoxR.addMouseListener(this);
        hitBoxD.addMouseListener(this);



    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("enter");



    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

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



}
