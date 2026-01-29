package domain;

public class Customer {
    private int id;
    private boolean isNew;
    private double total;
    
    public Customer(){
        this.id = 1;
        this.isNew = true;
        this.total = 1000;
    }
        
    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + id + "\n" +
                           "Is new customer: " + isNew + "\n"
                           +"Total purchases are: " + total);
    }

    public int getId() {
        return id;
    }

    public boolean getStatus() {
        return isNew;
    }

    public double getTotal() {
        return total;
    }

    public boolean setId(int id) {
        if (id > 0) {
            this.id = id;
            return true;
        }
        return false;
    }

    public void setStatus(boolean isNew) {
        this.isNew = isNew;
    }

    public boolean setTotal(double total) {
        if (total >= 0) {
            this.total = total;
            return true;
        }
        return false;
    }
}
