package package_person_homework;

public class PersonHomework {

    String name;
    char gender;
    int age;
    int car;


    boolean violations;
    double creditScore;


    public void display() {
        System.out.println("Customer Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Manufacture Date of Car: " +car);
        System.out.println("Violations: " +violations);
        System.out.println("Credit Score: " +creditScore);

    }

   public double getRate(double monthlyRate) {
    if(violations == true && creditScore <= 700) {
        monthlyRate = 500.00;
    } else {
      monthlyRate = 100.00;
    }

    return monthlyRate;
   }

    public double assumeGender(double adjustedRate) {

        if(gender == 'M' && age <= 25) {
            adjustedRate = 100;
        } else {
            adjustedRate = 0;

        }
        return adjustedRate;
    }

    public double carPremiums( double adjustedCarRate) {

        if(car >= 2018) {
            adjustedCarRate = 200;
        } else {
            adjustedCarRate = 100;
        }
    return adjustedCarRate;
    }

}
