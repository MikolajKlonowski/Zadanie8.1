
public class Test {
    public static void main(String[] args) {
        Animals[] animal = new Animals[5];
        boolean loop;


        for(int i=0; i<animal.length; i++){
            do {
                loop=true;
                System.out.println("Wprowadź dane: " + (i+1) );
                animal[i]= new Animals ();
                for(int j=0; j<animal.length; j++){
                    if (j!=i){
                        if (animal[i].equals(animal[j]))
                            loop=false;
                    }
                }

                if (loop==false)
                    System.out.println("Coś wpisałeś źle");
            } while(!loop);
        }
        for (Animals animals : animal) {
            System.out.println (animals.toString () );

        }

    }
}