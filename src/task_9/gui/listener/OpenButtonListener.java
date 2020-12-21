package task_9.gui.listener;

import task_9.logic.FilesReader;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class OpenButtonListener implements ActionListener {

    JTextField textField1;
    JPanel mainPanel;

    public OpenButtonListener(JTextField textField1, JPanel mainPanel) {
        this.textField1 = textField1;
        this.mainPanel = mainPanel;
    }

    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(mainPanel) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            textField1.setText(FilesReader.readFile(file, textField1));
        }
    }
}
