package com.example.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Department")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "department_name")
    String name;






}
