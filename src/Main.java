import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*VETTORI:
    insieme di variabili
    Un vettore è un insieme fisso e ordinato di variaibli dello stesso tipo
    QUando inizializzo un vettore specifico due cose: 1. DIMENSIONE (quante variabili può contendere)
    2. TIPO (di variabili che può contendere, può contendere un solo tipo alla volta)
    Queste due caratteristiche non cambieranno mai, dalla nascita alla morte del vettore

    DICHIARO UN VETTORE
    String nominativo; (String è il tipo; nominativo è il nome)
    nominativo = "ciao";
    tipo_variabili nome_vettore;
    */
    String [] nomi;

    /*INIZIALIZZO UN VETTORE
    nome_vettore = new tipo_vettore[dimensione];
    */nomi = new String [5];

    /*andiamo a valorizzare gli elementi:
    nome_vettore [posizione] = valore;*/
    nomi[0] ="Marcangelo";
    nomi[1] = "Pierantonio";
    nomi[2] = "Franceschina";
    nomi [3] = "Teresina";
    nomi [4] = "Carletto";

    // ||0           || 1           || 2    || 3    ||    4 || vettore di dimensione 5
    // || Marcangelo || Pierantonio

    //stampiamo glie lementi del vettore:
        System.out.println(nomi); // se inserisco il nome vettore, non venongo stampati i suooi elementi
        // se voglio stampare gli elementi del vettore dovrò richiamarli uno a uno
        //utilizzando il suo indice
        System.out.println(nomi[0]);
        System.out.println(nomi[1]);
        System.out.println(nomi[2]);
        System.out.println(nomi[3]);
        System.out.println(nomi[4]);
        //oppure
        System.out.println("Elenco dei raga più simpatici: \n" + nomi[0] + "\n" + nomi[3]);


    // siccome è una procedura molto lunga posso velocizzare utlizzando un ciclo
    //(es while)

    //Creiamo un vettore di cui non conosciamo la dimensione
    //quindi posso solo dichiararlo!
        int[] numeri;

    //a questo punto chiede poszione desiderata all'utente:
        Scanner tastiera = new Scanner(System.in);
        int dimensione;
        System.out.println("Inserisci la dimensione del vettore:");
        dimensione = Integer.parseInt(tastiera.nextLine());

        // ora che ho la dimensione posso INIZIALIZZARE il vettore
        numeri = new int[dimensione];

    //ATTENZIONE: se conosco da subito la DIMENSIONE posso fare entrambe le cose (DICHIARARE+INIZIALIZZARE)
    //su una riga sola come per le variabili;
    //int[] numeri = new numeri[dimensione];

    //usiamo un while per scorrere tutti gli elementi del VETTORE:
    //LENGHT---> mi indica la dimensione del vettore ovvero DIMENSIONE = NUMERI.LENGHT

        int indice = 0;
        while(indice < numeri.length){
            System.out.println("Inserisci un numero:");
            numeri[indice]= Integer.parseInt(tastiera.nextLine()); //inserisco ogni numero in una cella
            indice ++;


    } //usando il ciclo while sono sicuro di avere valorizzato tutte l celle
      //del vettore: dalla 0 alla (dimensione -1)
      // ad esempio se ho dimensione = 4---> valorizzo tutte le 4 celle dalla 0 alla 3 (dimensione-1)

        System.out.println("Grazie, inserimento completato!");

    //andiamo a stampare TUTTI i vaori del vettore nell'ordine in cui sono salvati:
    indice =0;
        while (indice < numeri.length){
        System.out.println(numeri[indice]);
        indice ++;
    } //st ostampando i numeri che ho messo nel primo while

        //attraverso il comando "nome_vettore.lenght" io posso dimenticarmi per sempre il vlaore
        //della dimensione del vettore
        //quando





    //Come accedo a quel valore/element odel vettore?
    //uso la sua posizione/il suo indice

    //n Java uso per convenzione il camelcase
    //prima lettera del nome: se variabile-> minuscola; se classe -> maiuscola
    //pria lettera delle altre parole: Maiusola
    //il resto minuscolo
    //esempio variabile: elementoDelVettore;


    }
}