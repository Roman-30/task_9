package task_9.logic;

import java.util.List;

public class SorterNumber {
    public static List<Integer> sortTheSheet(List<Integer> list) {
        int j = -1;
        int num;
        for (int i = 0; i < list.size(); ) {
            if (list.get(i) < 0) {
                j++;
                num = list.get(i);
                list.remove(i);
                list.add(j, num);
                if (i != 0) i--;
            }
            i++;
        }
        return list;
    }
}
