import java.util.ArrayList;
import java.util.Queue;

public class system {
    private int systemId;
    private ArrayList<Queue> queueArrayList = new ArrayList<>();
    private ArrayList<Ticket> ticketArrayList = new ArrayList<>();

    public system() {
        // constructor
    }

    // getters and setters
    public int getSystemId() {
        return systemId;
    }

    public void setSystemId(int systemId) {
        this.systemId = systemId;
    }

    public ArrayList<Queue> getQueueArrayList() {
        return queueArrayList;
    }

    public void setQueueArrayList(ArrayList<Queue> queueArrayList) {
        this.queueArrayList = queueArrayList;
    }

    public ArrayList<Ticket> getTicketArrayList() {
        return ticketArrayList;
    }

    public void setTicketArrayList(ArrayList<Ticket> ticketArrayList) {
        this.ticketArrayList = ticketArrayList;
    }

    // add and remove methods for the above arraylist
    public boolean addQueue(Queue q){
        return (this.queueArrayList.add(q));
    }

    public boolean removeQueue(Queue q){
        return (this.queueArrayList.remove(q));
    }

    public boolean addTicket(Ticket t){
        return (this.ticketArrayList.add(t));
    }

    public boolean removeTicket(Ticket t){
        return (this.ticketArrayList.remove(t));
    }
}
