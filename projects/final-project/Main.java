import java.util.ArrayList;

public class Main {
    // Returns the elevation of the smallest mountain in an unsorted ArrayList;
    public static int minElevation(ArrayList<Mountain> mountainList){
        int i;
        int minElevation = mountainList.get(0).getElevation();
        Mountain currMountain;

        for (i = 0; i < mountainList.size(); ++i) {
            currMountain = mountainList.get(i);
            if (currMountain.getElevation() < minElevation) {
                minElevation = currMountain.getElevation();

            }
            
        }
        return minElevation;
    }
    // Uses insertion sort to sort Mountains by Elevation in ascending order
    public static void insertionSortMountains(ArrayList<Mountain> list) {
        int size = list.size();
        for (int i = 1; i < size; i++) {
            Mountain key = list.get(i);
            int j = i - 1;
            
            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            
            list.set(j + 1, key);
        }
    }
    public static void main(String [] args) {
        // Initialize new ArrayList mountainlist for instances of <Mountain>;
        ArrayList<Mountain> mountainList = new ArrayList<Mountain>();
        int i;
        /*Hard coding each instance of Mountain, setting each necessary value,
        then adding them to mountainList */ 
        Mountain mountain1 = new Mountain();
        mountain1.setName("Chimborazo");
        mountain1.setCountry("Ecuador");
        mountain1.setElevation(20549);

        Mountain mountain2 = new Mountain();
        mountain2.setName("Matterhorn");
        mountain2.setCountry("Switzerland");
        mountain2.setElevation(14692);

        Mountain mountain3 = new Mountain();
        mountain3.setName("Olympus");
        mountain3.setCountry("Greece (Macedonia)");
        mountain3.setElevation(9573);

        Mountain mountain4 = new Mountain();
        mountain4.setName("Everest");
        mountain4.setCountry("Nepal");
        mountain4.setElevation(29029);

        Mountain mountain5 = new Mountain();
        mountain5.setName("Mount Marcy - Adirondacks");
        mountain5.setCountry("United States");
        mountain5.setElevation(5344);

        Mountain mountain6 = new Mountain();
        mountain6.setName("Mount Mitchell - Blue Ridge");
        mountain6.setCountry("United States");
        mountain6.setElevation(6684);

        Mountain mountain7 = new Mountain();
        mountain7.setName("Zugspitze");
        mountain7.setCountry("Switzerland");
        mountain7.setElevation(9719);

        mountainList.add(mountain1);
        mountainList.add(mountain2);
        mountainList.add(mountain3);
        mountainList.add(mountain4);
        mountainList.add(mountain5);
        mountainList.add(mountain6);
        mountainList.add(mountain7);
        // Testing minElevation method;
        System.out.println("Minimum Elavation = " + minElevation(mountainList) + "ft");
        System.out.println();
        // Iterating through mountainList, unsorted;
        for (i = 0; i < mountainList.size(); ++i) {
            Mountain currentMountain = mountainList.get(i);
            System.out.print(currentMountain.getName() + ", ");
            System.out.print(currentMountain.getCountry() + ": ");
            System.out.print(currentMountain.getElevation() + "ft OR ");
            System.out.printf("%.2f meters", currentMountain.toMeters()); // formatted for clarity
            System.out.println();
        }
        
        insertionSortMountains(mountainList);
        System.out.println();

        // Prints out newly sorted list, then provides name of the smallest
        for (i = 0; i < mountainList.size(); ++i) {
            Mountain currentMountain = mountainList.get(i);
            System.out.print(currentMountain.getName() + ", ");
            System.out.print(currentMountain.getCountry() + ": ");
            System.out.print(currentMountain.getElevation() + "ft OR ");
            System.out.printf("%.2f meters", currentMountain.toMeters()); // formatted for clarity
            System.out.println();
            if (i == mountainList.size() - 1) {
                System.out.println();
                System.out.println(mountainList.get(0).getName() + " is the smallest");
            }
        }


    }
}