package com.MarcoRepoGithub;

public class PatronSingleton {

    private static PatronSingleton patronSingleton;

    boolean homework;


    private PatronSingleton() {}

    public static  PatronSingleton getInstance() {
        if ( patronSingleton == null ) patronSingleton = new PatronSingleton();
        return  patronSingleton;
    }


    public boolean isHomework() {
        return homework;
    }

    public void setHomework(boolean homework) {
        this.homework = homework;
    }
}
