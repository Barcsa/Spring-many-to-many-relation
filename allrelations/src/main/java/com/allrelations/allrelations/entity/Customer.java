package com.allrelations.allrelations.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Customer(String name){
        this.name = name;
    }
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "customer_item",
                joinColumns = { @JoinColumn(name = "customer_fk")},
                inverseJoinColumns = { @JoinColumn(name = "item_fk") })
    private Set<Item> items = new HashSet<>();

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
