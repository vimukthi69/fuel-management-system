import java.util.ArrayList;

public class MainQueue extends Queue{
    private  int queueLength;
    // getters and setters
    public int getQueueLength() {
        return queueLength;
    }

    public void setQueueLength(int queueLength) {
        this.queueLength = queueLength;
    }

    public MainQueue() {
        // constructor
    }

    public void checkTicket(){
        // this method is used to check whether the customer has a ticket
    }

    public static void checkVehicle(){
        MainQueue length = new MainQueue();
        int count = 0;
        Queue eachCustomer = new Queue();
        eachCustomer.addingCustomer();
        String vehicleType = eachCustomer.getCustomerArrayList().get(0).getVehicleType();
        if (vehicleType.equals("car")){
            count += 1;
            length.setQueueLength(count);
        }
        // System.out.println(eachCustomer.getCustomerArrayList().get(0).getVehicleType());
        System.out.println("Main queue length : " + length.getQueueLength());
    }

    public static void main(String[] args) {
        checkVehicle();
    }


}
