package ma.eheio;

public class exercice1 {

    public static boolean compare(int number)
    {
        int initinalNumber=number;
        int finalNumber=0;

        while(initinalNumber !=0)
        {
            int devidedNumber = initinalNumber % 10;
            finalNumber=finalNumber*10 + devidedNumber;
            initinalNumber =initinalNumber/10;
        }
         return number == finalNumber;
    }
}
