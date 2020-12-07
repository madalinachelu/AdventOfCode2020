import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/input.txt"))) {
            for (String line; (line = br.readLine()) != null; ) {
                numbers.add(parseInt(line));
            }
            // line is not visible here.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i=0; i<numbers.size(); i++)
        {
            for(int j=i+1; j<numbers.size(); j++)
            {
                if( (numbers.get(i) + numbers.get(j)) == 2020)
                {
                    System.out.println(numbers.get(i) * numbers.get(j));
                }
            }
        }

    }
}
