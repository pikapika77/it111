package package_person_homework;

public class PersonDetailsHW {

    public static void main(String[] args) {

      PersonHomework firstPerson;
      PersonHomework secondPerson;

      firstPerson = new PersonHomework();
      secondPerson = new PersonHomework();

    firstPerson.name = "Luna";
    firstPerson.gender = 'F';
    firstPerson.age = 27;
    firstPerson.car = 2005;
    firstPerson.violations = false;
    firstPerson.creditScore = 690;

    secondPerson.name = "Artemis";
    secondPerson.gender = 'M';
    secondPerson.age = 22;
    secondPerson.car = 2020;
    secondPerson.violations = true;
    secondPerson.creditScore = 670;

        double monthlyRate = 0;
        double adjustedRate = 0;
        double adjustedCarRate = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for " +firstPerson.name+ ": " +firstPerson.getRate(monthlyRate) + " dollars");
        System.out.print("Adjustments: " );
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.carPremiums(adjustedCarRate) + " dollars");
        System.out.println("Here is " +firstPerson.name+ "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate) + firstPerson.carPremiums(adjustedCarRate));
        System.out.println();
        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ ": " +secondPerson.getRate(monthlyRate) + " dollars");
        System.out.print("Adjustments: " );
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.carPremiums(adjustedCarRate) + " dollars");
        System.out.println("Here is " +secondPerson.name+ "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate) + secondPerson.carPremiums(adjustedCarRate));

    }

}
