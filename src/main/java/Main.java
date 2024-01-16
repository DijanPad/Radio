import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Radio radio = new Radio();

        Scanner scanner = new Scanner(System.in);

        boolean hasbulla = true;
        while(hasbulla == true){

            System.out.println("ingresa 1 para AM y 2 para FM");
            String inputOption = scanner.nextLine();
            if (inputOption == "1"){
                radio.setBanda(0);
                System.out.println("AM");
            }
            if (inputOption == "2"){
                radio.setBanda(1);
                System.out.println("FM");
            }

        }

    }
}
