public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /* Returns the area of the circle with given radius
       Area of a circle = pi * r ^ 2
       Use Math.PI for pi and use the pow method
     */
    public double area() { /* implement this method! */
    double area = Math.PI * radius * radius;
    return area;
    }


    /* Returns the circumference of the circle with given radius
       Circumference of a circle = pi * 2 * r
       Use Math.PI for pi
     */
    public double circumference() { /* implement this method! */
    double circumference = Math.PI * 2 * radius;
    return circumference;
    }


    /* Setter method to update the radius of the circle to newRadius
     */
    public void setRadius(double newRadius) { /* implement this method! */
    radius = newRadius;
    }


    /* Returns a String that includes info about the circle,
       including its radius, area, and circumference on separate lines;
       see example output below (Reminder: the new line escape
       sequence \n allows you to include new lines in Strings!)
       Note that this method should return a string -- it should NOT
       do any printing. This method should call your other methods!
     */
    public String getInfo() { /* implement this method! */
    return "Radius: " + radius + "\n" +
           "Area: " + area() + "\n" +
           "Circumference: " + circumference();
    }
}