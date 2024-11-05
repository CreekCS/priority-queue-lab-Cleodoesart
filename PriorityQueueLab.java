// import statements
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.PriorityQueue;
import java.io.FileNotFoundException;
public class PriorityQueueLab {
    public static void main(String[] args) {

        try {
            File file = new File("RandIntegers.txt");
            Scanner scanner = new Scanner(file);
            PriorityQueue queue = new PriorityQueue<Integer>();
            while (scanner.hasNextLine()) {
                queue.add(Integer.parseInt(scanner.nextLine()));
            }
            int size = queue.size();
            for(int i = 0; i < size;i++){
                System.out.println(queue.remove());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
  
}

