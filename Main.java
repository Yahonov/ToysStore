package ToysStore;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        NameToy toy1 = new NameToy(1, "Teddy Bear", 10, 30);
        toyStore.addToy(toy1);

        NameToy toy2 = new NameToy(2, "Doll", 15, 30);
        toyStore.addToy(toy2);

        NameToy toy3 = new NameToy(3, "Car", 20, 40);
        toyStore.addToy(toy3);

        toyStore.showAvailableToys();

        toyStore.updateToyWeight(2, 50);

        toyStore.playToys();

        toyStore.showAvailableToys();
    }
}