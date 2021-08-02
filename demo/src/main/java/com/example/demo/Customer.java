package com.example.demo;

//importing of annotations to be used
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//means that customer class is JPA entity that can be turned to table in a DB
@Entity
public class Customer {
    @Id //means the id value is objects ID
    @GeneratedValue(strategy = GenerationType.AUTO) //tells JPA that ID should be generated automatically
    //attributes that customer is required
    private Integer id; //wrapper class that helps in converting int to object and vice versa
    private String firstName;
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
