package Assignment01;


/*
Assignment01
© Shuo Li
Written by: Shuo li (student id:)
This is assignment 1, the man function is XXXXX
 */
public class Computer {

    private String brand;
    private String model;
    private Double price;
    private Long serialNumber;
    private Long SerialNumberCounter = 1000000L;
    private Integer numberOfComputer = 0;


    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        serialNumber = SerialNumberCounter;
        SerialNumberCounter++;
        numberOfComputer++;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public long getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(long serialNumber) {this.serialNumber = serialNumber;}

    @Override
    public String toString() {
        return  "--------------------------------" + '\n' +
                "Computer #" + '\n' +
                "brand: " + brand + '\n' +
                "ComputerModel: " + model + '\n' +
                "SerialNumber: " + serialNumber + '\n' +
                "Price: $" + price + '\n' +
                "--------------------------------";
    }

    public int findNumberOfCreatedComputers() {
        return numberOfComputer;
    }

    public boolean equal(Computer c) {
        if (brand == c.brand && model == c.model && price == c.price) {
            return true;
        }else{
            return false;
        }
    }
}
