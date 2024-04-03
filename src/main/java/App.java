import model.Cat;
import model.Gender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat = (Cat) applicationContext.getBean("cat");
        cat.setName("Alice");
        cat.setAge(5);
        cat.setColor("black");
        cat.setGender(Gender.FEMALE);

        System.out.println(bean.getMessage());

        System.out.println(cat);
    }
}