import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String []letters = {"A a","B b","C c","D d","E e","F f","G g","H h",
                "I i","J j","K k","L l","M m","N n","O o","P p","Q q","R r",
                "S s","T t","U u","V v","W w","X x","Y y","Z z"};
        int []numbers = {1,2,3,4,5,6,7,8,9};
        try (FileWriter fileWriter = new FileWriter("Alphabet.txt")) {
            for (String letter : letters) {
                fileWriter.write(letter+"\n");
            }
            for (int number : numbers) {
                fileWriter.write(number+"\n");
            }
        }catch (IOException e){
            e.getStackTrace();
        }
        try {
            FileReader fileReader = new FileReader("Alphabet.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println(" no such file !");
        }

    }
}