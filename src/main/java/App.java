import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld", HelloWorld.class);
        Cat bean1 = (Cat) applicationContext.getBean("cat", Cat.class);
        System.out.println(bean.getMessage());
        System.out.println((bean1.getName()));
    }
}