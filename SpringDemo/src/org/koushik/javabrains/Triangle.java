package org.koushik.javabrains;

import java.util.List;

/**
 * Created by admin on 4/15/2016.
 */
public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw(){

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
}
