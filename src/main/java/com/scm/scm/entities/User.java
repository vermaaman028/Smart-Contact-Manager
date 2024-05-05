package com.scm.scm.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Entity(name = "user")
@Table(name = "users") 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
 
    @Id
    private String userId;
    @Column(name = "user_name",nullable = false)
    private String name;

    @Column(unique = true,nullable = false)
    private String email;

    private String password;

    @Column(length = 1000)
    private String about;

    @Column(length = 1000)
    private String profilePic;

    private String phoneNumber;


    // information
    private boolean enabled = false;
    private boolean emailVarified = false;
    private boolean phoneVarified = false;
    
    // user ne signUp kaise kiye like self kiye ya google se ya github se
    private Provider provider = Provider.SELF;
    private String providerUserId ;

    // add more field if needed

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)  //cascade iska mtlb ki agar user delete ho to us ke sare contact delete ho jaye // fetch ka mtlb data base tabi chalega jb uska jarurt hoga
    private List<Contact> contacts = new ArrayList<>();

    
}

