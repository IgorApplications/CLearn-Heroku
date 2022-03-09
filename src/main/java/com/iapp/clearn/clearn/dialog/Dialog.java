package com.iapp.clearn.clearn.dialog;

import javax.swing.*;
import java.awt.*;

public class Dialog extends JFrame {

    private Dimension s = Toolkit.getDefaultToolkit().getScreenSize();
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private int x = (s.width - WIDTH) / 2;
    private int y = (s.height - HEIGHT) / 2;


    public Dialog() {
        super("Launcher CLearn");
        JFrame.setDefaultLookAndFeelDecorated(true);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBounds(x, y, WIDTH, HEIGHT);
        pack();

        DialogListener dialogListener = new DialogListener();
        addWindowListener(dialogListener);

        initGUI();
    }

    public void showDialog() {
        setVisible(true);
    }

    private void initGUI() {
        JLabel title = new JLabel("Сайт CLearn запущен", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.PLAIN, 30));
        add(title);
    }
}
