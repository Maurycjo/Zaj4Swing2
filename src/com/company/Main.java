package com.company;

import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {
        /*
        SwingUtilities.invokeLater(()->
        {
            new MainWindow("aplikacja, Maurycy Niewczas");
        });
        */

        MainWindow window = new MainWindow("tets");
        window.addButtons();

    }
}