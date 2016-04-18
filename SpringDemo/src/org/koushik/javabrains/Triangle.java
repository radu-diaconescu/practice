package org.koushik.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

/**
 * Created by admin on 4/15/2016.
 */
public class Triangle implements  Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private String beanName;

    public void draw(){
        System.out.println("Drawing Triangle");
        System.out.println("PointA=("+getPointA().getX()+ ","
                +getPointA().getY()+")");
        System.out.println("PointB=("+getPointB().getX()+ ","
                +getPointB().getY()+")");
        System.out.println("PointC=("+getPointC().getX()+ ","
                +getPointC().getY()+")");

    }


    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void myInit(){
        System.out.println("My init method for triangle");
    }

    public void cleanUp(){
        System.out.println("My cleanup method for triangle");
    }





}
