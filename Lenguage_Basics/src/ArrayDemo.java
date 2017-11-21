public class ArrayDemo {
    public static void main(String[] args){
        // declare array of integers
        int[] anArray;

        // allocate memory
        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 0: " + anArray[1]);
    }
}
