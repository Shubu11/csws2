
class Rectangle {

    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 4 * (length + width);
    }

    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle(5, 6);

        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());
    }
}
