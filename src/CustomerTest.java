package test;
import domain.Customer;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        
        customer.setId(5);
        customer.setStatus(false);
        customer.setTotal(800);
        
        customer.displayCustomerInfo();
    }
}