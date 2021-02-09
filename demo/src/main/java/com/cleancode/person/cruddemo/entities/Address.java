package com.cleancode.person.cruddemo.entities;

import javax.persistence.*;

@Entity
public class Address
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(nullable=false)
    private String city;
    @ManyToOne
    /*@JoinColumn(name=id)*/
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}