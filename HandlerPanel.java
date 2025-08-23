import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;

public class HandlerPanel {
    private final ButtonGroup radioGroup;
    private JPanel mainPanel;
    private JPanel northPanel;
    private JPanel componentPanel;
    private JTextField outputTextField;
    private JRadioButton plainFontRadioButton;
    private JRadioButton boldFontRadioButton;
    private JRadioButton italicRadioButton;
    private JCheckBox boldCheckBox;
    private JCheckBox italicCheckBox;
    private JComboBox colourComboBox;
    private JList transformerList;
    private JScrollPane orinigalScrollPanel;
    private JButton copyButton;
    private JList copiedList;
    private JScrollPane copyScrollPanel;

    private static final String[] colours = {
            "Red",
            "Blue",
            "Green"
    };

    private static final String[] transformers = {
            "Optimus Prime",
            "Rodimus Prime",
            "Bumblebee",
            "Grimlock",
            "Sideswipe",
            "Megatron",
            "Galvatron",
            "Soundwave",
            "Starscream",
            "Shockwave"
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("HandlerPanel");
        frame.setContentPane(new HandlerPanel().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public HandlerPanel(){
        radioGroup = new ButtonGroup();
        radioGroup.add(plainFontRadioButton);
        radioGroup.add(boldFontRadioButton);
        radioGroup.add(italicRadioButton);
        transformerList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        plainFontRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText("Plain Font");
                outputTextField.setFont(new Font("Serif", Font.PLAIN, 12));
            }
        });
        boldFontRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText("Bold Font");
                outputTextField.setFont(new Font("Serif", Font.BOLD, 12));
            }
        });
        italicRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText("Italic Font");
                outputTextField.setFont(new Font("Serif", Font.ITALIC, 12));
            }
        });
        boldCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText("Bold CheckBox selected");
                outputTextField.setFont(new Font("Serif", Font.BOLD, 12));
            }
        });
        italicCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText("Italic CheckBox selected");
                outputTextField.setFont(new Font("Serif", Font.ITALIC, 12));
            }
        });
        colourComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText(colours[colourComboBox.getSelectedIndex()]);
            }
        });
        transformerList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                outputTextField.setText(transformers[transformerList.getSelectedIndex()]);
            }
        });
        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputTextField.setText("\"Copy Transformers\" pressed");
                copiedList.setListData(transformerList.getSelectedValuesList().toArray(new String[0]));
            }
        });
    }
}
