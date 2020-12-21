package task_9.console;

import task_9.gui.util.ArrayUtils;
import task_9.logic.SorterNumber;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] arr = readFile();
        List<Integer> numbers = setArrayList(arr);

        System.out.println("Source array: \n" + numbers);
        SorterNumber.sortTheSheet(numbers);
        System.out.println("Sorted array \n" + numbers);
        writeFile(numbers);
    }

    public static int[] readFile() throws IOException {
        FileReader fileReader = new FileReader(readSomething("Enter file name : "));
        Scanner scanner = new Scanner(fileReader);
        String num = scanner.nextLine();
        fileReader.close();
        return ArrayUtils.toIntArray(num);
    }

    public static void writeFile(List<Integer> list) throws IOException {
        FileWriter fileWriter = new FileWriter("answer.txt");
        fileWriter.write(String.valueOf(list));
        fileWriter.close();
    }

    public static ArrayList<Integer> setArrayList(int[] arr) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int j : arr) {
            numbers.add(j);
        }
        return numbers;
    }

    public static String readSomething(String name) {
        Scanner scn = new Scanner(System.in);
        System.out.print(name);
        return scn.nextLine();
    }
}
