import  java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Animals [] animal = new Animals[2];
        animal[0] = new Animals(){};
        animal[1] = new Animals(){};


        for (int i = 0; animal[0].equals(animal[1]); i++) {
            System.out.println("Żle, tworzysz duplikat zwierząt");
            animal[1] = new Animals(){};
        }




        animal[0].printInfo();
        animal[1].printInfo();



    }
}

