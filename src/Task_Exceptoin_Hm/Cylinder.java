package Task_Exceptoin_Hm;

import static java.lang.Math.PI;

public class Cylinder {
private int height;
private int radius;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String getAreaC(){
        double c = 2 * PI * radius * (height + radius);
        return "Area: "+c;
    }
    public String getVolumeC(){
        double c1 =(PI*radius*radius*height);

        return "Volume: "+c1;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}
