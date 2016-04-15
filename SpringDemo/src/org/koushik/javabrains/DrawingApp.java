package org.koushik.javabrains;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by admin on 4/15/2016.
 */
public class DrawingApp {
    public static  void  main(String[] args){
       // Triangle triangle=new Triangle();
        @SuppressWarnings("deprecation")
        //BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
                ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        //triangle.draw();
       // @SuppressWarnings("unchecked")
        Triangle triangle=(Triangle)context.getBean("triangle");
        
        triangle.draw();

    }
}
