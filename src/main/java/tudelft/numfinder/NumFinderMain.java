package tudelft.numfinder;


public class NumFinderMain {

    public static void main(String[] args) {
        NumFinder nf = new NumFinder();

        nf.find(new int[]{4, 25, 7, 9});
        System.out.println("Mayor: " + nf.getLargest());
        System.out.println("Menor: " + nf.getSmallest());

        nf.find(new int[]{4, 3, 2, 1, -7});
        System.out.println("Mayor: " + nf.getLargest());
        System.out.println("Menor: " + nf.getSmallest());

        nf.find(new int[]{});
        System.out.println("Mayor: " + nf.getLargest());
        System.out.println("Menor: " + nf.getSmallest());

        nf.find(null);
        System.out.println("Mayor: " + nf.getLargest());
        System.out.println("Menor: " + nf.getSmallest());
    }
}