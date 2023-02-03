import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = "5\n" +
                "5 41 77 74 22 44\n" +
                "1 12\n" +
                "4 37 34 36 52\n" +
                "0\n" +
                "3 20 22 33\n" +
                "5\n" +
                "1 3\n" +
                "3 4\n" +
                "3 1\n" +
                "4 3\n" +
                "5 5";

        String editInput = input;
        int numLines = Integer.parseInt(input.substring(0,input.indexOf("\n")));
        editInput = editInput.substring(input.indexOf("\n") + 1);

        ArrayList[] arr = new ArrayList[numLines];

        int numbers = 0;
        for (int i = 0; i < editInput.substring(0, editInput.indexOf("\n")).length(); i++)
        {
            if (editInput.substring(i, i + 1).equals(" "))
            {
                numbers++;
            }
        }
        System.out.println(editInput);

        for (int i = 0; i < numLines; i++)
        {
            ArrayList<Integer> intArr = new ArrayList<Integer>();
            for (int num = 0; num < numbers; num++)
            {
                if (num == 0)
                {
                    editInput = editInput.substring(editInput.indexOf(" ") + 1);
                }
                else if (num < numbers - 1)
                {
                    intArr.add(Integer.parseInt(editInput.substring(0, editInput.indexOf(" "))));
                    editInput = editInput.substring(editInput.indexOf(" ") + 1);
                }
                else
                {
                    intArr.add(Integer.parseInt(editInput.substring(0, editInput.indexOf("\n"))));
                    editInput = editInput.substring(editInput.indexOf("\n") + 1);
                }
            }
            arr[i] = intArr;
        }

        System.out.println(arr[1].get(3));
    }
}
