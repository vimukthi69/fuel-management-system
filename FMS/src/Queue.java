import java.util.ArrayList;
import java.util.Scanner;

public class Queue {
    private int queueNo;
    private ArrayList<Customer> customerArrayList = new ArrayList<>();

    public Queue() {
        // constructor
    }

    // getters and setters
    public int getQueueNo() {
        return queueNo;
    }

    public void setQueueNo(int queueNo) {
        this.queueNo = queueNo;
    }


    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    // add and remove methods for the above arraylist
    public boolean addCustomer(Customer c){
        return (this.customerArrayList.add(c));
    }

    public boolean removeCustomer(Customer c){
        return (this.customerArrayList.remove(c));
    }

    public void addingCustomer() {
        // creating objects
        Customer newCustomer = new Customer();
        Ticket tickets = new Ticket();
        Payment paymentdetails = new Payment();
        Repository repositoryDetails = new Repository();
        Worker paymentTrack = new Worker();
        Management trackAvailability = new Management();

        Scanner scn = new Scanner(System.in);
        int count = 1;

        // getting vehicle type from customer
        System.out.print("Add the vehicle type : ");
        String vehicleType = scn.nextLine();
        newCustomer.setVehicleType(vehicleType);

        // getting fuel type from customer
        System.out.print("Add your fuel type : ");
        String fuelType = scn.nextLine();
        newCustomer.setFuelType(fuelType);

        // getting qr from customer
        System.out.print("Add your QR : ");
        int qrType = scn.nextInt();
        newCustomer.setQrNumber(qrType);

        // assigning an id number to each customer
        newCustomer.setIdNo(count);

        // assigning ticket number to each customer
        tickets.setTicketNo(count);

        // getting payment method from customer
        Scanner tot = new Scanner(System.in);
        System.out.print("Add your payment method : ");
        String payMethod = tot.nextLine();
        paymentdetails.setPaymentMethod(payMethod);

        // getting needed fuel amount from customer
        int totalPrice = 0;
        System.out.print("How much fuel do you want : ");
        int fuelAmount = scn.nextInt();
        //updating available stocks
        double availableStock = repositoryDetails.getRemainingStock();
        if (availableStock > 500){
            repositoryDetails.setRemainingStock(availableStock - fuelAmount);
            if (fuelType.equals("petrol")){
                totalPrice = fuelAmount * 450;
            } else if (fuelType.equals("diesel")) {
                totalPrice = fuelAmount * 430;
            }
            // set availability
            trackAvailability.setAvailability(true);
            paymentdetails.setPayment(totalPrice);

            // updating payment array list
            ArrayList<Payment> singlePayment = new ArrayList<>();
            singlePayment.add(paymentdetails);
            paymentTrack.setPaymentArrayList(singlePayment);
        }

        // adding new customer to customer array list
        customerArrayList.add(newCustomer);
        System.out.println("first vehicle on queue : " + customerArrayList.get(0).getVehicleType());

        // decreasing ticket count by one
        tickets.setTicketCount(tickets.getTicketCount() - 1);
        System.out.println("tickets left : " + tickets.getTicketCount());
        System.out.println("remaining fuel count : " + repositoryDetails.getRemainingStock());
        count += 1;
    }
}
