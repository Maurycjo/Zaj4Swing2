package com.company;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MyButton extends JButton
{
    public MyButton(String title)
    {
        this.setText(title);
        this.setVisible(true);
    }
    public MyButton()
    {
        this.setVisible(true);
        this.setEnabled(false);
    }


}
