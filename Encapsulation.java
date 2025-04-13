public class Person{
    private String name;
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
}
class Encapsulation {
    public static void main(String [] args){
        Person p= new Person();
        p.setName("Rohit");
        System.out.println(p.getName());
    } 
}
