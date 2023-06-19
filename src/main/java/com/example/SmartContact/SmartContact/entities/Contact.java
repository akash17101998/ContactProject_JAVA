package com.example.SmartContact.SmartContact.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;
    @NotEmpty
    private String Firstname;
    private String secondName;
    private String work;
    private String email;
    @NotEmpty
    private String phone;
    private String cImageUrl;

    @Column(length = 500)
    private String description;

    @ManyToOne
    private User user;

}
