public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Flow!");               //Ez kiir a konzolra egysort, hogy hello!
        //ez egy komment

        /*
        Ez egy
        tobb soros
        komment
         */
        byte small_number = -50;  //tipus - nev = kezdo ertek;
        System.out.println(small_number);

        byte small_Number2;     //tipus-nev;
        small_Number2 = 10;
        System.out.println(small_Number2);

        short number2 = 6000;
        System.out.println(number2);

        int number3 = 350_000;
        System.out.println(number3);

        long number4 = 4_000_000_000l;
        System.out.println(number4);


        //lebego szamok

        float floatNumber1 = 3.56789181321561865168f;
        System.out.println(floatNumber1);

        double doubleNumber = 3.56789181321561865168;
        System.out.println(doubleNumber);

        double bigDouble = 1_000_000.1234657891011;
        double smallDouble = 1.1234567891011;
        System.out.println(bigDouble);
        System.out.println(smallDouble);


        //Logikai adattipus

        boolean isSonnyOutside = true;
        System.out.println(isSonnyOutside);

        boolean notSunnyOutside = false;
        System.out.println(notSunnyOutside);


        //Karakter tipus

        char myFirstChar = 'a';
        System.out.println(myFirstChar);

        String myText = "Text";                     //Karekter lanc
        System.out.println(myText);

        String myOtherText = "Almafa";
        System.out.println(myOtherText);

        String result = (myText + myOtherText);
        System.out.println(result);

        String numberString = (myFirstChar + " ezazamaz");
        System.out.println(numberString);


        //Aritmetikai operator

        int a = 123;
        int b = 50;
        int resulted = a + b;
        System.out.println("a + b = " + resulted);
        resulted = a - b;
        System.out.println("a - b = " + resulted);
        resulted = a * b;
        System.out.println("a * b = " + resulted);
        resulted = a / b;                               //MARADEK NELKULI!!
        System.out.println("a / b = " + resulted);


        //Postfix/Postfix

        int p = 10;
        p++;                                //prefix
        System.out.println("p: " + p);
        ++p;                                //postfix
        System.out.println("p: " + p);
        System.out.println("p pre: " + ++p);
        System.out.println("p post: " + p++);
        System.out.println(p);
        System.out.println(p--);
        System.out.println(--p);


        //osztas

        a = 10;
        b = 3;
//        double b2 = 3;
        double res = (double) a / b;                    //legalabb az egyik vagy mind2 operandus double, maradekos lesz az ossztas.
        System.out.println(res);

        a = 1122;
        byte s = (byte)a;
        System.out.println(" Konvertalt int -> byte " + s);

        byte myAge = 77;
        byte yourAge = 88;

        int ourAge = (byte) (myAge + yourAge);
        System.out.println(ourAge);


//        maradekos osztas

        a = 10;
        b = 3;

        int reminder = a % b;
        res = (double) a / b;
        System.out.println("Hanyados: " + res + " Maradek: " + reminder);

        int base = 2;
        int exponent = 10;
        res = Math.pow(base, exponent); //implicit tipuskonverzio

        long convertedRes = Math.round(res);
        System.out.println("2^10 :" + convertedRes);

        a = 64;
        res = Math.sqrt(a);                             //Gyokvonas
        System.out.println("gyok(64): " + res);


//        Random szam

        double rn = Math.random();
        System.out.println("Veletlen szam: " + rn);

        a = a +10;                      //Az A erteke megnovelve 10el
        a += 10;                        //Szinten megnovelve 10el
        System.out.println("Az a erteke 20-el megnovelve " + a);

        a -= 10;                         //Az A erteke 10el csokkentve
        System.out.println("Az a erteke 10el csokkentve: " + a);

        a /= 10;
        System.out.println("Az a erteke 10el osztva: " + a);

        int num1 = 20;
        int num2 = 3200;

        int sum = num1 + num2;
        System.out.println("A ket szam osszege: " + sum);

        int div  = num1 - num2;
        System.out.println("A ket szam kulonbsege: " + div);

        int multi = num1 * num2;
        System.out.println("A ket szam szorzata: " + multi);

        double divide = num1 / (double)num2;
        System.out.println("A ket szam hanyadosa: " + divide);

        int power = (int) Math.pow(num1, 2);
        System.out.println("Az elso szam negyzete: " + power);


        //homero

        int celsius = 15;
        int kelvin = celsius +273;
        System.out.println("kelvinben a homerseklet: " + kelvin);

        int fahrenheit = celsius * 18 / 10 + 32;
        System.out.println("fahrenheitban a homerseklet: " + fahrenheit);


        int alap = 6;
        double magassag = 8.2;
        double terulet = alap * magassag / 2;
        System.out.println("Haromszog terulete: " + terulet);

        int aOldal = 10;
        int bOldal = 6;

        double atfogo = Math.sqrt(Math.pow(aOldal, 2) + Math.pow(bOldal, 2));
        System.out.println("Átfogó hossza: " + atfogo);

        double kerulet = atfogo + aOldal + bOldal;
        System.out.println("Haromszog kerulete: " + kerulet);

        double terulete = aOldal * bOldal / 2;
        System.out.println("Haromszog terulete: " + terulete);

    }
}

