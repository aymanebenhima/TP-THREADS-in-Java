public class Main {
    public static void main(String[] args) {

        Talkative talkative1 = new Talkative(10);
        Thread thread1 = new Thread(talkative1);

        Talkative talkative2 = new Talkative(23);
        Thread thread2 = new Thread(talkative2);

        Talkative talkative3 = new Talkative(33);
        Thread thread3 = new Thread(talkative3);

        Talkative talkative4 = new Talkative(43);
        Thread thread4 = new Thread(talkative4);

        Talkative talkative5 = new Talkative(59);
        Thread thread5 = new Thread(talkative5);

        Talkative talkative6 = new Talkative(61);
        Thread thread6 = new Thread(talkative6);

        Talkative talkative7 = new Talkative(78);
        Thread thread7 = new Thread(talkative7);

        Talkative talkative8 = new Talkative(81);
        Thread thread8 = new Thread(talkative8);

        Talkative talkative9 = new Talkative(90);
        Thread thread9 = new Thread(talkative9);

        Talkative talkative10 = new Talkative(70);
        Thread thread10 = new Thread(talkative10);

        //Start All Threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

        //Result
        /* Je constate que le temps d'exécution les 10 threads,
        *  j'obtiens comme résultat le nombre lequel je le donne
        *  en paramètre un entier est répété 100 fois.
        *  Cela signifie que chaque thread effectuera une tâche
        *  en utilisant le nombre qui lui est associé, et que
        *  toutes ces tâches s'exécuteront en parallèle.
        */
    }


}