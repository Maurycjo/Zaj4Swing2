package com.company;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MyButton extends JButton
{
    public MyButton(String title)
    {
        this.setText(title);
        this.setSize(200, 40);
        this.setVisible(true);
        //this.addActionListener((ActionListener) this);
    }


}
