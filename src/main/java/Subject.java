import java.util.ArrayList;

/**
 * Created by Sanjay_Shivanna on 9/17/2016.
 */
public class Subject {

    public ArrayList observerCollection;

    {
        observerCollection = new ArrayList();
    }

    public void registerObserver(Observer observer){
        observerCollection.add(observer);
    }

    public void deRegisterObserver(Observer observer){
        observerCollection.remove(observer);
    }

    public void notifyObservers(String message){
        observerCollection.forEach(observer -> ((Observer)observer).notify(message));
    }

}
