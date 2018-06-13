import java.sql.SQLOutput;
import java.util.Scanner;

public class Animals implements Action {
    private String name;
    private int amount;

    public Animals() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe: ");
        this.name = sc.nextLine();
        System.out.println("Podaj ilosć");
        this.amount = sc.nextInt();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

//    @Override
//    public void fullFil() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj nazwe");
//        this.name = sc.nextLine();
//        System.out.println("Podaj ilosc");
//        this.amount = sc.nextInt();
//
//    }

    @Override
    public void printInfo() {
        System.out.println("Nazwa zwierzecia " + name + " Ilość: " + amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Animals))
            return false;
        Animals other = (Animals) obj;

        if (!name.equals(other.name))
            return false;
        else return true;

    }


}

