import java.util.ArrayList;

public class Vet {
    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name) {
        this.name=name;
        this.clients = new ArrayList<>();
    }
    public void addClient(Animal client) {
        if (clients.contains(client)) {
            System.out.println(client.getName() + " is already a client of " + name +"!");
        } else {
            clients.add(client);
            System.out.println("Welcome to " + name + " office, " + client.getName() + "!");
        }
    }
}
