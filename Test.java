/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author SPEED
 */
class Person{
    int a;
    int b;
    Person(int a1,int b1){
        a=a1;
        b=b1;
    }
    static void print(){
        System.out.println("yes");
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.a;
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if(this.a==((Person)obj).a)
            return true; //To change body of generated methods, choose Tools | Templates.
        return false;
    }
    
    void printnonstatic(){
        System.out.println(b);
    }
}
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person.print();       
        Person p=new Person(1,2);
        Person p1=new Person(2,3);
        System.out.println(p.equals(p1));
        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
        
        p.printnonstatic();
    }
    
}
