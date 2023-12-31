package com.grupo9.blueTicket.models.entities;

import java.util.List;
import java.util.UUID;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(exclude = {"rolePermission", "userRole"})
@NoArgsConstructor
@Entity
@Table(name = "role")
public class Role {
    
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "role")
    private String role;
    
    @OneToMany(mappedBy = "id_role", fetch = FetchType.LAZY)
    private List<Role_permission> rolePermission;
    
    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<User_Role> userRole;
    
}
