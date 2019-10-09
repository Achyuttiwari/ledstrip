import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      final Scanner scanner=new Scanner(System.in);
      int numberOfLEDs=scanner.nextInt();
      Led[] array=new Led[numberOfLEDs];
      for(int i=0;i<array.length;i++){
          String colourName=scanner.next();
          boolean working =scanner.nextBoolean();
          array[i]=new Led(colourName,working);
      }
      LEDStrip strip=new LEDStrip(array);
        strip.printStripStatus();
        scanner.close();


    }
}
