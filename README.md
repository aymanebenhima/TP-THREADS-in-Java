# TP-THREADS-in-Java

```
On souhaite créer une simple application pour mettant en évidence un comportement classique
en programmation multi-threads.
```
1. Écrivez une classe Talkative qui contient un constructeur prenant en paramètre un entier
qui est un attribut de la classe ;
```java
class Talkative {
    private int value;

    public Talkative(int value) {
        this.value = value;
    }
}
```
2. Modifiez votre classe afin qu’elle implémente Runnable ;
```java
class Talkative implements Runnable {
    private int value;

    public Talkative(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        // Code de la méthode run
    }
}
```
3. Redéfinissez la méthode run afin qu’elle affiche 100 fois la valeur de l’attribut contenu
par la classe ;
```java
class Talkative implements Runnable {
    private int value;

    public Talkative(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(value);
        }
    }
}
```
4. Dans une méthode statique main créez 10 instances de la classe Thread. Chacune de ces
instances prendra en paramètre une nouvelle instance d’un objet de type Talkative.
Chacun des objets de type Talkative doit être construit en prenant en paramètre un entier
unique ;
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Talkative talkative = new Talkative(i);
            Thread thread = new Thread(talkative);
            // Code pour démarrer le thread
        }
    }
}
```
6. Appelez la méthode start sur chacun des objets de type Thread qui ont été créé.
   ```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Talkative talkative = new Talkative(i);
            Thread thread = new Thread(talkative);
            thread.start(); // Démarrer le thread
        }
    }
}
```
7. Que constatez-vous ?
   - En exécutant ce programme, vous constaterez que les sorties des différents threads peuvent être entremêlées.
   - Chaque thread affichera la valeur passée dans le constructeur de la classe Talkative 100 fois, mais l'ordre exact et la séquence d'affichage peuvent varier à chaque exécution en raison de la planification des threads par le système d'exploitation.
