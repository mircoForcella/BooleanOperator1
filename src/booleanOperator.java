public class booleanOperator {

    /**
     * [A]: 2 <= 2 && !true
     * [B]: !false && 3 > 2
     * [C]: considering that t=false and f=true: !(!t || f)
     * [D]: 6 > 6 ^ !(true && true)
     *
     * Soluzione
     *
     * [A]: 2 è minore uguale a 2 (true)   -  !true equivale a diverso da true, quindi è (false) , True && False  = False
     * [B]:!false significa diverso da false quindi è (true) - 3 è > maggiore di 2, si quindi (true), True && True = True
     * [C]:!(!t || f) indica che il risultato di tutto cioè che è nella parentesi è invertito, quindi se il contenuto è true diventa false e viceversa
     *     t ha valore false ma ha ha anchessi un diverso (!) d'avanti quindi è true, f è true = !(true||true)
     *     successivamente applicando il diverso al di fuori della parentesi diventa = False
     * [D]6 non è > maggiore di 6 (False), (operator XOR) ,  !(true && true) con il diverso come prima esce fuori un False e come risultato finale = False
     *
     * Riassunto
     *
     * [A]: True && False = false
     * [B]: True && True = true
     * [C]: !(true||true) = false
     * [B]: False && False = False
     */
    public static void main(String[] args) {
        boolean a = 2<=2 && !true;
        boolean b = !false && 3 > 2;
        boolean c = !(!false || true);
        boolean d = 6 > 6 ^ !(true && true);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
