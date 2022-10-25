package com.cydeo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany // when you put this annotation it creates foreign key and if it can't create that creates another table
    @JoinTable(name = "cart_item_rel",
    joinColumns = @JoinColumn(name = "c_id"),
    inverseJoinColumns = @JoinColumn(name = "i_id"))
    private List<Item> itemList;

}