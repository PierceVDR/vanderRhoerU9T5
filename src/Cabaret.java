import java.util.ArrayList;

public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name=name;
        performers = new ArrayList<>();
    }

    public String getName() {return name;}
    public ArrayList<Performer> getPerformers() {return performers;}

    public boolean addPerformer(Performer performer) {
        boolean add = !performers.contains(performer);
        if (add) {performers.add(performer);}
        return add;
    }

    public boolean removePerformer(Performer performer) {
        int i = performers.indexOf(performer);
        boolean remove = i!=-1;
        if (remove) {performers.remove(i);}
        return remove;
    }

    public double averagePerformerAge() {
        double sum = 0;
        for (Performer p : performers) {sum+=p.getAge();}
        return sum/=performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age) {
        ArrayList<Performer> oldPerformers = new ArrayList<>();
        for (Performer p : performers) {if (p.getAge()>=age) {oldPerformers.add(p);}}
        return oldPerformers;
    }

    public void groupRehearsal() {
        for (Performer p : performers) {
            System.out.println("ROLL CALL! " + p.getName());
            if (p instanceof Comedian) {
                ((Comedian) p).rehearse(false);
            } else {
                p.rehearse();
            }
        }
    }

    public void cabaretShow() {
        for (Performer p : performers) {
            System.out.println("Welcome to the cabaret! Next act up… " + p.getName());
            if (p instanceof Dancer) {
                ((Dancer) p).pirouette(2);
            }
            p.perform();
        }
    }
}
