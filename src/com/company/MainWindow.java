package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class MainWindow extends JFrame implements MouseListener, ActionListener
{
    //JButton but1;
    JPanel but1;
    JButton hs, he, hw; //hitboxy
    Random rand= new Random();

    MainWindow()
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

    but1= new JPanel();
    but1.setVisible(true);
    but1.setLocation(200,100);
    but1.setSize(50,50);
    but1.setBackground(Color.red);
    this.getContentPane().add(but1);

    hs= new JButton();
    hs.setVisible(true);
    hs.setBackground(Color.GREEN);
    hs.setSize(50, 5);
    hs.setEnabled(false);
    hs.setLocation(0,0);
    hs.addMouseListener(this);
    but1.add(hs);

    hw= new JButton();
    hw.setVisible(true);
    hw.setBackground(Color.GREEN);
    hw.setSize(5, 45);
    hw.setEnabled(false);
    hw.setLocation(0,5);
    hw.addMouseListener(this);
    but1.add(hw);

    he= new JButton();
    he.setVisible(true);
    he.setBackground(Color.GREEN);
    he.setSize(5, 45);
    he.setEnabled(false);
    he.setLocation(45,5);
    he.addMouseListener(this);
    but1.add(he);

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        but1.setLocation(rand.nextInt(400), rand.nextInt(300));



    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exit");

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
