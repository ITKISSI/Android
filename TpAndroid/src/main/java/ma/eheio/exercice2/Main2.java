package ma.eheio.exercice2;

public class Main2 {
    public static void main(String[] args) {
        /*
        System.out.println("Result 1:");
        System.out.println(exercice1.compare(5135));
        System.out.println("==============================");
        System.out.println("Result 2:");
        System.out.println(exercice1.compare(515));
        */

        exercice2 ex = new exercice2("Kissi","Abdelaziz");
        exercice2 ex1 = new exercice2("Meharzi","Meryem");
        exercice2 ex2 = new exercice2("Frikal","Ahmed");
        MyLinkedList<exercice2> exs = new MyLinkedList<>();
        exs.addElement(ex);
        exs.addElement(ex1);
        exs.addElement(ex2);

        exs.showElements();

    }
}