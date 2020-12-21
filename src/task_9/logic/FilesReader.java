package task_9.logic;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilesReader {
    public static String readFile(File file, JTextField textField1) {
        StringBuilder stringBuilder = new StringBuilder();

        if (!file.exists()) {
            textField1.setText("File not found!");
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            System.err.println("Error");
        }
        return stringBuilder.toString();
    }
}
