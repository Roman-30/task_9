package task_9.gui.view;

import task_9.gui.listener.OpenButtonListener;
import task_9.gui.listener.SaveButtonListener;
import task_9.gui.listener.SortButtonListener;

import javax.swing.*;

public class ProgramPanel extends JFrame {
    private JPanel mainPanel;
    private JTextField inputData;
    private JTextField outputData;
    private JButton sortButton;
    private JButton openButton;
    private JButton saveButton;

    public ProgramPanel() {
        setTitle("GUI Task_9");
        setContentPane(mainPanel);
        setVisible(true);
        setBounds(300, 100, 950, 200);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        sortButton.addActionListener(new SortButtonListener(inputData, outputData));
        openButton.addActionListener(new OpenButtonListener(inputData, mainPanel));
        saveButton.addActionListener(new SaveButtonListener(outputData));
    }
}
