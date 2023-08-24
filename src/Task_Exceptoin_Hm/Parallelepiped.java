package Task_Exceptoin_Hm;

public class Parallelepiped {
    private int height;
    private int width;
    private int length;

    public  Parallelepiped(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public String getAreaP(){
        int c = 2*((height * length) + (length * width) + (height * width));
        return "Area: "+c;
    }
    public String getVolumeP(){
        int c1 = (length*width*height);
        return "Volume: "+c1;
    }


    @Override
    public String toString() {
        return "Parallelepiped{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
