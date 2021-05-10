import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_2 {

    private static Integer task_2(List<Integer> rowOfTrees) {
        Integer maxFruit = 0;
        Integer currentFruit = 0;
        ArrayList<Integer> currentBasket = new ArrayList<>();
        for (int i = 0; i < rowOfTrees.size(); i++) {
            for (Integer num : rowOfTrees.subList(i, rowOfTrees.size())) {
                if (currentBasket.contains(num)) {
                    currentFruit += 1;
                } else if (currentBasket.size() > 1) {
                    break;
                } else {
                    currentBasket.add(num);
                    currentFruit += 1;
                }
            }
            if (currentFruit > maxFruit) {
                maxFruit = currentFruit;
            }
            currentFruit = 0;
            currentBasket = new ArrayList<>();
        }
        return maxFruit;
    }

    public static void main(String[] args) {
        ArrayList<Integer> rowOfTrees = new ArrayList<>(Arrays.asList(3,3,3,1,2,1,1,2,3,3,4));
        System.out.println(task_2(rowOfTrees));

    }
}
