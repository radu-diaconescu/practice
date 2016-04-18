package org.koushik.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by admin on 4/18/2016.
 */
@Component
public class Circle implements  Shape{
    private Point center;

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Circle:Point is "+center.getX()
            +","+ center.getY());
    }

    public Point getCenter() {
        return center;
    }

    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void initializeCircle(){
        System.out.println("init circle");
    }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("destroy circle");
    }
}
