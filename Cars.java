public class Cars {
    private int year;
    private String brand;
    private String model;
    private String trim;
    private String carClass;

    // Specs
    private double engine;
    private String cylinders;
    private int horsepower;
    private double price;

    // Setters
    // Year
    public void setYear(int a) {
        year = a;
    }

    public int getYear() {
        return year;
    }

    // Brand
    public void setBrand(String a) {
        brand = a;
    }

    public String getBrand() {
        return brand;
    }

    // Model
    public void setModel(String a) {
        model = a;
    }

    public String getModel() {
        return model;
    }

    // Trim
    public void setTrim(String a) {
        trim = a;
    }

    public String getTrim() {
        return trim;
    }

    // Car Class
    public void setCarClass(String a) {
        carClass = a;
    }

    public String getCarClass() {
        return carClass;
    }

    // Setters and Getters of Specs
    // Engine
    public void setEngine(double a) {
        engine = a;
    }

    public double getEngine() {
        return engine;
    }

    // Cylinders
    public void setCylinders(String a) {
        cylinders = a;
    }

    public String getCylinders() {
        return cylinders;
    }

    // Horsepower
    public void setHorsepower(int a) {
        horsepower = a;
    }

    public int getHorsepower() {
        return horsepower;
    }

    // Price
    public void setPrice(double a) {
        price = a;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Vehicle: " + year + " " + brand + " " + model + " " + trim);
        System.out.println("Class: " + carClass);
        System.out.println("Engine: " + engine + "L" + " " + cylinders);
        System.out.println("Horsepower: " + horsepower);
        System.out.printf("Price: %.2f", price);
    }

}
