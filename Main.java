import config.SpringConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pack.*;

public class Main{

    public static void main(String[] args){

        ApplicationContext springContext = null;
        try {
            springContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        } catch (BeansException e) {

        }

        System.out.println("context: " + springContext);
        System.out.println("beans for SomeInterface: " + springContext.getBeansOfType(SomeInterface.class));
        System.out.println("beans for SomeClass: " + springContext.getBean(SomeClass.class));
        Object bean = null;
        try{
            bean = springContext.getBean(SomeClassWithTransactional.class);
        }
        catch (Exception e){

        }
        System.out.println("beans for SomeClassWithTransactional : " + bean);
        System.out.println("beans for SomeClassWithTransactionalAndProxyMode: " + springContext.getBean(SomeClassWithTransactionalAndProxyMode.class));
    }
}