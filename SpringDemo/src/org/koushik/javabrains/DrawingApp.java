package org.koushik.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 4/15/2016.
 */
public class DrawingApp {
    public static  void  main(String[] args){
       // Triangle triangle=new Triangle();
        @SuppressWarnings("deprecation")
        //BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
                AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        //triangle.draw();
       // @SuppressWarnings("unchecked")
//        Triangle triangle=(Triangle)context.getBean("triangle");
//
//        triangle.draw();
        Shape shape=(Shape) context.getBean("Circle");
        shape.draw();
    }
}
