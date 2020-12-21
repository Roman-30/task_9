package task_9.gui.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class SaveButtonListener implements ActionListener {

    JTextField textField2;

    public SaveButtonListener(JTextField textField2) {
        this.textField2 = textField2;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            FileWriter fileWriter = new FileWriter("answer.txt");
            fileWriter.write(textField2.getText());
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
