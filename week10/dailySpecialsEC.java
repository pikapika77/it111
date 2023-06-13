import java.util.Scanner;


public class dailySpecialsEC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to Catpuccino Cafe! ");
        System.out.println();
        System.out.println("To start your order please enter a day of the week, Monday through Friday only: " );
        String day = input.nextLine();

        boolean Weekend = false;

        while (day.equals("Saturday") || day.equals("Sunday")) {
            Weekend = true;
            System.out.print("Sorry, we are closed on weekends, please enter a valid weekday: ");
            day = input.nextLine();
        }

        String special;
        double price;

        while (true) {
            switch (day) {
                case "Monday":
                    special = "lavender latte";
                    price = 5.25;
                    break;
                case "Tuesday":
                    special = "raspberry mocha";
                    price = 5.25;
                    break;
                case "Wednesday":
                    special = "extra foamy cappuccino";
                    price = 4.75;
                    break;
                case "Thursday":
                    special = "single-origin drip coffee";
                    price = 3.25;
                    break;
                case "Friday":
                    special = "spicy chai tea latte";
                    price = 4.75;
                    break;
                default:
                    System.out.println("Please enter a valid day of the week or check your spelling.");
                    input.close();
                    return;
            }

            System.out.println(day + "'s special is a " + special + " and the price will be $" + price);
            System.out.print("How many " + special + "s would you like to order? ");
            int quantity = input.nextInt();

            double total = quantity * price;
            double discountedPrice = 0;
            if (quantity >= 5 && quantity < 10) {
                discountedPrice = total * 0.9;
            } else if (quantity >= 10) {
                discountedPrice = total * 0.8;
            } else {
                discountedPrice = total;
            }

            if (quantity == 0) {
                System.out.println("Looks like you don't like " + special + "s :( how sad!");
            } else if (quantity == 1) {
                System.out.println("Thank you for ordering " + quantity + " " + special + "!");
                System.out.printf("The total price for your order will be: $%.2f.%n", total);
            }
            else {
                System.out.println("Thank you for ordering " + quantity + " " + special + "s!");
                System.out.printf("The total price for your order will be: $%.2f.%n", total);
                if (discountedPrice == total*0.9) {
                    System.out.printf("Great news, your order qualifies for a 10%% discount! The total for your order is now $%.2f.%n", discountedPrice);
                } else if (discountedPrice == total*0.8) {
                    System.out.printf("Here's some fantastic news, your order qualifies for a 20%% discount! The total for your order is now $%.2f.%n", discountedPrice);
                }
            }

            break;
        }

        input.close();
    }
}
