package csulb.cecs327.Services;

import csulb.cecs327.Controllers.FrontEnd.LoginPage;

import javax.swing.*;

/**
 * This thread runs a single UI
 */
public class Client extends Thread {
    @Override
    public void run() {
        JFrame login = new JFrame("Rainbow Radio");
        login.setContentPane(new LoginPage());
        login.setSize(1024, 720);
        login.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        login.pack();
    }
}

