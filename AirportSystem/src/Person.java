package airportsystem;
public  abstract class Person {
    private String name;
    
    private String personalId;
    public abstract void salary();

    public Person(String name,  String personalId) {
        this.name = name;
        this.personalId = personalId;
    }
    public String displayInfo(){
    return  name+" "+personalId;
}}
