import com.yianle.pojo.HelloWord;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void testHelloSpring() {

        //获取IoC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取IoC容器中的bean对象
        //根据bean的name获取，bean的name指的就是bean的id
        HelloWord helloWord = (HelloWord) ioc.getBean("helloWord");
        helloWord.helloSpring();

//        HelloWord bean = ioc.getBean(HelloWord.class);



    }
}
