package com.MarcoRepoGithub;

public class Main {
    public static void main(String[] args) {

//        Tarea 2

        PatronSingleton singleton = PatronSingleton.getInstance();
        singleton.isHomework();

        PatronSingleton singleton2 = PatronSingleton.getInstance();

        System.out.println("Patron se llama una sola vez: " + singleton);
        System.out.println("Patron se llama una sola vez: " + singleton2);

        /*
        Se comprueba que al llamar a la instancia PatronSingleton, se instancia una sola vez esa clase,
        y aunque se reutilice nuevamente, ocupa el m,ismo espaacio en memoria, pero no se vuelea ejecutar el llamado
         */
    }
}
