import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;


public class NewContact extends JFrame {
    private JPanel panel1;
    private JPanel newContactRootPanel;
    private JPanel westLabelPanel;
    private JPanel eastTextField;
    private JPanel southButtons;
    private JLabel givenNamesLabel;
    private JLabel surnamesLabel;
    private JLabel mobileLabel;
    private JLabel emailLabel;
    private JTextField givenNamesTextField;
    private JTextField surnameTextField;
    private JTextField mobileTextField;
    private JTextField emailTextField;
    private JButton addContactButton;
    private JButton noOpButton;
    private final static List<Contact> contactBook = new ArrayList<Contact>();

    public NewContact() {
        super("NewContact.Contact Panel");
        givenNamesTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        givenNamesTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
        addContactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contactBook.add(new Contact(givenNamesTextField.getText(), surnameTextField.getText(),
                        mobileTextField.getText(),
                        emailTextField.getText()));
                JOptionPane.showMessageDialog(null, "Given name is " + contactBook.get(0).getGivenNames(), "Contanct #1", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("NewContact");
        frame.setContentPane(new NewContact().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

