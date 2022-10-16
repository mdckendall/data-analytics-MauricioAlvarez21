import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner R = new Scanner(System.in);
    boolean a = true;
    while (a = true){
  
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");
  
      String answer = R.nextLine();
      int response = Integer.parseInt(answer);
      
      if(response == 1){
        System.out.println("$98,345 average salary in South Florida!");
      }
      else if (response == 2){
        System.out.println("US News - 100 Best Jobs!");
      }
      else if (response==3){
        System.out.println("Top 10 Forbes In-Demand Jobs!");
      }
      else if(response==4){
        while(fileScanner.hasNextLine()){
          String name = fileScanner.nextLine();
          arrayList.add(name);
        }
        System.out.println("Current Students:");
        for (int i = 0 ; i < arrayList.size();i++){
          System.out.println(arrayList.get(i));
        }
      }
      else if(response==5){
        a = false;
        break;
      }
      else {
        break;
      }
    }
	}
}