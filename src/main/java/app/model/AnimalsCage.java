package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Говорит:");
        System.out.println(animal.toString());
        System.out.println("Время:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
