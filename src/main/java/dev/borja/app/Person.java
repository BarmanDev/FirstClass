package dev.borja.app;

public class Person {

    private String name = "";
    private String firstName = "";
    private String lastName = "";
    private String dni = "";
    private int birthYear = 0;
    private String country = "";
    private char gender = 'H';


    public Person(String name, String firstName, String lastName, String dni, int birthYear,String country, char gender){

        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.birthYear = birthYear;
        this.country = country;
        this.gender = gender;
    }

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    public int getBirthYear() {
        return birthYear;
    }



    public String getCountry() {
        return country;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }



    public void setCountry(String country) {
        this.country = country;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printAll(){
        System.out.println("Name " + getName());
        System.out.println("First name " + getFirstName() );
        System.out.println("Last name "   + getLastName());
        System.out.println("DNI " + getDni());
        System.out.println("Birth Year " + getBirthYear());
        System.out.println("country " + getCountry());
        System.out.println("gender " + getGender());
    }


}


