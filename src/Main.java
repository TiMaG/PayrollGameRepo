import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Payroll payroll = new Payroll();

        mainMenu(keyboard, payroll);
    }

    public static void mainMenu(Scanner keyboard, Payroll payroll)
    {
        int userMenu;
        boolean exit = false;


        do
        {
            // show menu
            System.out.println("MAIN MENU");
            System.out.println("1 Input identification number of employee ");
            System.out.println("2 Chek all info ");
            System.out.println("3 Quit");
            System.out.print("Your selection: ");


            userMenu = keyboard.nextInt();

            switch (userMenu)
            {
                case 1:
                {
                    checkInfo(keyboard, payroll);
                    break;

                }

                case 2:
                {
                    getData(keyboard, payroll);
                    break;
                }

                case 3:
                {
                    exit = true;
                    break;
                }

                default:
                {
                    System.out.println("\nInvalid input!\n");
                    break;
                }
            }
        } while (!exit);
    }


    public static void checkInfo(Scanner keyboard, Payroll payroll)
    {

        if(payroll.getWages() == null)
        {
            System.out.println("\nNo data exists!\n");

            mainMenu(keyboard, payroll);
        }

        else
        {
            for(int index = 0; index < 7; index++)
            {

                System.out.println("\nEMPLOYEE " + payroll.getEmpId(index) );
                System.out.println("Hours worked: " + payroll.getHours(index));
                System.out.println("PayRate: $" + payroll.getPayrate(index));
                System.out.println("Gross wages: $" + payroll.getWages(index));
            }
        }

        System.out.println();
    }
    public static void getData(Scanner keyboard, Payroll payroll)
    {
        for (int index = 0; index < 7; index++)
        {
            // Gets data
            System.out.println("\nPayroll.getEmployeeId(index)" );

            do
            {
                System.out.print("Please enter hours worked: ");
                payroll.setHours(index, keyboard.nextInt());

                if(!validHours(payroll.getHours(index)))
                {
                    System.out.println("Invalid input! Numbers should be positive.");
                }
            } while(!validHours(payroll.getHours(index)));

            do
            {
                System.out.print("Please enter pay rate: $");
                payroll.setPayRate(index, keyboard.nextDouble());

                if(!validPayrate(payroll.getPayrate(index)))
                {
                    System.out.println("Invalid input!Numbers should be grater than 6.");
                }
            } while (!validPayrate(payroll.getPayrate(index)));


            payroll.countWages();
        }

        System.out.println();
    }


    public static boolean validHours(int input)
    {
        if(input > 0)
        {
            return true;
        }

        else
        {
            return false;
        }
    }


    public static boolean validPayrate(double input)
    {
        if(input >= 6)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

}
