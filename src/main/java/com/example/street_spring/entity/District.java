package com.example.street_spring.entity;

import com.example.street_spring.entity.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "districts")
public class District extends BaseEntity {
    @Id
    private String id;
    private String name;
    @OneToMany(mappedBy = "district")
    private Set<Street> streets;
}
