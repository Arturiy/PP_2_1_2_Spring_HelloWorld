import model.Cat;
import model.Gender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat = (Cat) applicationContext.getBean("cat");
        cat.setName("Alice");
        cat.setAge(5);
        cat.setColor("black");
        cat.setGender(Gender.FEMALE);

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        cat1.setName("Alice");
        cat1.setAge(5);
        cat1.setColor("black");
        cat1.setGender(Gender.FEMALE);

        System.out.println("bean == bean1: " + (bean == bean1));
        System.out.println("cat == cat1: " + (cat == cat1));
    }
}