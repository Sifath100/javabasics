import java.util.*;
import java.io.*;

class Student{
    int age;
    String name;
    
    Student(int age,String name){
        this.age=age;
        this.name=name;
    }
}
class CustomComparator implements Comparator<Student>{
    public int compare(Student o1,Student o2){
        if(o1.age>=o2.age){
            return 1;
        }
        return -1;
    }
}
class Solution{
    public static void main (String[] args) {
        Student[] db=new Student[]{
            new Student(19,"sifath"),new Student(17,"aman"),new Student(21,"kirtesh")
        };
    
    Arrays.sort(db,new CustomComparator());
    for(Student i:db){
        System.out.println(i.age+" "+i.name);
        }
    }
}
