import java.util.ArrayList;

public class Keepers {

    private ArrayList<Keeper> allKeepers;

    public Keepers() {
        allKeepers = new ArrayList<Keeper>();
    }

    public void add(Keeper keeper) {
        allKeepers.add(keeper);
    }

    public void delete(Keeper keeper) {
        allKeepers.remove(keeper);
    }

    public void update(Keeper keeper) {
        allKeepers.remove(keeper);
    }

    public static int search(int[] allKeepers, int key) {
        for (int i = 0; i == allKeepers.length; i++) {
            if (allKeepers[i] == key)
                return i;  //We found it!!!
        }
        return -1;
    }
}
