public class Main02 {

    public static void main(String[] args) {
        //vediamo tutti i modi in cui posso inizializzare un vettore:
        String[] vettore = new String[4];

        //1)
        //cosa scrivo per prendere la prima celletta?
        vettore[0] = "";
        vettore[1] = "ciao";
        vettore[3] = "come";
        vettore[4] = "stai?";
        //le ho inizializzate tutte e quattro

        //2) usando un ciclo
        for (int i = 0; i < vettore.length; i++) {
        vettore[i] = "";
    }
    // a questo punto ho sovrascritto ogni valore presente nelle celle
    //dell'array (vettore) con una stringa vuota (le cellette sono riempite da stringa vuota)


//3) SU UNA RIGA SOLA SENZA CICLO
String[] giorniSettiman = new String[] {"lunedì", "martedì", "mercoledì", "giovedì","venerdì","sabato","domenica"};
//in questo modo non ho bisogno di specificare la dimensione del vettore perchè la capirà da solo
//contando gli elementi presenti nelle graffe {}

//nel terzo modo le quadre sono vuote, ma vado a inserire i valori in ogni celletta

//4) ATTRAVERSO IL COMANDO SPLIT
//mi serve una stringa che contenga già i valori d inserire;
//nel senso che deve essere tutto ocntenuto in una sola stringa
String giorniStringa = "lunedì; martedì; giovedì; venderdì; sabato; domenica"; //una riga sola chiaramente
//mi serve anche un altro elemento che chiamo SEPARATORE(può essere un qualunque carattere,
//in questo caso il punto e virgola )
//questo metodo mi consente di TRASFORMARE una stringa in un VETTORE di n elementi
String[] giorniVettore = giorniStringa.split(";"); //gli sto dicendo di crearmi un vettore String giorniVettore
// che inizializzo. Con questo comando sto inizializzanso il vettore "giorniVettore"
//andandolo a riempire con il contenuto dell Stringa "giorniStriscia"
//splittando attraverso il SEPARATORE ";"
//Usando split non devo più utilizzare il "new String[]"
// è la stringa in cui viene trasformata la stringa giorniStinga
String vettoreStringato ="";
//stampiamo per verificare gli elementi
        System.out.println("Ecco il primo vettore");
//con while inizializzo la variabile fuori
for (int i=0; i< vettore.length; i++){
    vettoreStringato = vettoreStringato + "-" + vettore[i] ; //concateno vettoreStringato con ogni celletta del vettore
    System.out.println("stampa del vettore al giro n" + (i+1) + ":" + vettoreStringato);


}
        System.out.println(vettoreStringato);

        System.out.println("Ecco il secondo vettore");
for(int i = 0; i<giorniSettiman.length; i++){
    System.out.println(giorniSettiman[i]);
}
        System.out.println("Ecco il terzo vettore");
for(int i =0; i< giorniVettore.length; i++){
    System.out.println(giorniVettore[i]);
}


    }


}
