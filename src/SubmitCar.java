import src.EntityNotFoundException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SubmitCar {
    public static void main(String[] args) throws EntityNotFoundException {
        Car carSeat = new Car("seat", "cordoba", 1.6);
        Car carALfaRomeo = new Car("alfa romeo", "gulietta", 1.4);
        Car carFiat = new Car("fiat", "doblo", 1.6);

        System.out.println("enter car mark to search >>> ");
        Scanner console1 = new Scanner(System.in);
        String searchName1 = console1.nextLine();

        Car[] carList = new Car[]{carSeat, carALfaRomeo, carFiat};
        boolean confirmationValue = false;
        for (Car overSearch : carList) {
           // int check = searchName1.compareTo(overSearch.getCarMark());
            // System.out.println(check);
           if (searchName1.equals(overSearch.getCarMark())){confirmationValue = true;
           break;}
        }
        if (confirmationValue){
            System.out.println("we got it!");}
        else{ try {
                    throw new EntityNotFoundException("no match", 4);
        }catch (RuntimeException e){

            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getClass());
                    };
    }
}}



