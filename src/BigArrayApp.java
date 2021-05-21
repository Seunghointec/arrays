public class BigArrayApp {


    public static void main(String[] args) {

        int[] bigArray = new int[4000];

        bigArray[3999] =8;

        printArray(bigArray);

    }

public static void fillArray(int[] array){
            Random rand = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
                array[i] = rand.nextInt(45);
                System.out.println(array[i]);
            }


    public static void printArray(int[] array){

        for (int i = 0; i< array.length; i++){

            System.out.println(array[i]);

        }

    }

}
