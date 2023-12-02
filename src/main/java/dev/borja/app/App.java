package dev.borja.app;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        Person Paco = new Person("Paco", "Rozada", "Castañon", "39387362X", 1970,"Mexico",'H');
        Person Iris = new Person("Iris", "Crespo", "Aranda", "39383762I", 1980,"France",'M');

        Paco.printAll();
        Iris.printAll();
    }
}
