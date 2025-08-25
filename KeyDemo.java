import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class KeyDemo extends JFrame {
    private JPanel mainPanel;
    private JTextArea textArea;

    private String l1 = ""; // pressed keys
    private String l2 = ""; // action keys
    private String l3 = ""; // modifier keys

    public KeyDemo(){
        super("Key Demo...press a key");
        MyKeyHandler keyHandler = new MyKeyHandler();
        addKeyListener(keyHandler);
    }

    private class MyKeyHandler implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            l1 = "Key Typed: " + e.getKeyChar();
            displayKeyEvent(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            l1 = "Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode());
            displayKeyEvent(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            l1 = "Key Released: " + KeyEvent.getKeyText(e.getKeyCode());
            displayKeyEvent(e);
        }
    }
    private void displayKeyEvent(KeyEvent e){
        if(e.isActionKey()){
            l2 = "Key typed is an action key";
        }else{
            l2 = "Key typed is NOT an action key";
        }

        String tmp = KeyEvent.getKeyModifiersText(e.getModifiers());
        if(tmp.equals("")){
            l3 = "No modifier key pressed";
        }
        else{
            l3 = "The modifier pressed is " + tmp;
        }
        textArea.setText(String.format("%s\n%s\n%s\n", l1, l2, l3));
    }

    public static void main(String[] args) {
        KeyDemo frame = new KeyDemo();
        frame.setContentPane(frame.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
