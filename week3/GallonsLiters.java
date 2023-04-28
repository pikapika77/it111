public class GallonsLiters {
    public static void main(String[] args) {

        double gallons, liters;
        int counter;

        counter = 0;

        for(gallons = 1; gallons <= 100; gallons = gallons + 4) {
            liters = gallons * 3.7854;

            if(gallons <= 1) {

                System.out.printf("%.2f", liters);
                System.out.println(" Liters = " + gallons + " Gallon");

            } else {
                System.out.printf("%.2f", liters);
                System.out.println(" Liters = " + gallons + " Gallons");
            }


            counter++;

            if(counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
        System.out.println("We are done!!!!");
    }
}
