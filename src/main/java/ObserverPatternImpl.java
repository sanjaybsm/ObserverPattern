import java.util.Scanner;

/**
 * Created by Sanjay_Shivanna on 9/17/2016.
 */
public class ObserverPatternImpl {


    static{
        Scanner readData = new Scanner(System.in);
        System.out.println("Enter messages (example message1 message2 message 3... ) :");
        String str = readData.nextLine();
        String [] str1 = str.split(" ");
        // System.out.println(str1.length);
        ObserverPatternImpl.main(str1);
    }

    public static void main(String[] args){
        Subject subject = new Subject();
        subject.registerObserver(new ConcreateObserver1());
        subject.registerObserver(new ConcreateObserver2());
        for (String arg : args) {
            subject.notifyObservers(arg);
        }

    }
}
