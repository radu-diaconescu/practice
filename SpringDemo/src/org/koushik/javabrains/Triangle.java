package org.koushik.javabrains;

import java.util.List;

/**
 * Created by admin on 4/15/2016.
 */
public class Triangle {
    private List<Point> points;

    public void setPoints(List<Point> points){
        this.points=points;
    }

    public List<Point> getPoints(){
        return points;
    }

    public void draw(){
        for(Point p:points)
            System.out.println("PointA=("+p.getX()+ ","
                +p.getY()+")");
//        System.out.println("PointB=("+getPointB().getX()+ ","
//                +getPointB().getY()+")");
//        System.out.println("PointC=("+getPointC().getX()+ ","
//                +getPointC().getY()+")");

    }



}
