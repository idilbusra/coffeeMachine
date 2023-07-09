package coffeemachine;

import java.util.Scanner;

public class Options {
    String coffeeType;
    String milk;
    String sugar;
    String size;

    Scanner input = new Scanner(System.in);

    public void coffeeTypeSelect() {
        System.out.println("Which coffee type do you want?");
        System.out.println("Turkish coffee ,Filter coffee,Espresso, Maccihiato");
        coffeeType = input.nextLine().toLowerCase();


        switch (coffeeType){
            case "Turkish Coffee":
                System.out.println("Turkish Coffee preparing");
                milkSelect();
                sugarSelect();
                sizeSelect();
                result();
                break;
            case "Filter Coffee":
                System.out.println("Filter Coffee preparing");
                milkSelect();
                sugarSelect();
                sizeSelect();
                result();
                break;
            case "Espresso":
                System.out.println("Espresso preparing");
                milkSelect();
                sugarSelect();
                sizeSelect();
                result();
                break;
            case "Maccihiato":
                System.out.println("Maccihiato preparing");
                milkSelect();
                sugarSelect();
                sizeSelect();
                result();
                break;
            default:
                System.out.println("Please make a selection ");
        }
    }

    public void milkSelect(){
        System.out.println("Do you want add milk? (Answer yes or no ):    ");
        milk=input.next().toLowerCase();
        switch (milk){
            case "yes":
                System.out.println("Adding milk to your coffee" );
                break;
            case "no":
                System.out.println("No milk added to your coffee" );
        }
    }
    public void sugarSelect(){
        System.out.println("Do you want add sugar? (Answer yes or no ):   ");
        sugar=input.next().toLowerCase();
        if (sugar.equals("yes")){
            System.out.println("Adding sugar to your coffee");
        }
        if (sugar.equals("no")) {
            System.out.println("No sugar added to your coffee");
        }
    }

    public void sizeSelect(){
        System.out.println("Which size do you want?? (Answer Venti or Grande or Tall  ");
        size=input.next().toLowerCase();

        if (size.equalsIgnoreCase("venti ")){
            System.out.println("Your coffee of "+size+ " size is being preparing");
        }else if (size.equalsIgnoreCase("grande")) {
            System.out.println("Your coffee of "+size+ " size is being preparing");
        }else if (size.equalsIgnoreCase("tall")) {
            System.out.println("Your coffee of "+size+ " size is being preparing");
        }

    }
    public void result(){
        System.out.println("Your"+ coffeeType+ " of "+size+ " "  + "size is being prepared Bon appetite!" ) ;

    }
}
















}
