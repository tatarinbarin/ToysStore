public class Program {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();
        store.addToy(1, "Toy 1", 10, 20);
        store.addToy(2, "Toy 2", 5, 10);
        store.addToy(3, "Toy 3", 20, 70);
        store.setToyWeight(2, 30);
        store.play();

        try {
            store.getPrizeToy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
