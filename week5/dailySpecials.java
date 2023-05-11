import java.util.Scanner;


public class dailySpecials {


    public static void main(String[] args) {


        String specials = "";


        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");


        specials = input.next();


        String coffee;
        double price;
        double total;
        int order;


        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");


        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }




        switch (specials) {




            case "Monday":
                coffee = "latte";
                price = 4.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ "s would you like to order?");
                order = input.nextInt();
                total = order * price;


                if (order == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                } else {
                    System.out.print(order+" "+coffee+ "s have been ordered totalling ");
                    System.out.printf("$%.2f", total);
                    System.out.print(" dollars!");
                }


                break;


            case "Tuesday":
                coffee = "frapp";
                price = 4.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ "s would you like to order?");
                order = input.nextInt();
                total = order * price;


                if (order == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                } else {
                    System.out.print(order+" "+coffee+ "s have been ordered totalling ");
                    System.out.printf("$%.2f", total);
                    System.out.print(" dollars!");
                }




                break;


            case "Wednesday":
                coffee = "cappucino";
                price = 4.35;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ "s would you like to order?");
                order = input.nextInt();
                total = order * price;


                if (order == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                } else {
                    System.out.print(order+" "+coffee+ "s have been ordered totalling ");
                    System.out.printf("$%.2f", total);
                    System.out.print(" dollars!");
                }
                break;


            case "Thursday":
                coffee = "regular joe";
                price = 2.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ "s would you like to order?");
                order = input.nextInt();
                total = order * price;


                if (order == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                } else {
                    System.out.print(order+" "+coffee+ "s have been ordered totalling ");
                    System.out.printf("$%.2f", total);
                    System.out.print(" dollars!");
                }
                break;


            case "Friday":
                coffee = "green tea latte";
                price = 6.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ "s would you like to order?");
                order = input.nextInt();
                total = order * price;


                if (order == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                } else {
                    System.out.print(order+" "+coffee+ "s have been ordered totalling ");
                    System.out.printf("$%.2f", total);
                    System.out.print(" dollars!");
                }
                break;


            default:
                System.out.println("Please enter a valid day, or check your spelling!");
        }


    }


}
