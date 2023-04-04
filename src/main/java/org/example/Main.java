package org.example;



import javafx.scene.image.Image;

import java.awt.*;
import java.io.FileInputStream;
import javax.swing.JFrame;
import javax.swing.text.html.ImageView;

class Picture extends Canvas {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Color blue = new Color(0,161,241);
        Color green = new Color(124, 187, 0);
        Color orange = new Color(255, 187, 0);
        Color red = new Color(246, 83, 20);
        Rectangle r = g.getClipBounds();
        g.setColor(red);
        g.fillRect(10, 10, 150, 150);
        g.drawRect(10, 10, 150, 150);
        g.setColor(green);
        g.drawRect(180, 10, 150, 150);
        g.fillRect(180, 10, 150, 150);
        g.setColor(blue);
        g.drawRect(10, 180, 150, 150);
        g.fillRect(10, 180, 150, 150);
        g.setColor(orange);
        g.drawRect(180, 180, 150, 150);
        g.fillRect(180, 180, 150, 150);


    }
}

class Form extends JFrame {
    public Form() {
        super("Рисунок");
        setBounds(100, 50, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Picture());
        validate();
        setVisible(true);
    }
}




public class Main {


    public static void main(String[] args) {
        new Form();
    }
}